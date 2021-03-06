// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1beta2/operations.proto

package com.google.cloud.dataproc.v1beta2;

public final class OperationsProto {
  private OperationsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1beta2_ClusterOperationStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1beta2_ClusterOperationStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1beta2_ClusterOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1beta2_ClusterOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataproc_v1beta2_ClusterOperationMetadata_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1beta2_ClusterOperationMetadata_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/cloud/dataproc/v1beta2/operatio"
          + "ns.proto\022\035google.cloud.dataproc.v1beta2\032"
          + "\034google/api/annotations.proto\032\037google/pr"
          + "otobuf/timestamp.proto\"\372\001\n\026ClusterOperat"
          + "ionStatus\022J\n\005state\030\001 \001(\0162;.google.cloud."
          + "dataproc.v1beta2.ClusterOperationStatus."
          + "State\022\023\n\013inner_state\030\002 \001(\t\022\017\n\007details\030\003 "
          + "\001(\t\0224\n\020state_start_time\030\004 \001(\0132\032.google.p"
          + "rotobuf.Timestamp\"8\n\005State\022\013\n\007UNKNOWN\020\000\022"
          + "\013\n\007PENDING\020\001\022\013\n\007RUNNING\020\002\022\010\n\004DONE\020\003\"\237\003\n\030"
          + "ClusterOperationMetadata\022\024\n\014cluster_name"
          + "\030\007 \001(\t\022\024\n\014cluster_uuid\030\010 \001(\t\022E\n\006status\030\t"
          + " \001(\01325.google.cloud.dataproc.v1beta2.Clu"
          + "sterOperationStatus\022M\n\016status_history\030\n "
          + "\003(\01325.google.cloud.dataproc.v1beta2.Clus"
          + "terOperationStatus\022\026\n\016operation_type\030\013 \001"
          + "(\t\022\023\n\013description\030\014 \001(\t\022S\n\006labels\030\r \003(\0132"
          + "C.google.cloud.dataproc.v1beta2.ClusterO"
          + "perationMetadata.LabelsEntry\022\020\n\010warnings"
          + "\030\016 \003(\t\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005va"
          + "lue\030\002 \001(\t:\0028\001B}\n!com.google.cloud.datapr"
          + "oc.v1beta2B\017OperationsProtoP\001ZEgoogle.go"
          + "lang.org/genproto/googleapis/cloud/datap"
          + "roc/v1beta2;dataprocb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_dataproc_v1beta2_ClusterOperationStatus_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dataproc_v1beta2_ClusterOperationStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1beta2_ClusterOperationStatus_descriptor,
            new java.lang.String[] {
              "State", "InnerState", "Details", "StateStartTime",
            });
    internal_static_google_cloud_dataproc_v1beta2_ClusterOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dataproc_v1beta2_ClusterOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1beta2_ClusterOperationMetadata_descriptor,
            new java.lang.String[] {
              "ClusterName",
              "ClusterUuid",
              "Status",
              "StatusHistory",
              "OperationType",
              "Description",
              "Labels",
              "Warnings",
            });
    internal_static_google_cloud_dataproc_v1beta2_ClusterOperationMetadata_LabelsEntry_descriptor =
        internal_static_google_cloud_dataproc_v1beta2_ClusterOperationMetadata_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dataproc_v1beta2_ClusterOperationMetadata_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataproc_v1beta2_ClusterOperationMetadata_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
