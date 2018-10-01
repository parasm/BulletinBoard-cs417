package com.bulletinboard;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Implement Proto File Here
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: BulletinBoard.proto")
public final class BulletinBoardGrpc {

  private BulletinBoardGrpc() {}

  public static final String SERVICE_NAME = "com.bulletinboard.BulletinBoard";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.bulletinboard.Title,
      com.bulletinboard.Post> getGetPostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPost",
      requestType = com.bulletinboard.Title.class,
      responseType = com.bulletinboard.Post.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bulletinboard.Title,
      com.bulletinboard.Post> getGetPostMethod() {
    io.grpc.MethodDescriptor<com.bulletinboard.Title, com.bulletinboard.Post> getGetPostMethod;
    if ((getGetPostMethod = BulletinBoardGrpc.getGetPostMethod) == null) {
      synchronized (BulletinBoardGrpc.class) {
        if ((getGetPostMethod = BulletinBoardGrpc.getGetPostMethod) == null) {
          BulletinBoardGrpc.getGetPostMethod = getGetPostMethod = 
              io.grpc.MethodDescriptor.<com.bulletinboard.Title, com.bulletinboard.Post>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.bulletinboard.BulletinBoard", "GetPost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bulletinboard.Title.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bulletinboard.Post.getDefaultInstance()))
                  .setSchemaDescriptor(new BulletinBoardMethodDescriptorSupplier("GetPost"))
                  .build();
          }
        }
     }
     return getGetPostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bulletinboard.Post,
      com.bulletinboard.Response> getMakePostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MakePost",
      requestType = com.bulletinboard.Post.class,
      responseType = com.bulletinboard.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bulletinboard.Post,
      com.bulletinboard.Response> getMakePostMethod() {
    io.grpc.MethodDescriptor<com.bulletinboard.Post, com.bulletinboard.Response> getMakePostMethod;
    if ((getMakePostMethod = BulletinBoardGrpc.getMakePostMethod) == null) {
      synchronized (BulletinBoardGrpc.class) {
        if ((getMakePostMethod = BulletinBoardGrpc.getMakePostMethod) == null) {
          BulletinBoardGrpc.getMakePostMethod = getMakePostMethod = 
              io.grpc.MethodDescriptor.<com.bulletinboard.Post, com.bulletinboard.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.bulletinboard.BulletinBoard", "MakePost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bulletinboard.Post.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bulletinboard.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new BulletinBoardMethodDescriptorSupplier("MakePost"))
                  .build();
          }
        }
     }
     return getMakePostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bulletinboard.Title,
      com.bulletinboard.Response> getDeletePostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePost",
      requestType = com.bulletinboard.Title.class,
      responseType = com.bulletinboard.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bulletinboard.Title,
      com.bulletinboard.Response> getDeletePostMethod() {
    io.grpc.MethodDescriptor<com.bulletinboard.Title, com.bulletinboard.Response> getDeletePostMethod;
    if ((getDeletePostMethod = BulletinBoardGrpc.getDeletePostMethod) == null) {
      synchronized (BulletinBoardGrpc.class) {
        if ((getDeletePostMethod = BulletinBoardGrpc.getDeletePostMethod) == null) {
          BulletinBoardGrpc.getDeletePostMethod = getDeletePostMethod = 
              io.grpc.MethodDescriptor.<com.bulletinboard.Title, com.bulletinboard.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.bulletinboard.BulletinBoard", "DeletePost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bulletinboard.Title.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bulletinboard.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new BulletinBoardMethodDescriptorSupplier("DeletePost"))
                  .build();
          }
        }
     }
     return getDeletePostMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bulletinboard.Empty,
      com.bulletinboard.Posts> getListPostsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPosts",
      requestType = com.bulletinboard.Empty.class,
      responseType = com.bulletinboard.Posts.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bulletinboard.Empty,
      com.bulletinboard.Posts> getListPostsMethod() {
    io.grpc.MethodDescriptor<com.bulletinboard.Empty, com.bulletinboard.Posts> getListPostsMethod;
    if ((getListPostsMethod = BulletinBoardGrpc.getListPostsMethod) == null) {
      synchronized (BulletinBoardGrpc.class) {
        if ((getListPostsMethod = BulletinBoardGrpc.getListPostsMethod) == null) {
          BulletinBoardGrpc.getListPostsMethod = getListPostsMethod = 
              io.grpc.MethodDescriptor.<com.bulletinboard.Empty, com.bulletinboard.Posts>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.bulletinboard.BulletinBoard", "ListPosts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bulletinboard.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bulletinboard.Posts.getDefaultInstance()))
                  .setSchemaDescriptor(new BulletinBoardMethodDescriptorSupplier("ListPosts"))
                  .build();
          }
        }
     }
     return getListPostsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BulletinBoardStub newStub(io.grpc.Channel channel) {
    return new BulletinBoardStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BulletinBoardBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BulletinBoardBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BulletinBoardFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BulletinBoardFutureStub(channel);
  }

  /**
   * <pre>
   * Implement Proto File Here
   * </pre>
   */
  public static abstract class BulletinBoardImplBase implements io.grpc.BindableService {

    /**
     */
    public void getPost(com.bulletinboard.Title request,
        io.grpc.stub.StreamObserver<com.bulletinboard.Post> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPostMethod(), responseObserver);
    }

    /**
     */
    public void makePost(com.bulletinboard.Post request,
        io.grpc.stub.StreamObserver<com.bulletinboard.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getMakePostMethod(), responseObserver);
    }

    /**
     */
    public void deletePost(com.bulletinboard.Title request,
        io.grpc.stub.StreamObserver<com.bulletinboard.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getDeletePostMethod(), responseObserver);
    }

    /**
     */
    public void listPosts(com.bulletinboard.Empty request,
        io.grpc.stub.StreamObserver<com.bulletinboard.Posts> responseObserver) {
      asyncUnimplementedUnaryCall(getListPostsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetPostMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bulletinboard.Title,
                com.bulletinboard.Post>(
                  this, METHODID_GET_POST)))
          .addMethod(
            getMakePostMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bulletinboard.Post,
                com.bulletinboard.Response>(
                  this, METHODID_MAKE_POST)))
          .addMethod(
            getDeletePostMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bulletinboard.Title,
                com.bulletinboard.Response>(
                  this, METHODID_DELETE_POST)))
          .addMethod(
            getListPostsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bulletinboard.Empty,
                com.bulletinboard.Posts>(
                  this, METHODID_LIST_POSTS)))
          .build();
    }
  }

  /**
   * <pre>
   * Implement Proto File Here
   * </pre>
   */
  public static final class BulletinBoardStub extends io.grpc.stub.AbstractStub<BulletinBoardStub> {
    private BulletinBoardStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BulletinBoardStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BulletinBoardStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BulletinBoardStub(channel, callOptions);
    }

    /**
     */
    public void getPost(com.bulletinboard.Title request,
        io.grpc.stub.StreamObserver<com.bulletinboard.Post> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void makePost(com.bulletinboard.Post request,
        io.grpc.stub.StreamObserver<com.bulletinboard.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMakePostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePost(com.bulletinboard.Title request,
        io.grpc.stub.StreamObserver<com.bulletinboard.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeletePostMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listPosts(com.bulletinboard.Empty request,
        io.grpc.stub.StreamObserver<com.bulletinboard.Posts> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListPostsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Implement Proto File Here
   * </pre>
   */
  public static final class BulletinBoardBlockingStub extends io.grpc.stub.AbstractStub<BulletinBoardBlockingStub> {
    private BulletinBoardBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BulletinBoardBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BulletinBoardBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BulletinBoardBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.bulletinboard.Post getPost(com.bulletinboard.Title request) {
      return blockingUnaryCall(
          getChannel(), getGetPostMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bulletinboard.Response makePost(com.bulletinboard.Post request) {
      return blockingUnaryCall(
          getChannel(), getMakePostMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bulletinboard.Response deletePost(com.bulletinboard.Title request) {
      return blockingUnaryCall(
          getChannel(), getDeletePostMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.bulletinboard.Posts listPosts(com.bulletinboard.Empty request) {
      return blockingUnaryCall(
          getChannel(), getListPostsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Implement Proto File Here
   * </pre>
   */
  public static final class BulletinBoardFutureStub extends io.grpc.stub.AbstractStub<BulletinBoardFutureStub> {
    private BulletinBoardFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BulletinBoardFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BulletinBoardFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BulletinBoardFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bulletinboard.Post> getPost(
        com.bulletinboard.Title request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bulletinboard.Response> makePost(
        com.bulletinboard.Post request) {
      return futureUnaryCall(
          getChannel().newCall(getMakePostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bulletinboard.Response> deletePost(
        com.bulletinboard.Title request) {
      return futureUnaryCall(
          getChannel().newCall(getDeletePostMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bulletinboard.Posts> listPosts(
        com.bulletinboard.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getListPostsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_POST = 0;
  private static final int METHODID_MAKE_POST = 1;
  private static final int METHODID_DELETE_POST = 2;
  private static final int METHODID_LIST_POSTS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BulletinBoardImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BulletinBoardImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_POST:
          serviceImpl.getPost((com.bulletinboard.Title) request,
              (io.grpc.stub.StreamObserver<com.bulletinboard.Post>) responseObserver);
          break;
        case METHODID_MAKE_POST:
          serviceImpl.makePost((com.bulletinboard.Post) request,
              (io.grpc.stub.StreamObserver<com.bulletinboard.Response>) responseObserver);
          break;
        case METHODID_DELETE_POST:
          serviceImpl.deletePost((com.bulletinboard.Title) request,
              (io.grpc.stub.StreamObserver<com.bulletinboard.Response>) responseObserver);
          break;
        case METHODID_LIST_POSTS:
          serviceImpl.listPosts((com.bulletinboard.Empty) request,
              (io.grpc.stub.StreamObserver<com.bulletinboard.Posts>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BulletinBoardBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BulletinBoardBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.bulletinboard.BulletinBoardOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BulletinBoard");
    }
  }

  private static final class BulletinBoardFileDescriptorSupplier
      extends BulletinBoardBaseDescriptorSupplier {
    BulletinBoardFileDescriptorSupplier() {}
  }

  private static final class BulletinBoardMethodDescriptorSupplier
      extends BulletinBoardBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BulletinBoardMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BulletinBoardGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BulletinBoardFileDescriptorSupplier())
              .addMethod(getGetPostMethod())
              .addMethod(getMakePostMethod())
              .addMethod(getDeletePostMethod())
              .addMethod(getListPostsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
