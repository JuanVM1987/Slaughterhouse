// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Product.proto

package com.sdj3.dataServerSDJ3.protobuf.productProtobuf;

public final class Product {
  private Product() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ProductMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ProductMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AnimalMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AnimalMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ListProduct_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ListProduct_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rProduct.proto\":\n\016ProductMessage\022\n\n\002id\030" +
      "\001 \001(\005\022\014\n\004name\030\002 \001(\t\022\016\n\006weight\030\003 \001(\001\";\n\rA" +
      "nimalMessage\022\n\n\002id\030\001 \001(\005\022\016\n\006origen\030\002 \001(\t" +
      "\022\016\n\006weight\030\003 \001(\001\"6\n\013ListProduct\022\'\n\016Produ" +
      "ctMessage\030\001 \003(\0132\017.ProductMessage2I\n\016Prod" +
      "uctService\0227\n\027getAllProductFromAnimal\022\016." +
      "AnimalMessage\032\014.ListProductB4\n0com.sdj3." +
      "dataServerSDJ3.protobuf.productProtobufP" +
      "\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ProductMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ProductMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ProductMessage_descriptor,
        new java.lang.String[] { "Id", "Name", "Weight", });
    internal_static_AnimalMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_AnimalMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AnimalMessage_descriptor,
        new java.lang.String[] { "Id", "Origen", "Weight", });
    internal_static_ListProduct_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ListProduct_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ListProduct_descriptor,
        new java.lang.String[] { "ProductMessage", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}