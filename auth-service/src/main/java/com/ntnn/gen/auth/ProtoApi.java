// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protoApi.proto

package com.ntnn.gen.auth;

public final class ProtoApi {
  private ProtoApi() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ntnn_gen_AliceToBob_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ntnn_gen_AliceToBob_Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_ntnn_gen_AliceToBob_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_ntnn_gen_AliceToBob_Response_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016protoApi.proto\022\027com.ntnn.gen.AliceToBo" +
      "b\"K\n\007Request\022\021\n\terrorCode\030\001 \001(\005\022\017\n\007messa" +
      "ge\030\002 \001(\t\022\016\n\006result\030\003 \001(\010\022\014\n\004data\030\004 \001(\t\"L" +
      "\n\010Response\022\021\n\terrorCode\030\001 \001(\005\022\017\n\007message" +
      "\030\002 \001(\t\022\016\n\006result\030\003 \001(\010\022\014\n\004data\030\004 \001(\t2\333\002\n" +
      "\007MainApi\022U\n\014authenticate\022 .com.ntnn.gen." +
      "AliceToBob.Request\032!.com.ntnn.gen.AliceT" +
      "oBob.Response\"\000\022Q\n\010retrieve\022 .com.ntnn.g" +
      "en.AliceToBob.Request\032!.com.ntnn.gen.Ali" +
      "ceToBob.Response\"\000\022S\n\ngetProfile\022 .com.n",
      "tnn.gen.AliceToBob.Request\032!.com.ntnn.ge" +
      "n.AliceToBob.Response\"\000\022Q\n\010resetPin\022 .co" +
      "m.ntnn.gen.AliceToBob.Request\032!.com.ntnn" +
      ".gen.AliceToBob.Response\"\000B\025\n\021com.ntnn.g" +
      "en.authP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_ntnn_gen_AliceToBob_Request_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_ntnn_gen_AliceToBob_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ntnn_gen_AliceToBob_Request_descriptor,
        new java.lang.String[] { "ErrorCode", "Message", "Result", "Data", });
    internal_static_com_ntnn_gen_AliceToBob_Response_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_ntnn_gen_AliceToBob_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_ntnn_gen_AliceToBob_Response_descriptor,
        new java.lang.String[] { "ErrorCode", "Message", "Result", "Data", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
