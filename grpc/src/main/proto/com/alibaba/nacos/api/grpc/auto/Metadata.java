package com.alibaba.nacos.api.grpc.auto;

/**
 * Protobuf type {@code Metadata}
 */
public final class Metadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Metadata)
    MetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Metadata.newBuilder() to construct.
  private Metadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Metadata() {
    type_ = "";
    clientIp_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Metadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.alibaba.nacos.api.grpc.auto.NacosGrpcService.internal_static_Metadata_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
      int number) {
    switch (number) {
      case 7:
        return internalGetHeaders();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.alibaba.nacos.api.grpc.auto.NacosGrpcService.internal_static_Metadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.alibaba.nacos.api.grpc.auto.Metadata.class, com.alibaba.nacos.api.grpc.auto.Metadata.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object type_ = "";
  /**
   * <code>string type = 3;</code>
   * @return The type.
   */
  @java.lang.Override
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <code>string type = 3;</code>
   * @return The bytes for type.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLIENTIP_FIELD_NUMBER = 8;
  @SuppressWarnings("serial")
  private volatile java.lang.Object clientIp_ = "";
  /**
   * <code>string clientIp = 8;</code>
   * @return The clientIp.
   */
  @java.lang.Override
  public java.lang.String getClientIp() {
    java.lang.Object ref = clientIp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clientIp_ = s;
      return s;
    }
  }
  /**
   * <code>string clientIp = 8;</code>
   * @return The bytes for clientIp.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getClientIpBytes() {
    java.lang.Object ref = clientIp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clientIp_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HEADERS_FIELD_NUMBER = 7;
  private static final class HeadersDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.alibaba.nacos.api.grpc.auto.NacosGrpcService.internal_static_Metadata_HeadersEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> headers_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetHeaders() {
    if (headers_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          HeadersDefaultEntryHolder.defaultEntry);
    }
    return headers_;
  }
  public int getHeadersCount() {
    return internalGetHeaders().getMap().size();
  }
  /**
   * <code>map&lt;string, string&gt; headers = 7;</code>
   */
  @java.lang.Override
  public boolean containsHeaders(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetHeaders().getMap().containsKey(key);
  }
  /**
   * Use {@link #getHeadersMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getHeaders() {
    return getHeadersMap();
  }
  /**
   * <code>map&lt;string, string&gt; headers = 7;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getHeadersMap() {
    return internalGetHeaders().getMap();
  }
  /**
   * <code>map&lt;string, string&gt; headers = 7;</code>
   */
  @java.lang.Override
  public /* nullable */
java.lang.String getHeadersOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetHeaders().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, string&gt; headers = 7;</code>
   */
  @java.lang.Override
  public java.lang.String getHeadersOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetHeaders().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, type_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetHeaders(),
        HeadersDefaultEntryHolder.defaultEntry,
        7);
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientIp_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 8, clientIp_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, type_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetHeaders().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      headers__ = HeadersDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, headers__);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientIp_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, clientIp_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.alibaba.nacos.api.grpc.auto.Metadata)) {
      return super.equals(obj);
    }
    com.alibaba.nacos.api.grpc.auto.Metadata other = (com.alibaba.nacos.api.grpc.auto.Metadata) obj;

    if (!getType()
        .equals(other.getType())) return false;
    if (!getClientIp()
        .equals(other.getClientIp())) return false;
    if (!internalGetHeaders().equals(
        other.internalGetHeaders())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    hash = (37 * hash) + CLIENTIP_FIELD_NUMBER;
    hash = (53 * hash) + getClientIp().hashCode();
    if (!internalGetHeaders().getMap().isEmpty()) {
      hash = (37 * hash) + HEADERS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetHeaders().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.alibaba.nacos.api.grpc.auto.Metadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alibaba.nacos.api.grpc.auto.Metadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alibaba.nacos.api.grpc.auto.Metadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alibaba.nacos.api.grpc.auto.Metadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alibaba.nacos.api.grpc.auto.Metadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alibaba.nacos.api.grpc.auto.Metadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alibaba.nacos.api.grpc.auto.Metadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.alibaba.nacos.api.grpc.auto.Metadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.alibaba.nacos.api.grpc.auto.Metadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.alibaba.nacos.api.grpc.auto.Metadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.alibaba.nacos.api.grpc.auto.Metadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.alibaba.nacos.api.grpc.auto.Metadata parseFrom(
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
  public static Builder newBuilder(com.alibaba.nacos.api.grpc.auto.Metadata prototype) {
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
   * Protobuf type {@code Metadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Metadata)
      com.alibaba.nacos.api.grpc.auto.MetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alibaba.nacos.api.grpc.auto.NacosGrpcService.internal_static_Metadata_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 7:
          return internalGetHeaders();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
        int number) {
      switch (number) {
        case 7:
          return internalGetMutableHeaders();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alibaba.nacos.api.grpc.auto.NacosGrpcService.internal_static_Metadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.alibaba.nacos.api.grpc.auto.Metadata.class, com.alibaba.nacos.api.grpc.auto.Metadata.Builder.class);
    }

    // Construct using com.alibaba.nacos.api.grpc.auto.Metadata.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      type_ = "";
      clientIp_ = "";
      internalGetMutableHeaders().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.alibaba.nacos.api.grpc.auto.NacosGrpcService.internal_static_Metadata_descriptor;
    }

    @java.lang.Override
    public com.alibaba.nacos.api.grpc.auto.Metadata getDefaultInstanceForType() {
      return com.alibaba.nacos.api.grpc.auto.Metadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.alibaba.nacos.api.grpc.auto.Metadata build() {
      com.alibaba.nacos.api.grpc.auto.Metadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.alibaba.nacos.api.grpc.auto.Metadata buildPartial() {
      com.alibaba.nacos.api.grpc.auto.Metadata result = new com.alibaba.nacos.api.grpc.auto.Metadata(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.alibaba.nacos.api.grpc.auto.Metadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.clientIp_ = clientIp_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.headers_ = internalGetHeaders();
        result.headers_.makeImmutable();
      }
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
      if (other instanceof com.alibaba.nacos.api.grpc.auto.Metadata) {
        return mergeFrom((com.alibaba.nacos.api.grpc.auto.Metadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.alibaba.nacos.api.grpc.auto.Metadata other) {
      if (other == com.alibaba.nacos.api.grpc.auto.Metadata.getDefaultInstance()) return this;
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getClientIp().isEmpty()) {
        clientIp_ = other.clientIp_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      internalGetMutableHeaders().mergeFrom(
          other.internalGetHeaders());
      bitField0_ |= 0x00000004;
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 26: {
              type_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 26
            case 58: {
              com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
              headers__ = input.readMessage(
                  HeadersDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableHeaders().getMutableMap().put(
                  headers__.getKey(), headers__.getValue());
              bitField0_ |= 0x00000004;
              break;
            } // case 58
            case 66: {
              clientIp_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 66
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object type_ = "";
    /**
     * <code>string type = 3;</code>
     * @return The type.
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string type = 3;</code>
     * @return The bytes for type.
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string type = 3;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      type_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string type = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      type_ = getDefaultInstance().getType();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string type = 3;</code>
     * @param value The bytes for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      type_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object clientIp_ = "";
    /**
     * <code>string clientIp = 8;</code>
     * @return The clientIp.
     */
    public java.lang.String getClientIp() {
      java.lang.Object ref = clientIp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clientIp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string clientIp = 8;</code>
     * @return The bytes for clientIp.
     */
    public com.google.protobuf.ByteString
        getClientIpBytes() {
      java.lang.Object ref = clientIp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientIp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string clientIp = 8;</code>
     * @param value The clientIp to set.
     * @return This builder for chaining.
     */
    public Builder setClientIp(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      clientIp_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string clientIp = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearClientIp() {
      clientIp_ = getDefaultInstance().getClientIp();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string clientIp = 8;</code>
     * @param value The bytes for clientIp to set.
     * @return This builder for chaining.
     */
    public Builder setClientIpBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      clientIp_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> headers_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetHeaders() {
      if (headers_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            HeadersDefaultEntryHolder.defaultEntry);
      }
      return headers_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableHeaders() {
      if (headers_ == null) {
        headers_ = com.google.protobuf.MapField.newMapField(
            HeadersDefaultEntryHolder.defaultEntry);
      }
      if (!headers_.isMutable()) {
        headers_ = headers_.copy();
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return headers_;
    }
    public int getHeadersCount() {
      return internalGetHeaders().getMap().size();
    }
    /**
     * <code>map&lt;string, string&gt; headers = 7;</code>
     */
    @java.lang.Override
    public boolean containsHeaders(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetHeaders().getMap().containsKey(key);
    }
    /**
     * Use {@link #getHeadersMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getHeaders() {
      return getHeadersMap();
    }
    /**
     * <code>map&lt;string, string&gt; headers = 7;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getHeadersMap() {
      return internalGetHeaders().getMap();
    }
    /**
     * <code>map&lt;string, string&gt; headers = 7;</code>
     */
    @java.lang.Override
    public /* nullable */
java.lang.String getHeadersOrDefault(
        java.lang.String key,
        /* nullable */
java.lang.String defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetHeaders().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, string&gt; headers = 7;</code>
     */
    @java.lang.Override
    public java.lang.String getHeadersOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetHeaders().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearHeaders() {
      bitField0_ = (bitField0_ & ~0x00000004);
      internalGetMutableHeaders().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; headers = 7;</code>
     */
    public Builder removeHeaders(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableHeaders().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
        getMutableHeaders() {
      bitField0_ |= 0x00000004;
      return internalGetMutableHeaders().getMutableMap();
    }
    /**
     * <code>map&lt;string, string&gt; headers = 7;</code>
     */
    public Builder putHeaders(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableHeaders().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; headers = 7;</code>
     */
    public Builder putAllHeaders(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableHeaders().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:Metadata)
  }

  // @@protoc_insertion_point(class_scope:Metadata)
  private static final com.alibaba.nacos.api.grpc.auto.Metadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.alibaba.nacos.api.grpc.auto.Metadata();
  }

  public static com.alibaba.nacos.api.grpc.auto.Metadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Metadata>
      PARSER = new com.google.protobuf.AbstractParser<Metadata>() {
    @java.lang.Override
    public Metadata parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Metadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Metadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.alibaba.nacos.api.grpc.auto.Metadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

