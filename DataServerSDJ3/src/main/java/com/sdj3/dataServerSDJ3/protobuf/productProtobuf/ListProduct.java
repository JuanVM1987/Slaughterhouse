// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Product.proto

package com.sdj3.dataServerSDJ3.protobuf.productProtobuf;

/**
 * Protobuf type {@code ListProduct}
 */
public final class ListProduct extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ListProduct)
    ListProductOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListProduct.newBuilder() to construct.
  private ListProduct(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListProduct() {
    productMessage_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListProduct();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListProduct(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              productMessage_ = new java.util.ArrayList<com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ProductMessage>();
              mutable_bitField0_ |= 0x00000001;
            }
            productMessage_.add(
                input.readMessage(com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ProductMessage.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        productMessage_ = java.util.Collections.unmodifiableList(productMessage_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.sdj3.dataServerSDJ3.protobuf.productProtobuf.Product.internal_static_ListProduct_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sdj3.dataServerSDJ3.protobuf.productProtobuf.Product.internal_static_ListProduct_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ListProduct.class, com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ListProduct.Builder.class);
  }

  public static final int PRODUCTMESSAGE_FIELD_NUMBER = 1;
  private java.util.List<com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ProductMessage> productMessage_;
  /**
   * <code>repeated .ProductMessage ProductMessage = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ProductMessage> getProductMessageList() {
    return productMessage_;
  }
  /**
   * <code>repeated .ProductMessage ProductMessage = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ProductMessageOrBuilder> 
      getProductMessageOrBuilderList() {
    return productMessage_;
  }
  /**
   * <code>repeated .ProductMessage ProductMessage = 1;</code>
   */
  @java.lang.Override
  public int getProductMessageCount() {
    return productMessage_.size();
  }
  /**
   * <code>repeated .ProductMessage ProductMessage = 1;</code>
   */
  @java.lang.Override
  public com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ProductMessage getProductMessage(int index) {
    return productMessage_.get(index);
  }
  /**
   * <code>repeated .ProductMessage ProductMessage = 1;</code>
   */
  @java.lang.Override
  public com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ProductMessageOrBuilder getProductMessageOrBuilder(
      int index) {
    return productMessage_.get(index);
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
    for (int i = 0; i < productMessage_.size(); i++) {
      output.writeMessage(1, productMessage_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < productMessage_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, productMessage_.get(i));
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
    if (!(obj instanceof com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ListProduct)) {
      return super.equals(obj);
    }
    com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ListProduct other = (com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ListProduct) obj;

    if (!getProductMessageList()
        .equals(other.getProductMessageList())) return false;
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
    if (getProductMessageCount() > 0) {
      hash = (37 * hash) + PRODUCTMESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getProductMessageList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ListProduct parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ListProduct parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ListProduct parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ListProduct parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ListProduct parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ListProduct parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ListProduct parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ListProduct parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ListProduct parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ListProduct parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ListProduct parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ListProduct parseFrom(
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
  public static Builder newBuilder(com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ListProduct prototype) {
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
   * Protobuf type {@code ListProduct}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ListProduct)
      com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ListProductOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sdj3.dataServerSDJ3.protobuf.productProtobuf.Product.internal_static_ListProduct_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sdj3.dataServerSDJ3.protobuf.productProtobuf.Product.internal_static_ListProduct_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ListProduct.class, com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ListProduct.Builder.class);
    }

    // Construct using com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ListProduct.newBuilder()
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
        getProductMessageFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (productMessageBuilder_ == null) {
        productMessage_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        productMessageBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sdj3.dataServerSDJ3.protobuf.productProtobuf.Product.internal_static_ListProduct_descriptor;
    }

    @java.lang.Override
    public com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ListProduct getDefaultInstanceForType() {
      return com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ListProduct.getDefaultInstance();
    }

    @java.lang.Override
    public com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ListProduct build() {
      com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ListProduct result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ListProduct buildPartial() {
      com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ListProduct result = new com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ListProduct(this);
      int from_bitField0_ = bitField0_;
      if (productMessageBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          productMessage_ = java.util.Collections.unmodifiableList(productMessage_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.productMessage_ = productMessage_;
      } else {
        result.productMessage_ = productMessageBuilder_.build();
      }
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
      if (other instanceof com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ListProduct) {
        return mergeFrom((com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ListProduct)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ListProduct other) {
      if (other == com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ListProduct.getDefaultInstance()) return this;
      if (productMessageBuilder_ == null) {
        if (!other.productMessage_.isEmpty()) {
          if (productMessage_.isEmpty()) {
            productMessage_ = other.productMessage_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureProductMessageIsMutable();
            productMessage_.addAll(other.productMessage_);
          }
          onChanged();
        }
      } else {
        if (!other.productMessage_.isEmpty()) {
          if (productMessageBuilder_.isEmpty()) {
            productMessageBuilder_.dispose();
            productMessageBuilder_ = null;
            productMessage_ = other.productMessage_;
            bitField0_ = (bitField0_ & ~0x00000001);
            productMessageBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getProductMessageFieldBuilder() : null;
          } else {
            productMessageBuilder_.addAllMessages(other.productMessage_);
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
      com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ListProduct parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ListProduct) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ProductMessage> productMessage_ =
      java.util.Collections.emptyList();
    private void ensureProductMessageIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        productMessage_ = new java.util.ArrayList<com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ProductMessage>(productMessage_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ProductMessage, com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ProductMessage.Builder, com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ProductMessageOrBuilder> productMessageBuilder_;

    /**
     * <code>repeated .ProductMessage ProductMessage = 1;</code>
     */
    public java.util.List<com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ProductMessage> getProductMessageList() {
      if (productMessageBuilder_ == null) {
        return java.util.Collections.unmodifiableList(productMessage_);
      } else {
        return productMessageBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .ProductMessage ProductMessage = 1;</code>
     */
    public int getProductMessageCount() {
      if (productMessageBuilder_ == null) {
        return productMessage_.size();
      } else {
        return productMessageBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .ProductMessage ProductMessage = 1;</code>
     */
    public com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ProductMessage getProductMessage(int index) {
      if (productMessageBuilder_ == null) {
        return productMessage_.get(index);
      } else {
        return productMessageBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .ProductMessage ProductMessage = 1;</code>
     */
    public Builder setProductMessage(
        int index, com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ProductMessage value) {
      if (productMessageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductMessageIsMutable();
        productMessage_.set(index, value);
        onChanged();
      } else {
        productMessageBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ProductMessage ProductMessage = 1;</code>
     */
    public Builder setProductMessage(
        int index, com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ProductMessage.Builder builderForValue) {
      if (productMessageBuilder_ == null) {
        ensureProductMessageIsMutable();
        productMessage_.set(index, builderForValue.build());
        onChanged();
      } else {
        productMessageBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ProductMessage ProductMessage = 1;</code>
     */
    public Builder addProductMessage(com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ProductMessage value) {
      if (productMessageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductMessageIsMutable();
        productMessage_.add(value);
        onChanged();
      } else {
        productMessageBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .ProductMessage ProductMessage = 1;</code>
     */
    public Builder addProductMessage(
        int index, com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ProductMessage value) {
      if (productMessageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductMessageIsMutable();
        productMessage_.add(index, value);
        onChanged();
      } else {
        productMessageBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ProductMessage ProductMessage = 1;</code>
     */
    public Builder addProductMessage(
        com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ProductMessage.Builder builderForValue) {
      if (productMessageBuilder_ == null) {
        ensureProductMessageIsMutable();
        productMessage_.add(builderForValue.build());
        onChanged();
      } else {
        productMessageBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ProductMessage ProductMessage = 1;</code>
     */
    public Builder addProductMessage(
        int index, com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ProductMessage.Builder builderForValue) {
      if (productMessageBuilder_ == null) {
        ensureProductMessageIsMutable();
        productMessage_.add(index, builderForValue.build());
        onChanged();
      } else {
        productMessageBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ProductMessage ProductMessage = 1;</code>
     */
    public Builder addAllProductMessage(
        java.lang.Iterable<? extends com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ProductMessage> values) {
      if (productMessageBuilder_ == null) {
        ensureProductMessageIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, productMessage_);
        onChanged();
      } else {
        productMessageBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .ProductMessage ProductMessage = 1;</code>
     */
    public Builder clearProductMessage() {
      if (productMessageBuilder_ == null) {
        productMessage_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        productMessageBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .ProductMessage ProductMessage = 1;</code>
     */
    public Builder removeProductMessage(int index) {
      if (productMessageBuilder_ == null) {
        ensureProductMessageIsMutable();
        productMessage_.remove(index);
        onChanged();
      } else {
        productMessageBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .ProductMessage ProductMessage = 1;</code>
     */
    public com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ProductMessage.Builder getProductMessageBuilder(
        int index) {
      return getProductMessageFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .ProductMessage ProductMessage = 1;</code>
     */
    public com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ProductMessageOrBuilder getProductMessageOrBuilder(
        int index) {
      if (productMessageBuilder_ == null) {
        return productMessage_.get(index);  } else {
        return productMessageBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .ProductMessage ProductMessage = 1;</code>
     */
    public java.util.List<? extends com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ProductMessageOrBuilder> 
         getProductMessageOrBuilderList() {
      if (productMessageBuilder_ != null) {
        return productMessageBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(productMessage_);
      }
    }
    /**
     * <code>repeated .ProductMessage ProductMessage = 1;</code>
     */
    public com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ProductMessage.Builder addProductMessageBuilder() {
      return getProductMessageFieldBuilder().addBuilder(
          com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ProductMessage.getDefaultInstance());
    }
    /**
     * <code>repeated .ProductMessage ProductMessage = 1;</code>
     */
    public com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ProductMessage.Builder addProductMessageBuilder(
        int index) {
      return getProductMessageFieldBuilder().addBuilder(
          index, com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ProductMessage.getDefaultInstance());
    }
    /**
     * <code>repeated .ProductMessage ProductMessage = 1;</code>
     */
    public java.util.List<com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ProductMessage.Builder> 
         getProductMessageBuilderList() {
      return getProductMessageFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ProductMessage, com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ProductMessage.Builder, com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ProductMessageOrBuilder> 
        getProductMessageFieldBuilder() {
      if (productMessageBuilder_ == null) {
        productMessageBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ProductMessage, com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ProductMessage.Builder, com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ProductMessageOrBuilder>(
                productMessage_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        productMessage_ = null;
      }
      return productMessageBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ListProduct)
  }

  // @@protoc_insertion_point(class_scope:ListProduct)
  private static final com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ListProduct DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ListProduct();
  }

  public static com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ListProduct getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListProduct>
      PARSER = new com.google.protobuf.AbstractParser<ListProduct>() {
    @java.lang.Override
    public ListProduct parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListProduct(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListProduct> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListProduct> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sdj3.dataServerSDJ3.protobuf.productProtobuf.ListProduct getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

