// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/session.proto

package com.google.cloud.dialogflow.v2;

public interface StreamingRecognitionResultOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.StreamingRecognitionResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Type of the result message.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.StreamingRecognitionResult.MessageType message_type = 1;
   * </code>
   */
  int getMessageTypeValue();
  /**
   *
   *
   * <pre>
   * Type of the result message.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.StreamingRecognitionResult.MessageType message_type = 1;
   * </code>
   */
  com.google.cloud.dialogflow.v2.StreamingRecognitionResult.MessageType getMessageType();

  /**
   *
   *
   * <pre>
   * Transcript text representing the words that the user spoke.
   * Populated if and only if `event_type` = `RECOGNITION_EVENT_TRANSCRIPT`.
   * </pre>
   *
   * <code>string transcript = 2;</code>
   */
  java.lang.String getTranscript();
  /**
   *
   *
   * <pre>
   * Transcript text representing the words that the user spoke.
   * Populated if and only if `event_type` = `RECOGNITION_EVENT_TRANSCRIPT`.
   * </pre>
   *
   * <code>string transcript = 2;</code>
   */
  com.google.protobuf.ByteString getTranscriptBytes();

  /**
   *
   *
   * <pre>
   * The default of 0.0 is a sentinel value indicating `confidence` was not set.
   * If `false`, the `StreamingRecognitionResult` represents an
   * interim result that may change. If `true`, the recognizer will not return
   * any further hypotheses about this piece of the audio. May only be populated
   * for `event_type` = `RECOGNITION_EVENT_TRANSCRIPT`.
   * </pre>
   *
   * <code>bool is_final = 3;</code>
   */
  boolean getIsFinal();

  /**
   *
   *
   * <pre>
   * The Speech confidence between 0.0 and 1.0 for the current portion of audio.
   * A higher number indicates an estimated greater likelihood that the
   * recognized words are correct. The default of 0.0 is a sentinel value
   * indicating that confidence was not set.
   * This field is typically only provided if `is_final` is true and you should
   * not rely on it being accurate or even set.
   * </pre>
   *
   * <code>float confidence = 4;</code>
   */
  float getConfidence();
}