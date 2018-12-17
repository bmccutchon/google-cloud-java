// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/logging_config.proto

package com.google.logging.v2;

public interface LogSinkOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.logging.v2.LogSink)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The client-assigned sink identifier, unique within the
   * project. Example: `"my-syslog-errors-to-pubsub"`.  Sink identifiers are
   * limited to 100 characters and can include only the following characters:
   * upper and lower-case alphanumeric characters, underscores, hyphens, and
   * periods.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The client-assigned sink identifier, unique within the
   * project. Example: `"my-syslog-errors-to-pubsub"`.  Sink identifiers are
   * limited to 100 characters and can include only the following characters:
   * upper and lower-case alphanumeric characters, underscores, hyphens, and
   * periods.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The export destination:
   *     "storage.googleapis.com/[GCS_BUCKET]"
   *     "bigquery.googleapis.com/projects/[PROJECT_ID]/datasets/[DATASET]"
   *     "pubsub.googleapis.com/projects/[PROJECT_ID]/topics/[TOPIC_ID]"
   * The sink's `writer_identity`, set when the sink is created, must
   * have permission to write to the destination or else the log
   * entries are not exported.  For more information, see
   * [Exporting Logs With Sinks](/logging/docs/api/tasks/exporting-logs).
   * </pre>
   *
   * <code>string destination = 3;</code>
   */
  java.lang.String getDestination();
  /**
   *
   *
   * <pre>
   * Required. The export destination:
   *     "storage.googleapis.com/[GCS_BUCKET]"
   *     "bigquery.googleapis.com/projects/[PROJECT_ID]/datasets/[DATASET]"
   *     "pubsub.googleapis.com/projects/[PROJECT_ID]/topics/[TOPIC_ID]"
   * The sink's `writer_identity`, set when the sink is created, must
   * have permission to write to the destination or else the log
   * entries are not exported.  For more information, see
   * [Exporting Logs With Sinks](/logging/docs/api/tasks/exporting-logs).
   * </pre>
   *
   * <code>string destination = 3;</code>
   */
  com.google.protobuf.ByteString getDestinationBytes();

  /**
   *
   *
   * <pre>
   * Optional.
   * An [advanced logs filter](/logging/docs/view/advanced_filters).  The only
   * exported log entries are those that are in the resource owning the sink and
   * that match the filter.  For example:
   *     logName="projects/[PROJECT_ID]/logs/[LOG_ID]" AND severity&gt;=ERROR
   * </pre>
   *
   * <code>string filter = 5;</code>
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Optional.
   * An [advanced logs filter](/logging/docs/view/advanced_filters).  The only
   * exported log entries are those that are in the resource owning the sink and
   * that match the filter.  For example:
   *     logName="projects/[PROJECT_ID]/logs/[LOG_ID]" AND severity&gt;=ERROR
   * </pre>
   *
   * <code>string filter = 5;</code>
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Deprecated. The log entry format to use for this sink's exported log
   * entries.  The v2 format is used by default and cannot be changed.
   * </pre>
   *
   * <code>.google.logging.v2.LogSink.VersionFormat output_version_format = 6 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  int getOutputVersionFormatValue();
  /**
   *
   *
   * <pre>
   * Deprecated. The log entry format to use for this sink's exported log
   * entries.  The v2 format is used by default and cannot be changed.
   * </pre>
   *
   * <code>.google.logging.v2.LogSink.VersionFormat output_version_format = 6 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  com.google.logging.v2.LogSink.VersionFormat getOutputVersionFormat();

  /**
   *
   *
   * <pre>
   * Output only. An IAM identity&amp;mdash;a service account or group&amp;mdash;under
   * which Logging writes the exported log entries to the sink's
   * destination.  This field is set by
   * [sinks.create](/logging/docs/api/reference/rest/v2/projects.sinks/create)
   * and
   * [sinks.update](/logging/docs/api/reference/rest/v2/projects.sinks/update),
   * based on the setting of `unique_writer_identity` in those methods.
   * Until you grant this identity write-access to the destination, log entry
   * exports from this sink will fail. For more information,
   * see [Granting access for a
   * resource](/iam/docs/granting-roles-to-service-accounts#granting_access_to_a_service_account_for_a_resource).
   * Consult the destination service's documentation to determine the
   * appropriate IAM roles to assign to the identity.
   * </pre>
   *
   * <code>string writer_identity = 8;</code>
   */
  java.lang.String getWriterIdentity();
  /**
   *
   *
   * <pre>
   * Output only. An IAM identity&amp;mdash;a service account or group&amp;mdash;under
   * which Logging writes the exported log entries to the sink's
   * destination.  This field is set by
   * [sinks.create](/logging/docs/api/reference/rest/v2/projects.sinks/create)
   * and
   * [sinks.update](/logging/docs/api/reference/rest/v2/projects.sinks/update),
   * based on the setting of `unique_writer_identity` in those methods.
   * Until you grant this identity write-access to the destination, log entry
   * exports from this sink will fail. For more information,
   * see [Granting access for a
   * resource](/iam/docs/granting-roles-to-service-accounts#granting_access_to_a_service_account_for_a_resource).
   * Consult the destination service's documentation to determine the
   * appropriate IAM roles to assign to the identity.
   * </pre>
   *
   * <code>string writer_identity = 8;</code>
   */
  com.google.protobuf.ByteString getWriterIdentityBytes();

  /**
   *
   *
   * <pre>
   * Optional. This field applies only to sinks owned by organizations and
   * folders. If the field is false, the default, only the logs owned by the
   * sink's parent resource are available for export. If the field is true, then
   * logs from all the projects, folders, and billing accounts contained in the
   * sink's parent resource are also available for export. Whether a particular
   * log entry from the children is exported depends on the sink's filter
   * expression. For example, if this field is true, then the filter
   * `resource.type=gce_instance` would export all Compute Engine VM instance
   * log entries from all projects in the sink's parent. To only export entries
   * from certain child projects, filter on the project part of the log name:
   *     logName:("projects/test-project1/" OR "projects/test-project2/") AND
   *     resource.type=gce_instance
   * </pre>
   *
   * <code>bool include_children = 9;</code>
   */
  boolean getIncludeChildren();

  /**
   *
   *
   * <pre>
   * Deprecated. This field is ignored when creating or updating sinks.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 10 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * Deprecated. This field is ignored when creating or updating sinks.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 10 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * Deprecated. This field is ignored when creating or updating sinks.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 10 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Deprecated. This field is ignored when creating or updating sinks.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 11 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * Deprecated. This field is ignored when creating or updating sinks.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 11 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * Deprecated. This field is ignored when creating or updating sinks.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 11 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();
}