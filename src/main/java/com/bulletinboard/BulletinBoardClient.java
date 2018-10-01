package com.bulletinboard;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class BulletinBoardClient {
	private static final Logger logger = Logger.getLogger(BulletinBoardClient.class.getName());

	private final ManagedChannel channel;
	private final BulletinBoardGrpc.BulletinBoardBlockingStub blockingStub;

	public BulletinBoardClient(String host, int port){
		this(ManagedChannelBuilder.forAddress(host, port).usePlaintext());
	}
	public BulletinBoardClient(ManagedChannelBuilder<?> channelBuilder) {
		channel = channelBuilder.build();
		blockingStub = BulletinBoardGrpc.newBlockingStub(channel);
	}
	public void shutdown() throws InterruptedException {
		channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	}
	public void getPost(String title){
        Title t = Title.newBuilder().setTitle(title).build();
        Post p;
        try {
            p = blockingStub.getPost(t);
        } catch (StatusRuntimeException e) {
            logger.warning("RPC failed: "+ e.getStatus());
            return;
        }
        if(p.getTitle().length() > 0){
            System.out.println(p.getTitle());
            System.out.println(p.getBody());
        }else{
            System.out.println("No such post found");
        }
    }
    public void makePost(StringTokenizer st){
	    String body = "", title;
	    title = st.nextToken();
	    while(st.hasMoreTokens()){
            body += st.nextToken();
        }
        Post newPost = Post.newBuilder().setTitle(title).setBody(body).build();
        Response r;
        try {
            r = blockingStub.makePost(newPost);
        } catch (StatusRuntimeException e) {
            logger.warning("RPC failed: "+ e.getStatus());
            return;
        }
        System.out.println(r.getRes());
    }
    public void deletePost(String title){
        Title t = Title.newBuilder().setTitle(title).build();
        Response r;
        try {
            r = blockingStub.deletePost(t);
        } catch (StatusRuntimeException e) {
            logger.warning("RPC failed: "+ e.getStatus());
            return;
        }
        System.out.println(r.getRes());
    }
    public void listPosts(){
        Empty e = Empty.newBuilder().build();
        Posts allPosts;
        try {
            allPosts = blockingStub.listPosts(e);
        } catch (StatusRuntimeException sre) {
            logger.warning("RPC failed: "+ sre.getStatus());
            return;
        }
        List<Post> postsList = allPosts.getPostsList();
        if(postsList.size() == 0){
            System.out.println("There are no posts available");
            return;
        }
        for(int i = 0; i < postsList.size();i++){
            System.out.println(i+1+". "+postsList.get(i).getTitle());
        }
    }
	public static void main(String[] args) throws Exception{
		BulletinBoardClient client = new BulletinBoardClient("localhost", 8980);
        while(true){
            Scanner inputReader = new Scanner(System.in);
            System.out.print("Input a command: ");
            String command = inputReader.nextLine();
            if(command.startsWith("post")){
                StringTokenizer st = new StringTokenizer(command);
                st.nextToken();
                client.makePost(st);
            }else if(command.startsWith("get")){
                String[] getDetails = command.split(" ");
                client.getPost(getDetails[1]);
            }else if(command.startsWith("delete")){
                String[] delDetails = command.split(" ");
                client.deletePost(delDetails[1]);
            }else if(command.startsWith("list")){
                client.listPosts();
            }else{
                System.out.println("Command not recognized.");
                break;
            }
        }
        client.shutdown();
	}

}
