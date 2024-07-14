package org.example;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.65.0)",
    comments = "Source: test.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RpcServiceGrpc {

  private RpcServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "RpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.Test.Req,
      org.example.Test.Resp> getSimpleRpcMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SimpleRpc",
      requestType = org.example.Test.Req.class,
      responseType = org.example.Test.Resp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.Test.Req,
      org.example.Test.Resp> getSimpleRpcMethod() {
    io.grpc.MethodDescriptor<org.example.Test.Req, org.example.Test.Resp> getSimpleRpcMethod;
    if ((getSimpleRpcMethod = RpcServiceGrpc.getSimpleRpcMethod) == null) {
      synchronized (RpcServiceGrpc.class) {
        if ((getSimpleRpcMethod = RpcServiceGrpc.getSimpleRpcMethod) == null) {
          RpcServiceGrpc.getSimpleRpcMethod = getSimpleRpcMethod =
              io.grpc.MethodDescriptor.<org.example.Test.Req, org.example.Test.Resp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SimpleRpc"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Test.Req.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Test.Resp.getDefaultInstance()))
              .setSchemaDescriptor(new RpcServiceMethodDescriptorSupplier("SimpleRpc"))
              .build();
        }
      }
    }
    return getSimpleRpcMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.Test.Req,
      org.example.Test.Resp> getClientStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "clientStream",
      requestType = org.example.Test.Req.class,
      responseType = org.example.Test.Resp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.Test.Req,
      org.example.Test.Resp> getClientStreamMethod() {
    io.grpc.MethodDescriptor<org.example.Test.Req, org.example.Test.Resp> getClientStreamMethod;
    if ((getClientStreamMethod = RpcServiceGrpc.getClientStreamMethod) == null) {
      synchronized (RpcServiceGrpc.class) {
        if ((getClientStreamMethod = RpcServiceGrpc.getClientStreamMethod) == null) {
          RpcServiceGrpc.getClientStreamMethod = getClientStreamMethod =
              io.grpc.MethodDescriptor.<org.example.Test.Req, org.example.Test.Resp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "clientStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Test.Req.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Test.Resp.getDefaultInstance()))
              .setSchemaDescriptor(new RpcServiceMethodDescriptorSupplier("clientStream"))
              .build();
        }
      }
    }
    return getClientStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.Test.Req,
      org.example.Test.Resp> getServerStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "serverStream",
      requestType = org.example.Test.Req.class,
      responseType = org.example.Test.Resp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.Test.Req,
      org.example.Test.Resp> getServerStreamMethod() {
    io.grpc.MethodDescriptor<org.example.Test.Req, org.example.Test.Resp> getServerStreamMethod;
    if ((getServerStreamMethod = RpcServiceGrpc.getServerStreamMethod) == null) {
      synchronized (RpcServiceGrpc.class) {
        if ((getServerStreamMethod = RpcServiceGrpc.getServerStreamMethod) == null) {
          RpcServiceGrpc.getServerStreamMethod = getServerStreamMethod =
              io.grpc.MethodDescriptor.<org.example.Test.Req, org.example.Test.Resp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "serverStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Test.Req.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Test.Resp.getDefaultInstance()))
              .setSchemaDescriptor(new RpcServiceMethodDescriptorSupplier("serverStream"))
              .build();
        }
      }
    }
    return getServerStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.Test.Req,
      org.example.Test.Resp> getDoubleStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "doubleStream",
      requestType = org.example.Test.Req.class,
      responseType = org.example.Test.Resp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.Test.Req,
      org.example.Test.Resp> getDoubleStreamMethod() {
    io.grpc.MethodDescriptor<org.example.Test.Req, org.example.Test.Resp> getDoubleStreamMethod;
    if ((getDoubleStreamMethod = RpcServiceGrpc.getDoubleStreamMethod) == null) {
      synchronized (RpcServiceGrpc.class) {
        if ((getDoubleStreamMethod = RpcServiceGrpc.getDoubleStreamMethod) == null) {
          RpcServiceGrpc.getDoubleStreamMethod = getDoubleStreamMethod =
              io.grpc.MethodDescriptor.<org.example.Test.Req, org.example.Test.Resp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "doubleStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Test.Req.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Test.Resp.getDefaultInstance()))
              .setSchemaDescriptor(new RpcServiceMethodDescriptorSupplier("doubleStream"))
              .build();
        }
      }
    }
    return getDoubleStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RpcServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcServiceStub>() {
        @java.lang.Override
        public RpcServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcServiceStub(channel, callOptions);
        }
      };
    return RpcServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcServiceBlockingStub>() {
        @java.lang.Override
        public RpcServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcServiceBlockingStub(channel, callOptions);
        }
      };
    return RpcServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RpcServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RpcServiceFutureStub>() {
        @java.lang.Override
        public RpcServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RpcServiceFutureStub(channel, callOptions);
        }
      };
    return RpcServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void simpleRpc(org.example.Test.Req request,
        io.grpc.stub.StreamObserver<org.example.Test.Resp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSimpleRpcMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<org.example.Test.Req> clientStream(
        io.grpc.stub.StreamObserver<org.example.Test.Resp> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getClientStreamMethod(), responseObserver);
    }

    /**
     */
    default void serverStream(org.example.Test.Req request,
        io.grpc.stub.StreamObserver<org.example.Test.Resp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getServerStreamMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<org.example.Test.Req> doubleStream(
        io.grpc.stub.StreamObserver<org.example.Test.Resp> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getDoubleStreamMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service RpcService.
   */
  public static abstract class RpcServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return RpcServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service RpcService.
   */
  public static final class RpcServiceStub
      extends io.grpc.stub.AbstractAsyncStub<RpcServiceStub> {
    private RpcServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void simpleRpc(org.example.Test.Req request,
        io.grpc.stub.StreamObserver<org.example.Test.Resp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSimpleRpcMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.example.Test.Req> clientStream(
        io.grpc.stub.StreamObserver<org.example.Test.Resp> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getClientStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void serverStream(org.example.Test.Req request,
        io.grpc.stub.StreamObserver<org.example.Test.Resp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getServerStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.example.Test.Req> doubleStream(
        io.grpc.stub.StreamObserver<org.example.Test.Resp> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getDoubleStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service RpcService.
   */
  public static final class RpcServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RpcServiceBlockingStub> {
    private RpcServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.Test.Resp simpleRpc(org.example.Test.Req request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSimpleRpcMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.example.Test.Resp> serverStream(
        org.example.Test.Req request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getServerStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service RpcService.
   */
  public static final class RpcServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<RpcServiceFutureStub> {
    private RpcServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RpcServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.Test.Resp> simpleRpc(
        org.example.Test.Req request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSimpleRpcMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SIMPLE_RPC = 0;
  private static final int METHODID_SERVER_STREAM = 1;
  private static final int METHODID_CLIENT_STREAM = 2;
  private static final int METHODID_DOUBLE_STREAM = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SIMPLE_RPC:
          serviceImpl.simpleRpc((org.example.Test.Req) request,
              (io.grpc.stub.StreamObserver<org.example.Test.Resp>) responseObserver);
          break;
        case METHODID_SERVER_STREAM:
          serviceImpl.serverStream((org.example.Test.Req) request,
              (io.grpc.stub.StreamObserver<org.example.Test.Resp>) responseObserver);
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
        case METHODID_CLIENT_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.clientStream(
              (io.grpc.stub.StreamObserver<org.example.Test.Resp>) responseObserver);
        case METHODID_DOUBLE_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.doubleStream(
              (io.grpc.stub.StreamObserver<org.example.Test.Resp>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSimpleRpcMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.Test.Req,
              org.example.Test.Resp>(
                service, METHODID_SIMPLE_RPC)))
        .addMethod(
          getClientStreamMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              org.example.Test.Req,
              org.example.Test.Resp>(
                service, METHODID_CLIENT_STREAM)))
        .addMethod(
          getServerStreamMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              org.example.Test.Req,
              org.example.Test.Resp>(
                service, METHODID_SERVER_STREAM)))
        .addMethod(
          getDoubleStreamMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              org.example.Test.Req,
              org.example.Test.Resp>(
                service, METHODID_DOUBLE_STREAM)))
        .build();
  }

  private static abstract class RpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.Test.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RpcService");
    }
  }

  private static final class RpcServiceFileDescriptorSupplier
      extends RpcServiceBaseDescriptorSupplier {
    RpcServiceFileDescriptorSupplier() {}
  }

  private static final class RpcServiceMethodDescriptorSupplier
      extends RpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    RpcServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (RpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RpcServiceFileDescriptorSupplier())
              .addMethod(getSimpleRpcMethod())
              .addMethod(getClientStreamMethod())
              .addMethod(getServerStreamMethod())
              .addMethod(getDoubleStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
