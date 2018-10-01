package com.bulletinboard;

import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

public class BulletinBoardService extends BulletinBoardGrpc.BulletinBoardImplBase {
    private static final Logger logger = Logger.getLogger(BulletinBoardService.class.getName());
    ConcurrentHashMap<String, Post> board;

    public BulletinBoardService() {
        this.board  = new ConcurrentHashMap<String, Post>();
    }
    @Override
    public void getPost(Title reqTitle, StreamObserver<Post> responseObserver) {
        Post post = board.get(reqTitle.getTitle());
        if(post != null){
            logger.info("Post with title "+ reqTitle.getTitle() +" retrieved.");
            responseObserver.onNext(post);
        }else{
            logger.info("Post with title "+ reqTitle.getTitle() +" not found.");
            responseObserver.onNext(Post.newBuilder().setBody("").setTitle("").build());
        }
        responseObserver.onCompleted();
    }
    @Override
    public void makePost(Post newPost, StreamObserver<Response> responseObserver) {
        String postTitle = newPost.getTitle();
        Response res;
        if(board.containsKey(postTitle)){
            logger.info("Cannot create post, title '"+ postTitle +"' already used.");
            res = Response.newBuilder().setRes("Error: Already have post with this title!").build();
        }else{
            board.put(newPost.getTitle(),newPost);
            logger.info("Posting post with title '"+newPost.getTitle()+"' and body '"+newPost.getBody()+"'");
            res = Response.newBuilder().setRes("Post saved.").build();
        }
        responseObserver.onNext(res);
        responseObserver.onCompleted();
    }
    @Override
    public void deletePost(Title reqTitle, StreamObserver<Response> responseObserver) {
        String postTitle = reqTitle.getTitle();
        Response res;
        if(!board.containsKey(postTitle)){
            logger.info("Error: No post with this title!");
            res = Response.newBuilder().setRes("Error: No post with this title!").build();
        }else{
            board.remove(postTitle);
            logger.info("Post deleted.");
            res = Response.newBuilder().setRes("Post deleted.").build();
        }
        responseObserver.onNext(res);
        responseObserver.onCompleted();
    }
    @Override
    public void listPosts(Empty e, StreamObserver<Posts> responseObserver) {
        Posts.Builder allPosts = Posts.newBuilder();
        for(Map.Entry<String, Post> entry: board.entrySet()){
            allPosts.addPosts(entry.getValue());
        }
        responseObserver.onNext(allPosts.build());
        responseObserver.onCompleted();
    }
}
