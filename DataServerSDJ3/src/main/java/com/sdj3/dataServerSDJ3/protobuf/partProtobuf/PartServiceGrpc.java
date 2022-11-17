package com.sdj3.dataServerSDJ3.protobuf.partProtobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: Part.proto")
public final class PartServiceGrpc {

  private PartServiceGrpc() {}

  public static final String SERVICE_NAME = "PartService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sdj3.dataServerSDJ3.protobuf.partProtobuf.AddPartMessage,
      com.sdj3.dataServerSDJ3.protobuf.partProtobuf.PartMessage> getCreatPartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "creatPart",
      requestType = com.sdj3.dataServerSDJ3.protobuf.partProtobuf.AddPartMessage.class,
      responseType = com.sdj3.dataServerSDJ3.protobuf.partProtobuf.PartMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.dataServerSDJ3.protobuf.partProtobuf.AddPartMessage,
      com.sdj3.dataServerSDJ3.protobuf.partProtobuf.PartMessage> getCreatPartMethod() {
    io.grpc.MethodDescriptor<com.sdj3.dataServerSDJ3.protobuf.partProtobuf.AddPartMessage, com.sdj3.dataServerSDJ3.protobuf.partProtobuf.PartMessage> getCreatPartMethod;
    if ((getCreatPartMethod = PartServiceGrpc.getCreatPartMethod) == null) {
      synchronized (PartServiceGrpc.class) {
        if ((getCreatPartMethod = PartServiceGrpc.getCreatPartMethod) == null) {
          PartServiceGrpc.getCreatPartMethod = getCreatPartMethod =
              io.grpc.MethodDescriptor.<com.sdj3.dataServerSDJ3.protobuf.partProtobuf.AddPartMessage, com.sdj3.dataServerSDJ3.protobuf.partProtobuf.PartMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "creatPart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.dataServerSDJ3.protobuf.partProtobuf.AddPartMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.dataServerSDJ3.protobuf.partProtobuf.PartMessage.getDefaultInstance()))
              .setSchemaDescriptor(new PartServiceMethodDescriptorSupplier("creatPart"))
              .build();
        }
      }
    }
    return getCreatPartMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PartServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PartServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PartServiceStub>() {
        @java.lang.Override
        public PartServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PartServiceStub(channel, callOptions);
        }
      };
    return PartServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PartServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PartServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PartServiceBlockingStub>() {
        @java.lang.Override
        public PartServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PartServiceBlockingStub(channel, callOptions);
        }
      };
    return PartServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PartServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PartServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PartServiceFutureStub>() {
        @java.lang.Override
        public PartServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PartServiceFutureStub(channel, callOptions);
        }
      };
    return PartServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PartServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void creatPart(com.sdj3.dataServerSDJ3.protobuf.partProtobuf.AddPartMessage request,
        io.grpc.stub.StreamObserver<com.sdj3.dataServerSDJ3.protobuf.partProtobuf.PartMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatPartMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreatPartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.dataServerSDJ3.protobuf.partProtobuf.AddPartMessage,
                com.sdj3.dataServerSDJ3.protobuf.partProtobuf.PartMessage>(
                  this, METHODID_CREAT_PART)))
          .build();
    }
  }

  /**
   */
  public static final class PartServiceStub extends io.grpc.stub.AbstractAsyncStub<PartServiceStub> {
    private PartServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PartServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PartServiceStub(channel, callOptions);
    }

    /**
     */
    public void creatPart(com.sdj3.dataServerSDJ3.protobuf.partProtobuf.AddPartMessage request,
        io.grpc.stub.StreamObserver<com.sdj3.dataServerSDJ3.protobuf.partProtobuf.PartMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatPartMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PartServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PartServiceBlockingStub> {
    private PartServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PartServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PartServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.sdj3.dataServerSDJ3.protobuf.partProtobuf.PartMessage creatPart(com.sdj3.dataServerSDJ3.protobuf.partProtobuf.AddPartMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatPartMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PartServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PartServiceFutureStub> {
    private PartServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PartServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PartServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.dataServerSDJ3.protobuf.partProtobuf.PartMessage> creatPart(
        com.sdj3.dataServerSDJ3.protobuf.partProtobuf.AddPartMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatPartMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREAT_PART = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PartServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PartServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREAT_PART:
          serviceImpl.creatPart((com.sdj3.dataServerSDJ3.protobuf.partProtobuf.AddPartMessage) request,
              (io.grpc.stub.StreamObserver<com.sdj3.dataServerSDJ3.protobuf.partProtobuf.PartMessage>) responseObserver);
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

  private static abstract class PartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PartServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sdj3.dataServerSDJ3.protobuf.partProtobuf.Part.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PartService");
    }
  }

  private static final class PartServiceFileDescriptorSupplier
      extends PartServiceBaseDescriptorSupplier {
    PartServiceFileDescriptorSupplier() {}
  }

  private static final class PartServiceMethodDescriptorSupplier
      extends PartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PartServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PartServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PartServiceFileDescriptorSupplier())
              .addMethod(getCreatPartMethod())
              .build();
        }
      }
    }
    return result;
  }
}
