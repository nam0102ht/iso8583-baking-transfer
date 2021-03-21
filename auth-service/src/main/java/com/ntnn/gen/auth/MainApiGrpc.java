package com.ntnn.gen.auth;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: protoApi.proto")
public final class MainApiGrpc {

  private MainApiGrpc() {}

  public static final String SERVICE_NAME = "com.ntnn.gen.AliceToBob.MainApi";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.ntnn.gen.auth.Request,
      com.ntnn.gen.auth.Response> METHOD_AUTHENTICATE =
      io.grpc.MethodDescriptor.<com.ntnn.gen.auth.Request, com.ntnn.gen.auth.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.ntnn.gen.AliceToBob.MainApi", "authenticate"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.ntnn.gen.auth.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.ntnn.gen.auth.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.ntnn.gen.auth.Request,
      com.ntnn.gen.auth.Response> METHOD_RETRIEVE =
      io.grpc.MethodDescriptor.<com.ntnn.gen.auth.Request, com.ntnn.gen.auth.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.ntnn.gen.AliceToBob.MainApi", "retrieve"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.ntnn.gen.auth.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.ntnn.gen.auth.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.ntnn.gen.auth.Request,
      com.ntnn.gen.auth.Response> METHOD_GET_PROFILE =
      io.grpc.MethodDescriptor.<com.ntnn.gen.auth.Request, com.ntnn.gen.auth.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.ntnn.gen.AliceToBob.MainApi", "getProfile"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.ntnn.gen.auth.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.ntnn.gen.auth.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.ntnn.gen.auth.Request,
      com.ntnn.gen.auth.Response> METHOD_RESET_PIN =
      io.grpc.MethodDescriptor.<com.ntnn.gen.auth.Request, com.ntnn.gen.auth.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.ntnn.gen.AliceToBob.MainApi", "resetPin"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.ntnn.gen.auth.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.ntnn.gen.auth.Response.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MainApiStub newStub(io.grpc.Channel channel) {
    return new MainApiStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MainApiBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MainApiBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MainApiFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MainApiFutureStub(channel);
  }

  /**
   */
  public static abstract class MainApiImplBase implements io.grpc.BindableService {

    /**
     */
    public void authenticate(com.ntnn.gen.auth.Request request,
        io.grpc.stub.StreamObserver<com.ntnn.gen.auth.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_AUTHENTICATE, responseObserver);
    }

    /**
     */
    public void retrieve(com.ntnn.gen.auth.Request request,
        io.grpc.stub.StreamObserver<com.ntnn.gen.auth.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RETRIEVE, responseObserver);
    }

    /**
     */
    public void getProfile(com.ntnn.gen.auth.Request request,
        io.grpc.stub.StreamObserver<com.ntnn.gen.auth.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_PROFILE, responseObserver);
    }

    /**
     */
    public void resetPin(com.ntnn.gen.auth.Request request,
        io.grpc.stub.StreamObserver<com.ntnn.gen.auth.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RESET_PIN, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_AUTHENTICATE,
            asyncUnaryCall(
              new MethodHandlers<
                com.ntnn.gen.auth.Request,
                com.ntnn.gen.auth.Response>(
                  this, METHODID_AUTHENTICATE)))
          .addMethod(
            METHOD_RETRIEVE,
            asyncUnaryCall(
              new MethodHandlers<
                com.ntnn.gen.auth.Request,
                com.ntnn.gen.auth.Response>(
                  this, METHODID_RETRIEVE)))
          .addMethod(
            METHOD_GET_PROFILE,
            asyncUnaryCall(
              new MethodHandlers<
                com.ntnn.gen.auth.Request,
                com.ntnn.gen.auth.Response>(
                  this, METHODID_GET_PROFILE)))
          .addMethod(
            METHOD_RESET_PIN,
            asyncUnaryCall(
              new MethodHandlers<
                com.ntnn.gen.auth.Request,
                com.ntnn.gen.auth.Response>(
                  this, METHODID_RESET_PIN)))
          .build();
    }
  }

  /**
   */
  public static final class MainApiStub extends io.grpc.stub.AbstractStub<MainApiStub> {
    private MainApiStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MainApiStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MainApiStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MainApiStub(channel, callOptions);
    }

    /**
     */
    public void authenticate(com.ntnn.gen.auth.Request request,
        io.grpc.stub.StreamObserver<com.ntnn.gen.auth.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_AUTHENTICATE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void retrieve(com.ntnn.gen.auth.Request request,
        io.grpc.stub.StreamObserver<com.ntnn.gen.auth.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RETRIEVE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProfile(com.ntnn.gen.auth.Request request,
        io.grpc.stub.StreamObserver<com.ntnn.gen.auth.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_PROFILE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void resetPin(com.ntnn.gen.auth.Request request,
        io.grpc.stub.StreamObserver<com.ntnn.gen.auth.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RESET_PIN, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MainApiBlockingStub extends io.grpc.stub.AbstractStub<MainApiBlockingStub> {
    private MainApiBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MainApiBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MainApiBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MainApiBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.ntnn.gen.auth.Response authenticate(com.ntnn.gen.auth.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_AUTHENTICATE, getCallOptions(), request);
    }

    /**
     */
    public com.ntnn.gen.auth.Response retrieve(com.ntnn.gen.auth.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RETRIEVE, getCallOptions(), request);
    }

    /**
     */
    public com.ntnn.gen.auth.Response getProfile(com.ntnn.gen.auth.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_PROFILE, getCallOptions(), request);
    }

    /**
     */
    public com.ntnn.gen.auth.Response resetPin(com.ntnn.gen.auth.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RESET_PIN, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MainApiFutureStub extends io.grpc.stub.AbstractStub<MainApiFutureStub> {
    private MainApiFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MainApiFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MainApiFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MainApiFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ntnn.gen.auth.Response> authenticate(
        com.ntnn.gen.auth.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_AUTHENTICATE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ntnn.gen.auth.Response> retrieve(
        com.ntnn.gen.auth.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RETRIEVE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ntnn.gen.auth.Response> getProfile(
        com.ntnn.gen.auth.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_PROFILE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ntnn.gen.auth.Response> resetPin(
        com.ntnn.gen.auth.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RESET_PIN, getCallOptions()), request);
    }
  }

  private static final int METHODID_AUTHENTICATE = 0;
  private static final int METHODID_RETRIEVE = 1;
  private static final int METHODID_GET_PROFILE = 2;
  private static final int METHODID_RESET_PIN = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MainApiImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MainApiImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AUTHENTICATE:
          serviceImpl.authenticate((com.ntnn.gen.auth.Request) request,
              (io.grpc.stub.StreamObserver<com.ntnn.gen.auth.Response>) responseObserver);
          break;
        case METHODID_RETRIEVE:
          serviceImpl.retrieve((com.ntnn.gen.auth.Request) request,
              (io.grpc.stub.StreamObserver<com.ntnn.gen.auth.Response>) responseObserver);
          break;
        case METHODID_GET_PROFILE:
          serviceImpl.getProfile((com.ntnn.gen.auth.Request) request,
              (io.grpc.stub.StreamObserver<com.ntnn.gen.auth.Response>) responseObserver);
          break;
        case METHODID_RESET_PIN:
          serviceImpl.resetPin((com.ntnn.gen.auth.Request) request,
              (io.grpc.stub.StreamObserver<com.ntnn.gen.auth.Response>) responseObserver);
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

  private static final class MainApiDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ntnn.gen.auth.ProtoApi.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MainApiGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MainApiDescriptorSupplier())
              .addMethod(METHOD_AUTHENTICATE)
              .addMethod(METHOD_RETRIEVE)
              .addMethod(METHOD_GET_PROFILE)
              .addMethod(METHOD_RESET_PIN)
              .build();
        }
      }
    }
    return result;
  }
}
