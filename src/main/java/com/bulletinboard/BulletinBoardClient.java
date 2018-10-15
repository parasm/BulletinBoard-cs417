package com.bulletinboard;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BulletinBoardClient {
	private static final Logger logger = Logger.getLogger(BulletinBoardClient.class.getName());

	private final ManagedChannel channel;
	private final BulletinBoardGrpc.BulletinBoardBlockingStub blockingStub;
    private Pattern tokenizer = Pattern.compile("([^\"]\\S*|\".+?\")\\s*");

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
	private List<String> getTokens(String command){
        List<String> tokens = new ArrayList<String>();
        Matcher m = tokenizer.matcher(command);
        while(m.find()){
            tokens.add(m.group(1).replace("\"",""));
        }
        return tokens;
    }
	public void getPost(String command){
        Post p;
        List<String> tokens = getTokens(command);
        if(tokens.size() < 2){
            System.out.println("Please enter title of post to get in quotes");
            return;
        }
        Title t = Title.newBuilder().setTitle(tokens.get(1)).build();
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
    public void makePost(String command){
        List<String> tokens = getTokens(command);
        if(tokens.size() < 3){
            System.out.println("Please provide title and body in quotes.");
            return;
        }
	    String body = tokens.get(2), title = tokens.get(1);
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
    public void deletePost(String command){
        Response d;
        List<String> tokens = getTokens(command);
        if(tokens.size() < 2){
            System.out.println("Please enter title of post to delete in quotes");
            return;
        }
        Title t = Title.newBuilder().setTitle(tokens.get(1)).build();
        try {
            d = blockingStub.deletePost(t);
        } catch (StatusRuntimeException e) {
            logger.warning("RPC failed: "+ e.getStatus());
            return;
        }
        System.out.println(d.getRes());
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
        Scanner inputReader = new Scanner(System.in);
		while(true){
            System.out.print("Input a command (type quit to exit): ");
            String command = inputReader.nextLine();
            if(command.startsWith("post")){
                client.makePost(command);
            }else if(command.startsWith("get")){
                client.getPost(command);
            }else if(command.startsWith("delete")){
                client.deletePost(command);
            }else if(command.startsWith("list")){
                client.listPosts();
            }else if(command.startsWith("quit")){
                System.out.println("Client exited.");
                break;
            }
            else{
                System.out.println("Command not recognized.");
            }
        }
        inputReader.close();
        client.shutdown();
	}

}
