// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Animal.proto

package com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf;

/**
 * Protobuf type {@code RegisterAnimalMessage}
 */
public final class RegisterAnimalMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:RegisterAnimalMessage)
    RegisterAnimalMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RegisterAnimalMessage.newBuilder() to construct.
  private RegisterAnimalMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RegisterAnimalMessage() {
    origen_ = "";
    arrivedDate_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RegisterAnimalMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RegisterAnimalMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            origen_ = s;
            break;
          }
          case 17: {

            weight_ = input.readDouble();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            arrivedDate_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.Animal.internal_static_RegisterAnimalMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.Animal.internal_static_RegisterAnimalMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.RegisterAnimalMessage.class, com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.RegisterAnimalMessage.Builder.class);
  }

  public static final int ORIGEN_FIELD_NUMBER = 1;
  private volatile java.lang.Object origen_;
  /**
   * <code>string origen = 1;</code>
   * @return The origen.
   */
  @java.lang.Override
  public java.lang.String getOrigen() {
    java.lang.Object ref = origen_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      origen_ = s;
      return s;
    }
  }
  /**
   * <code>string origen = 1;</code>
   * @return The bytes for origen.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOrigenBytes() {
    java.lang.Object ref = origen_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      origen_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WEIGHT_FIELD_NUMBER = 2;
  private double weight_;
  /**
   * <code>double weight = 2;</code>
   * @return The weight.
   */
  @java.lang.Override
  public double getWeight() {
    return weight_;
  }

  public static final int ARRIVEDDATE_FIELD_NUMBER = 3;
  private volatile java.lang.Object arrivedDate_;
  /**
   * <code>string arrivedDate = 3;</code>
   * @return The arrivedDate.
   */
  @java.lang.Override
  public java.lang.String getArrivedDate() {
    java.lang.Object ref = arrivedDate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      arrivedDate_ = s;
      return s;
    }
  }
  /**
   * <code>string arrivedDate = 3;</code>
   * @return The bytes for arrivedDate.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getArrivedDateBytes() {
    java.lang.Object ref = arrivedDate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      arrivedDate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(origen_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, origen_);
    }
    if (java.lang.Double.doubleToRawLongBits(weight_) != 0) {
      output.writeDouble(2, weight_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(arrivedDate_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, arrivedDate_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(origen_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, origen_);
    }
    if (java.lang.Double.doubleToRawLongBits(weight_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, weight_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(arrivedDate_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, arrivedDate_);
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
    if (!(obj instanceof com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.RegisterAnimalMessage)) {
      return super.equals(obj);
    }
    com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.RegisterAnimalMessage other = (com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.RegisterAnimalMessage) obj;

    if (!getOrigen()
        .equals(other.getOrigen())) return false;
    if (java.lang.Double.doubleToLongBits(getWeight())
        != java.lang.Double.doubleToLongBits(
            other.getWeight())) return false;
    if (!getArrivedDate()
        .equals(other.getArrivedDate())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ORIGEN_FIELD_NUMBER;
    hash = (53 * hash) + getOrigen().hashCode();
    hash = (37 * hash) + WEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getWeight()));
    hash = (37 * hash) + ARRIVEDDATE_FIELD_NUMBER;
    hash = (53 * hash) + getArrivedDate().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.RegisterAnimalMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.RegisterAnimalMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.RegisterAnimalMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.RegisterAnimalMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.RegisterAnimalMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.RegisterAnimalMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.RegisterAnimalMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.RegisterAnimalMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.RegisterAnimalMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.RegisterAnimalMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.RegisterAnimalMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.RegisterAnimalMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.RegisterAnimalMessage prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code RegisterAnimalMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:RegisterAnimalMessage)
      com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.RegisterAnimalMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.Animal.internal_static_RegisterAnimalMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.Animal.internal_static_RegisterAnimalMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.RegisterAnimalMessage.class, com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.RegisterAnimalMessage.Builder.class);
    }

    // Construct using com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.RegisterAnimalMessage.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      origen_ = "";

      weight_ = 0D;

      arrivedDate_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.Animal.internal_static_RegisterAnimalMessage_descriptor;
    }

    @java.lang.Override
    public com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.RegisterAnimalMessage getDefaultInstanceForType() {
      return com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.RegisterAnimalMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.RegisterAnimalMessage build() {
      com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.RegisterAnimalMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.RegisterAnimalMessage buildPartial() {
      com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.RegisterAnimalMessage result = new com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.RegisterAnimalMessage(this);
      result.origen_ = origen_;
      result.weight_ = weight_;
      result.arrivedDate_ = arrivedDate_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.RegisterAnimalMessage) {
        return mergeFrom((com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.RegisterAnimalMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.RegisterAnimalMessage other) {
      if (other == com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.RegisterAnimalMessage.getDefaultInstance()) return this;
      if (!other.getOrigen().isEmpty()) {
        origen_ = other.origen_;
        onChanged();
      }
      if (other.getWeight() != 0D) {
        setWeight(other.getWeight());
      }
      if (!other.getArrivedDate().isEmpty()) {
        arrivedDate_ = other.arrivedDate_;
        onChanged();
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
      com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.RegisterAnimalMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.RegisterAnimalMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object origen_ = "";
    /**
     * <code>string origen = 1;</code>
     * @return The origen.
     */
    public java.lang.String getOrigen() {
      java.lang.Object ref = origen_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        origen_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string origen = 1;</code>
     * @return The bytes for origen.
     */
    public com.google.protobuf.ByteString
        getOrigenBytes() {
      java.lang.Object ref = origen_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        origen_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string origen = 1;</code>
     * @param value The origen to set.
     * @return This builder for chaining.
     */
    public Builder setOrigen(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      origen_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string origen = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOrigen() {
      
      origen_ = getDefaultInstance().getOrigen();
      onChanged();
      return this;
    }
    /**
     * <code>string origen = 1;</code>
     * @param value The bytes for origen to set.
     * @return This builder for chaining.
     */
    public Builder setOrigenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      origen_ = value;
      onChanged();
      return this;
    }

    private double weight_ ;
    /**
     * <code>double weight = 2;</code>
     * @return The weight.
     */
    @java.lang.Override
    public double getWeight() {
      return weight_;
    }
    /**
     * <code>double weight = 2;</code>
     * @param value The weight to set.
     * @return This builder for chaining.
     */
    public Builder setWeight(double value) {
      
      weight_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double weight = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearWeight() {
      
      weight_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object arrivedDate_ = "";
    /**
     * <code>string arrivedDate = 3;</code>
     * @return The arrivedDate.
     */
    public java.lang.String getArrivedDate() {
      java.lang.Object ref = arrivedDate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        arrivedDate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string arrivedDate = 3;</code>
     * @return The bytes for arrivedDate.
     */
    public com.google.protobuf.ByteString
        getArrivedDateBytes() {
      java.lang.Object ref = arrivedDate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        arrivedDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string arrivedDate = 3;</code>
     * @param value The arrivedDate to set.
     * @return This builder for chaining.
     */
    public Builder setArrivedDate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      arrivedDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string arrivedDate = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearArrivedDate() {
      
      arrivedDate_ = getDefaultInstance().getArrivedDate();
      onChanged();
      return this;
    }
    /**
     * <code>string arrivedDate = 3;</code>
     * @param value The bytes for arrivedDate to set.
     * @return This builder for chaining.
     */
    public Builder setArrivedDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      arrivedDate_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:RegisterAnimalMessage)
  }

  // @@protoc_insertion_point(class_scope:RegisterAnimalMessage)
  private static final com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.RegisterAnimalMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.RegisterAnimalMessage();
  }

  public static com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.RegisterAnimalMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RegisterAnimalMessage>
      PARSER = new com.google.protobuf.AbstractParser<RegisterAnimalMessage>() {
    @java.lang.Override
    public RegisterAnimalMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RegisterAnimalMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RegisterAnimalMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RegisterAnimalMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sdj3.slaughterhousesdj3.protobuf.animalProtobuf.RegisterAnimalMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
