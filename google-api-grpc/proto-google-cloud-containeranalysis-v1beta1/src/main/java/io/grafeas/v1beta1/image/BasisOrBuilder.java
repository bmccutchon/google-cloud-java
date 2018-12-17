// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/image/image.proto

package io.grafeas.v1beta1.image;

public interface BasisOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1beta1.image.Basis)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource_url for the resource representing the basis of
   * associated occurrence images.
   * </pre>
   *
   * <code>string resource_url = 1;</code>
   */
  java.lang.String getResourceUrl();
  /**
   *
   *
   * <pre>
   * The resource_url for the resource representing the basis of
   * associated occurrence images.
   * </pre>
   *
   * <code>string resource_url = 1;</code>
   */
  com.google.protobuf.ByteString getResourceUrlBytes();

  /**
   *
   *
   * <pre>
   * The fingerprint of the base image.
   * </pre>
   *
   * <code>.grafeas.v1beta1.image.Fingerprint fingerprint = 2;</code>
   */
  boolean hasFingerprint();
  /**
   *
   *
   * <pre>
   * The fingerprint of the base image.
   * </pre>
   *
   * <code>.grafeas.v1beta1.image.Fingerprint fingerprint = 2;</code>
   */
  io.grafeas.v1beta1.image.Fingerprint getFingerprint();
  /**
   *
   *
   * <pre>
   * The fingerprint of the base image.
   * </pre>
   *
   * <code>.grafeas.v1beta1.image.Fingerprint fingerprint = 2;</code>
   */
  io.grafeas.v1beta1.image.FingerprintOrBuilder getFingerprintOrBuilder();
}