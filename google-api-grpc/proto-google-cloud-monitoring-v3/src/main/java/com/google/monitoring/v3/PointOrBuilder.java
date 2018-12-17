// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/metric.proto

package com.google.monitoring.v3;

public interface PointOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.Point)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The time interval to which the data point applies.  For `GAUGE` metrics,
   * only the end time of the interval is used.  For `DELTA` metrics, the start
   * and end time should specify a non-zero interval, with subsequent points
   * specifying contiguous and non-overlapping intervals.  For `CUMULATIVE`
   * metrics, the start and end time should specify a non-zero interval, with
   * subsequent points specifying the same start time and increasing end times,
   * until an event resets the cumulative value to zero and sets a new start
   * time for the following points.
   * </pre>
   *
   * <code>.google.monitoring.v3.TimeInterval interval = 1;</code>
   */
  boolean hasInterval();
  /**
   *
   *
   * <pre>
   * The time interval to which the data point applies.  For `GAUGE` metrics,
   * only the end time of the interval is used.  For `DELTA` metrics, the start
   * and end time should specify a non-zero interval, with subsequent points
   * specifying contiguous and non-overlapping intervals.  For `CUMULATIVE`
   * metrics, the start and end time should specify a non-zero interval, with
   * subsequent points specifying the same start time and increasing end times,
   * until an event resets the cumulative value to zero and sets a new start
   * time for the following points.
   * </pre>
   *
   * <code>.google.monitoring.v3.TimeInterval interval = 1;</code>
   */
  com.google.monitoring.v3.TimeInterval getInterval();
  /**
   *
   *
   * <pre>
   * The time interval to which the data point applies.  For `GAUGE` metrics,
   * only the end time of the interval is used.  For `DELTA` metrics, the start
   * and end time should specify a non-zero interval, with subsequent points
   * specifying contiguous and non-overlapping intervals.  For `CUMULATIVE`
   * metrics, the start and end time should specify a non-zero interval, with
   * subsequent points specifying the same start time and increasing end times,
   * until an event resets the cumulative value to zero and sets a new start
   * time for the following points.
   * </pre>
   *
   * <code>.google.monitoring.v3.TimeInterval interval = 1;</code>
   */
  com.google.monitoring.v3.TimeIntervalOrBuilder getIntervalOrBuilder();

  /**
   *
   *
   * <pre>
   * The value of the data point.
   * </pre>
   *
   * <code>.google.monitoring.v3.TypedValue value = 2;</code>
   */
  boolean hasValue();
  /**
   *
   *
   * <pre>
   * The value of the data point.
   * </pre>
   *
   * <code>.google.monitoring.v3.TypedValue value = 2;</code>
   */
  com.google.monitoring.v3.TypedValue getValue();
  /**
   *
   *
   * <pre>
   * The value of the data point.
   * </pre>
   *
   * <code>.google.monitoring.v3.TypedValue value = 2;</code>
   */
  com.google.monitoring.v3.TypedValueOrBuilder getValueOrBuilder();
}