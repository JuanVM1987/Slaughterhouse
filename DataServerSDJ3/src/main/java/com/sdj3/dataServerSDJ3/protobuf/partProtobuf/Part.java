// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Part.proto

package com.sdj3.dataServerSDJ3.protobuf.partProtobuf;

public final class Part {
  private Part() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PartMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PartMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AddPartMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AddPartMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nPart.proto\"Y\n\013PartMessage\022\n\n\002id\030\001 \001(\005\022" +
      "\014\n\004name\030\002 \001(\t\022\016\n\006weight\030\003 \001(\001\022\020\n\010animalI" +
      "d\030\004 \001(\005\022\016\n\006trayId\030\005 \001(\005\"P\n\016AddPartMessag" +
      "e\022\014\n\004name\030\002 \001(\t\022\016\n\006weight\030\003 \001(\001\022\020\n\010anima" +
      "lId\030\004 \001(\005\022\016\n\006trayId\030\005 \001(\00529\n\013PartService" +
      "\022*\n\tcreatPart\022\017.AddPartMessage\032\014.PartMes" +
      "sageB1\n-com.sdj3.dataServerSDJ3.protobuf" +
      ".partProtobufP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PartMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PartMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PartMessage_descriptor,
        new java.lang.String[] { "Id", "Name", "Weight", "AnimalId", "TrayId", });
    internal_static_AddPartMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_AddPartMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AddPartMessage_descriptor,
        new java.lang.String[] { "Name", "Weight", "AnimalId", "TrayId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
