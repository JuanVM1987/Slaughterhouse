package com.sdj3.dataServerSDJ3.protobuf.animalProtobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: Animal.proto")
public final class AnimalServiceGrpc {

  private AnimalServiceGrpc() {}

  public static final String SERVICE_NAME = "AnimalService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.ProductMessage,
      com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.ListAnimals> getGetAnimalFromProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAnimalFromProduct",
      requestType = com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.ProductMessage.class,
      responseType = com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.ListAnimals.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.ProductMessage,
      com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.ListAnimals> getGetAnimalFromProductMethod() {
    io.grpc.MethodDescriptor<com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.ProductMessage, com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.ListAnimals> getGetAnimalFromProductMethod;
    if ((getGetAnimalFromProductMethod = AnimalServiceGrpc.getGetAnimalFromProductMethod) == null) {
      synchronized (AnimalServiceGrpc.class) {
        if ((getGetAnimalFromProductMethod = AnimalServiceGrpc.getGetAnimalFromProductMethod) == null) {
          AnimalServiceGrpc.getGetAnimalFromProductMethod = getGetAnimalFromProductMethod =
              io.grpc.MethodDescriptor.<com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.ProductMessage, com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.ListAnimals>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAnimalFromProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.ProductMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.ListAnimals.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalServiceMethodDescriptorSupplier("getAnimalFromProduct"))
              .build();
        }
      }
    }
    return getGetAnimalFromProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.EmptyMessage,
      com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.ListAnimals> getGetAllAnimalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllAnimals",
      requestType = com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.EmptyMessage.class,
      responseType = com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.ListAnimals.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.EmptyMessage,
      com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.ListAnimals> getGetAllAnimalsMethod() {
    io.grpc.MethodDescriptor<com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.EmptyMessage, com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.ListAnimals> getGetAllAnimalsMethod;
    if ((getGetAllAnimalsMethod = AnimalServiceGrpc.getGetAllAnimalsMethod) == null) {
      synchronized (AnimalServiceGrpc.class) {
        if ((getGetAllAnimalsMethod = AnimalServiceGrpc.getGetAllAnimalsMethod) == null) {
          AnimalServiceGrpc.getGetAllAnimalsMethod = getGetAllAnimalsMethod =
              io.grpc.MethodDescriptor.<com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.EmptyMessage, com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.ListAnimals>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllAnimals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.EmptyMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.ListAnimals.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalServiceMethodDescriptorSupplier("getAllAnimals"))
              .build();
        }
      }
    }
    return getGetAllAnimalsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.AnimalIdMessage,
      com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.AnimalMessage> getGetAnimalByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAnimalById",
      requestType = com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.AnimalIdMessage.class,
      responseType = com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.AnimalMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.AnimalIdMessage,
      com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.AnimalMessage> getGetAnimalByIdMethod() {
    io.grpc.MethodDescriptor<com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.AnimalIdMessage, com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.AnimalMessage> getGetAnimalByIdMethod;
    if ((getGetAnimalByIdMethod = AnimalServiceGrpc.getGetAnimalByIdMethod) == null) {
      synchronized (AnimalServiceGrpc.class) {
        if ((getGetAnimalByIdMethod = AnimalServiceGrpc.getGetAnimalByIdMethod) == null) {
          AnimalServiceGrpc.getGetAnimalByIdMethod = getGetAnimalByIdMethod =
              io.grpc.MethodDescriptor.<com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.AnimalIdMessage, com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.AnimalMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAnimalById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.AnimalIdMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.AnimalMessage.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalServiceMethodDescriptorSupplier("getAnimalById"))
              .build();
        }
      }
    }
    return getGetAnimalByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.RegisterAnimalMessage,
      com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.AnimalMessage> getRegisterAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "registerAnimal",
      requestType = com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.RegisterAnimalMessage.class,
      responseType = com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.AnimalMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.RegisterAnimalMessage,
      com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.AnimalMessage> getRegisterAnimalMethod() {
    io.grpc.MethodDescriptor<com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.RegisterAnimalMessage, com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.AnimalMessage> getRegisterAnimalMethod;
    if ((getRegisterAnimalMethod = AnimalServiceGrpc.getRegisterAnimalMethod) == null) {
      synchronized (AnimalServiceGrpc.class) {
        if ((getRegisterAnimalMethod = AnimalServiceGrpc.getRegisterAnimalMethod) == null) {
          AnimalServiceGrpc.getRegisterAnimalMethod = getRegisterAnimalMethod =
              io.grpc.MethodDescriptor.<com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.RegisterAnimalMessage, com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.AnimalMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "registerAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.RegisterAnimalMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.AnimalMessage.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalServiceMethodDescriptorSupplier("registerAnimal"))
              .build();
        }
      }
    }
    return getRegisterAnimalMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AnimalServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalServiceStub>() {
        @java.lang.Override
        public AnimalServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalServiceStub(channel, callOptions);
        }
      };
    return AnimalServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AnimalServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalServiceBlockingStub>() {
        @java.lang.Override
        public AnimalServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalServiceBlockingStub(channel, callOptions);
        }
      };
    return AnimalServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AnimalServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalServiceFutureStub>() {
        @java.lang.Override
        public AnimalServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalServiceFutureStub(channel, callOptions);
        }
      };
    return AnimalServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AnimalServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAnimalFromProduct(com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.ProductMessage request,
        io.grpc.stub.StreamObserver<com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.ListAnimals> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnimalFromProductMethod(), responseObserver);
    }

    /**
     */
    public void getAllAnimals(com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.EmptyMessage request,
        io.grpc.stub.StreamObserver<com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.ListAnimals> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllAnimalsMethod(), responseObserver);
    }

    /**
     */
    public void getAnimalById(com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.AnimalIdMessage request,
        io.grpc.stub.StreamObserver<com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.AnimalMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnimalByIdMethod(), responseObserver);
    }

    /**
     */
    public void registerAnimal(com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.RegisterAnimalMessage request,
        io.grpc.stub.StreamObserver<com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.AnimalMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterAnimalMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAnimalFromProductMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.ProductMessage,
                com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.ListAnimals>(
                  this, METHODID_GET_ANIMAL_FROM_PRODUCT)))
          .addMethod(
            getGetAllAnimalsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.EmptyMessage,
                com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.ListAnimals>(
                  this, METHODID_GET_ALL_ANIMALS)))
          .addMethod(
            getGetAnimalByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.AnimalIdMessage,
                com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.AnimalMessage>(
                  this, METHODID_GET_ANIMAL_BY_ID)))
          .addMethod(
            getRegisterAnimalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.RegisterAnimalMessage,
                com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.AnimalMessage>(
                  this, METHODID_REGISTER_ANIMAL)))
          .build();
    }
  }

  /**
   */
  public static final class AnimalServiceStub extends io.grpc.stub.AbstractAsyncStub<AnimalServiceStub> {
    private AnimalServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAnimalFromProduct(com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.ProductMessage request,
        io.grpc.stub.StreamObserver<com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.ListAnimals> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnimalFromProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllAnimals(com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.EmptyMessage request,
        io.grpc.stub.StreamObserver<com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.ListAnimals> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllAnimalsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAnimalById(com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.AnimalIdMessage request,
        io.grpc.stub.StreamObserver<com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.AnimalMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnimalByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerAnimal(com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.RegisterAnimalMessage request,
        io.grpc.stub.StreamObserver<com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.AnimalMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterAnimalMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AnimalServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AnimalServiceBlockingStub> {
    private AnimalServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.ListAnimals getAnimalFromProduct(com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.ProductMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnimalFromProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.ListAnimals getAllAnimals(com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllAnimalsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.AnimalMessage getAnimalById(com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.AnimalIdMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnimalByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.AnimalMessage registerAnimal(com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.RegisterAnimalMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterAnimalMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AnimalServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AnimalServiceFutureStub> {
    private AnimalServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.ListAnimals> getAnimalFromProduct(
        com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.ProductMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnimalFromProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.ListAnimals> getAllAnimals(
        com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.EmptyMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllAnimalsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.AnimalMessage> getAnimalById(
        com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.AnimalIdMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnimalByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.AnimalMessage> registerAnimal(
        com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.RegisterAnimalMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterAnimalMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ANIMAL_FROM_PRODUCT = 0;
  private static final int METHODID_GET_ALL_ANIMALS = 1;
  private static final int METHODID_GET_ANIMAL_BY_ID = 2;
  private static final int METHODID_REGISTER_ANIMAL = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AnimalServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AnimalServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ANIMAL_FROM_PRODUCT:
          serviceImpl.getAnimalFromProduct((com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.ProductMessage) request,
              (io.grpc.stub.StreamObserver<com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.ListAnimals>) responseObserver);
          break;
        case METHODID_GET_ALL_ANIMALS:
          serviceImpl.getAllAnimals((com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.EmptyMessage) request,
              (io.grpc.stub.StreamObserver<com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.ListAnimals>) responseObserver);
          break;
        case METHODID_GET_ANIMAL_BY_ID:
          serviceImpl.getAnimalById((com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.AnimalIdMessage) request,
              (io.grpc.stub.StreamObserver<com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.AnimalMessage>) responseObserver);
          break;
        case METHODID_REGISTER_ANIMAL:
          serviceImpl.registerAnimal((com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.RegisterAnimalMessage) request,
              (io.grpc.stub.StreamObserver<com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.AnimalMessage>) responseObserver);
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

  private static abstract class AnimalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AnimalServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sdj3.dataServerSDJ3.protobuf.animalProtobuf.Animal.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AnimalService");
    }
  }

  private static final class AnimalServiceFileDescriptorSupplier
      extends AnimalServiceBaseDescriptorSupplier {
    AnimalServiceFileDescriptorSupplier() {}
  }

  private static final class AnimalServiceMethodDescriptorSupplier
      extends AnimalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AnimalServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AnimalServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AnimalServiceFileDescriptorSupplier())
              .addMethod(getGetAnimalFromProductMethod())
              .addMethod(getGetAllAnimalsMethod())
              .addMethod(getGetAnimalByIdMethod())
              .addMethod(getRegisterAnimalMethod())
              .build();
        }
      }
    }
    return result;
  }
}
