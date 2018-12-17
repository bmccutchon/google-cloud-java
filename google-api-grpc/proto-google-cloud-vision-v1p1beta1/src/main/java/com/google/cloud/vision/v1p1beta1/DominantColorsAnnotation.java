// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p1beta1/image_annotator.proto

package com.google.cloud.vision.v1p1beta1;

/**
 *
 *
 * <pre>
 * Set of dominant colors and their corresponding scores.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vision.v1p1beta1.DominantColorsAnnotation}
 */
public final class DominantColorsAnnotation extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.vision.v1p1beta1.DominantColorsAnnotation)
    DominantColorsAnnotationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DominantColorsAnnotation.newBuilder() to construct.
  private DominantColorsAnnotation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DominantColorsAnnotation() {
    colors_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private DominantColorsAnnotation(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                colors_ = new java.util.ArrayList<com.google.cloud.vision.v1p1beta1.ColorInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              colors_.add(
                  input.readMessage(
                      com.google.cloud.vision.v1p1beta1.ColorInfo.parser(), extensionRegistry));
              break;
            }
          default:
            {
              if (!parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        colors_ = java.util.Collections.unmodifiableList(colors_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.vision.v1p1beta1.ImageAnnotatorProto
        .internal_static_google_cloud_vision_v1p1beta1_DominantColorsAnnotation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vision.v1p1beta1.ImageAnnotatorProto
        .internal_static_google_cloud_vision_v1p1beta1_DominantColorsAnnotation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vision.v1p1beta1.DominantColorsAnnotation.class,
            com.google.cloud.vision.v1p1beta1.DominantColorsAnnotation.Builder.class);
  }

  public static final int COLORS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.vision.v1p1beta1.ColorInfo> colors_;
  /**
   *
   *
   * <pre>
   * RGB color values with their score and pixel fraction.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.ColorInfo colors = 1;</code>
   */
  public java.util.List<com.google.cloud.vision.v1p1beta1.ColorInfo> getColorsList() {
    return colors_;
  }
  /**
   *
   *
   * <pre>
   * RGB color values with their score and pixel fraction.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.ColorInfo colors = 1;</code>
   */
  public java.util.List<? extends com.google.cloud.vision.v1p1beta1.ColorInfoOrBuilder>
      getColorsOrBuilderList() {
    return colors_;
  }
  /**
   *
   *
   * <pre>
   * RGB color values with their score and pixel fraction.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.ColorInfo colors = 1;</code>
   */
  public int getColorsCount() {
    return colors_.size();
  }
  /**
   *
   *
   * <pre>
   * RGB color values with their score and pixel fraction.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.ColorInfo colors = 1;</code>
   */
  public com.google.cloud.vision.v1p1beta1.ColorInfo getColors(int index) {
    return colors_.get(index);
  }
  /**
   *
   *
   * <pre>
   * RGB color values with their score and pixel fraction.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p1beta1.ColorInfo colors = 1;</code>
   */
  public com.google.cloud.vision.v1p1beta1.ColorInfoOrBuilder getColorsOrBuilder(int index) {
    return colors_.get(index);
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < colors_.size(); i++) {
      output.writeMessage(1, colors_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < colors_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, colors_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.vision.v1p1beta1.DominantColorsAnnotation)) {
      return super.equals(obj);
    }
    com.google.cloud.vision.v1p1beta1.DominantColorsAnnotation other =
        (com.google.cloud.vision.v1p1beta1.DominantColorsAnnotation) obj;

    boolean result = true;
    result = result && getColorsList().equals(other.getColorsList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getColorsCount() > 0) {
      hash = (37 * hash) + COLORS_FIELD_NUMBER;
      hash = (53 * hash) + getColorsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vision.v1p1beta1.DominantColorsAnnotation parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p1beta1.DominantColorsAnnotation parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p1beta1.DominantColorsAnnotation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p1beta1.DominantColorsAnnotation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p1beta1.DominantColorsAnnotation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p1beta1.DominantColorsAnnotation parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p1beta1.DominantColorsAnnotation parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p1beta1.DominantColorsAnnotation parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p1beta1.DominantColorsAnnotation parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p1beta1.DominantColorsAnnotation parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p1beta1.DominantColorsAnnotation parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p1beta1.DominantColorsAnnotation parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.vision.v1p1beta1.DominantColorsAnnotation prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Set of dominant colors and their corresponding scores.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vision.v1p1beta1.DominantColorsAnnotation}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vision.v1p1beta1.DominantColorsAnnotation)
      com.google.cloud.vision.v1p1beta1.DominantColorsAnnotationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.vision.v1p1beta1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1p1beta1_DominantColorsAnnotation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vision.v1p1beta1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1p1beta1_DominantColorsAnnotation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vision.v1p1beta1.DominantColorsAnnotation.class,
              com.google.cloud.vision.v1p1beta1.DominantColorsAnnotation.Builder.class);
    }

    // Construct using com.google.cloud.vision.v1p1beta1.DominantColorsAnnotation.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getColorsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (colorsBuilder_ == null) {
        colors_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        colorsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.vision.v1p1beta1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1p1beta1_DominantColorsAnnotation_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p1beta1.DominantColorsAnnotation getDefaultInstanceForType() {
      return com.google.cloud.vision.v1p1beta1.DominantColorsAnnotation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p1beta1.DominantColorsAnnotation build() {
      com.google.cloud.vision.v1p1beta1.DominantColorsAnnotation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p1beta1.DominantColorsAnnotation buildPartial() {
      com.google.cloud.vision.v1p1beta1.DominantColorsAnnotation result =
          new com.google.cloud.vision.v1p1beta1.DominantColorsAnnotation(this);
      int from_bitField0_ = bitField0_;
      if (colorsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          colors_ = java.util.Collections.unmodifiableList(colors_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.colors_ = colors_;
      } else {
        result.colors_ = colorsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.vision.v1p1beta1.DominantColorsAnnotation) {
        return mergeFrom((com.google.cloud.vision.v1p1beta1.DominantColorsAnnotation) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vision.v1p1beta1.DominantColorsAnnotation other) {
      if (other == com.google.cloud.vision.v1p1beta1.DominantColorsAnnotation.getDefaultInstance())
        return this;
      if (colorsBuilder_ == null) {
        if (!other.colors_.isEmpty()) {
          if (colors_.isEmpty()) {
            colors_ = other.colors_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureColorsIsMutable();
            colors_.addAll(other.colors_);
          }
          onChanged();
        }
      } else {
        if (!other.colors_.isEmpty()) {
          if (colorsBuilder_.isEmpty()) {
            colorsBuilder_.dispose();
            colorsBuilder_ = null;
            colors_ = other.colors_;
            bitField0_ = (bitField0_ & ~0x00000001);
            colorsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getColorsFieldBuilder()
                    : null;
          } else {
            colorsBuilder_.addAllMessages(other.colors_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.vision.v1p1beta1.DominantColorsAnnotation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.vision.v1p1beta1.DominantColorsAnnotation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.vision.v1p1beta1.ColorInfo> colors_ =
        java.util.Collections.emptyList();

    private void ensureColorsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        colors_ = new java.util.ArrayList<com.google.cloud.vision.v1p1beta1.ColorInfo>(colors_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.vision.v1p1beta1.ColorInfo,
            com.google.cloud.vision.v1p1beta1.ColorInfo.Builder,
            com.google.cloud.vision.v1p1beta1.ColorInfoOrBuilder>
        colorsBuilder_;

    /**
     *
     *
     * <pre>
     * RGB color values with their score and pixel fraction.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p1beta1.ColorInfo colors = 1;</code>
     */
    public java.util.List<com.google.cloud.vision.v1p1beta1.ColorInfo> getColorsList() {
      if (colorsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(colors_);
      } else {
        return colorsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * RGB color values with their score and pixel fraction.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p1beta1.ColorInfo colors = 1;</code>
     */
    public int getColorsCount() {
      if (colorsBuilder_ == null) {
        return colors_.size();
      } else {
        return colorsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * RGB color values with their score and pixel fraction.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p1beta1.ColorInfo colors = 1;</code>
     */
    public com.google.cloud.vision.v1p1beta1.ColorInfo getColors(int index) {
      if (colorsBuilder_ == null) {
        return colors_.get(index);
      } else {
        return colorsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * RGB color values with their score and pixel fraction.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p1beta1.ColorInfo colors = 1;</code>
     */
    public Builder setColors(int index, com.google.cloud.vision.v1p1beta1.ColorInfo value) {
      if (colorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureColorsIsMutable();
        colors_.set(index, value);
        onChanged();
      } else {
        colorsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * RGB color values with their score and pixel fraction.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p1beta1.ColorInfo colors = 1;</code>
     */
    public Builder setColors(
        int index, com.google.cloud.vision.v1p1beta1.ColorInfo.Builder builderForValue) {
      if (colorsBuilder_ == null) {
        ensureColorsIsMutable();
        colors_.set(index, builderForValue.build());
        onChanged();
      } else {
        colorsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * RGB color values with their score and pixel fraction.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p1beta1.ColorInfo colors = 1;</code>
     */
    public Builder addColors(com.google.cloud.vision.v1p1beta1.ColorInfo value) {
      if (colorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureColorsIsMutable();
        colors_.add(value);
        onChanged();
      } else {
        colorsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * RGB color values with their score and pixel fraction.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p1beta1.ColorInfo colors = 1;</code>
     */
    public Builder addColors(int index, com.google.cloud.vision.v1p1beta1.ColorInfo value) {
      if (colorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureColorsIsMutable();
        colors_.add(index, value);
        onChanged();
      } else {
        colorsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * RGB color values with their score and pixel fraction.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p1beta1.ColorInfo colors = 1;</code>
     */
    public Builder addColors(com.google.cloud.vision.v1p1beta1.ColorInfo.Builder builderForValue) {
      if (colorsBuilder_ == null) {
        ensureColorsIsMutable();
        colors_.add(builderForValue.build());
        onChanged();
      } else {
        colorsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * RGB color values with their score and pixel fraction.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p1beta1.ColorInfo colors = 1;</code>
     */
    public Builder addColors(
        int index, com.google.cloud.vision.v1p1beta1.ColorInfo.Builder builderForValue) {
      if (colorsBuilder_ == null) {
        ensureColorsIsMutable();
        colors_.add(index, builderForValue.build());
        onChanged();
      } else {
        colorsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * RGB color values with their score and pixel fraction.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p1beta1.ColorInfo colors = 1;</code>
     */
    public Builder addAllColors(
        java.lang.Iterable<? extends com.google.cloud.vision.v1p1beta1.ColorInfo> values) {
      if (colorsBuilder_ == null) {
        ensureColorsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, colors_);
        onChanged();
      } else {
        colorsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * RGB color values with their score and pixel fraction.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p1beta1.ColorInfo colors = 1;</code>
     */
    public Builder clearColors() {
      if (colorsBuilder_ == null) {
        colors_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        colorsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * RGB color values with their score and pixel fraction.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p1beta1.ColorInfo colors = 1;</code>
     */
    public Builder removeColors(int index) {
      if (colorsBuilder_ == null) {
        ensureColorsIsMutable();
        colors_.remove(index);
        onChanged();
      } else {
        colorsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * RGB color values with their score and pixel fraction.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p1beta1.ColorInfo colors = 1;</code>
     */
    public com.google.cloud.vision.v1p1beta1.ColorInfo.Builder getColorsBuilder(int index) {
      return getColorsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * RGB color values with their score and pixel fraction.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p1beta1.ColorInfo colors = 1;</code>
     */
    public com.google.cloud.vision.v1p1beta1.ColorInfoOrBuilder getColorsOrBuilder(int index) {
      if (colorsBuilder_ == null) {
        return colors_.get(index);
      } else {
        return colorsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * RGB color values with their score and pixel fraction.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p1beta1.ColorInfo colors = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.vision.v1p1beta1.ColorInfoOrBuilder>
        getColorsOrBuilderList() {
      if (colorsBuilder_ != null) {
        return colorsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(colors_);
      }
    }
    /**
     *
     *
     * <pre>
     * RGB color values with their score and pixel fraction.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p1beta1.ColorInfo colors = 1;</code>
     */
    public com.google.cloud.vision.v1p1beta1.ColorInfo.Builder addColorsBuilder() {
      return getColorsFieldBuilder()
          .addBuilder(com.google.cloud.vision.v1p1beta1.ColorInfo.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * RGB color values with their score and pixel fraction.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p1beta1.ColorInfo colors = 1;</code>
     */
    public com.google.cloud.vision.v1p1beta1.ColorInfo.Builder addColorsBuilder(int index) {
      return getColorsFieldBuilder()
          .addBuilder(index, com.google.cloud.vision.v1p1beta1.ColorInfo.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * RGB color values with their score and pixel fraction.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p1beta1.ColorInfo colors = 1;</code>
     */
    public java.util.List<com.google.cloud.vision.v1p1beta1.ColorInfo.Builder>
        getColorsBuilderList() {
      return getColorsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.vision.v1p1beta1.ColorInfo,
            com.google.cloud.vision.v1p1beta1.ColorInfo.Builder,
            com.google.cloud.vision.v1p1beta1.ColorInfoOrBuilder>
        getColorsFieldBuilder() {
      if (colorsBuilder_ == null) {
        colorsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.vision.v1p1beta1.ColorInfo,
                com.google.cloud.vision.v1p1beta1.ColorInfo.Builder,
                com.google.cloud.vision.v1p1beta1.ColorInfoOrBuilder>(
                colors_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        colors_ = null;
      }
      return colorsBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.vision.v1p1beta1.DominantColorsAnnotation)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vision.v1p1beta1.DominantColorsAnnotation)
  private static final com.google.cloud.vision.v1p1beta1.DominantColorsAnnotation DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.vision.v1p1beta1.DominantColorsAnnotation();
  }

  public static com.google.cloud.vision.v1p1beta1.DominantColorsAnnotation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DominantColorsAnnotation> PARSER =
      new com.google.protobuf.AbstractParser<DominantColorsAnnotation>() {
        @java.lang.Override
        public DominantColorsAnnotation parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new DominantColorsAnnotation(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<DominantColorsAnnotation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DominantColorsAnnotation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vision.v1p1beta1.DominantColorsAnnotation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}