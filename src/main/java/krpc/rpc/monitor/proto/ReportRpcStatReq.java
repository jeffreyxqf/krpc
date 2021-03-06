// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: krpcmonitor.proto

package krpc.rpc.monitor.proto;

/**
 * Protobuf type {@code ReportRpcStatReq}
 */
public  final class ReportRpcStatReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ReportRpcStatReq)
    ReportRpcStatReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReportRpcStatReq.newBuilder() to construct.
  private ReportRpcStatReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReportRpcStatReq() {
    timestamp_ = 0L;
    host_ = "";
    app_ = "";
    stats_ = java.util.Collections.emptyList();
    appServiceId_ = 0;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ReportRpcStatReq(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
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
          case 8: {

            timestamp_ = input.readInt64();
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            host_ = s;
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            app_ = s;
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              stats_ = new java.util.ArrayList<RpcStat>();
              mutable_bitField0_ |= 0x00000008;
            }
            stats_.add(
                input.readMessage(RpcStat.parser(), extensionRegistry));
            break;
          }
          case 40: {

            appServiceId_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
        stats_ = java.util.Collections.unmodifiableList(stats_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return MonitorProtos.internal_static_ReportRpcStatReq_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return MonitorProtos.internal_static_ReportRpcStatReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ReportRpcStatReq.class, Builder.class);
  }

  private int bitField0_;
  public static final int TIMESTAMP_FIELD_NUMBER = 1;
  private long timestamp_;
  /**
   * <code>int64 timestamp = 1;</code>
   */
  public long getTimestamp() {
    return timestamp_;
  }

  public static final int HOST_FIELD_NUMBER = 2;
  private volatile Object host_;
  /**
   * <code>string host = 2;</code>
   */
  public String getHost() {
    Object ref = host_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      host_ = s;
      return s;
    }
  }
  /**
   * <code>string host = 2;</code>
   */
  public com.google.protobuf.ByteString
      getHostBytes() {
    Object ref = host_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      host_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int APP_FIELD_NUMBER = 3;
  private volatile Object app_;
  /**
   * <code>string app = 3;</code>
   */
  public String getApp() {
    Object ref = app_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      app_ = s;
      return s;
    }
  }
  /**
   * <code>string app = 3;</code>
   */
  public com.google.protobuf.ByteString
      getAppBytes() {
    Object ref = app_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      app_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATS_FIELD_NUMBER = 4;
  private java.util.List<RpcStat> stats_;
  /**
   * <code>repeated .RpcStat stats = 4;</code>
   */
  public java.util.List<RpcStat> getStatsList() {
    return stats_;
  }
  /**
   * <code>repeated .RpcStat stats = 4;</code>
   */
  public java.util.List<? extends RpcStatOrBuilder>
      getStatsOrBuilderList() {
    return stats_;
  }
  /**
   * <code>repeated .RpcStat stats = 4;</code>
   */
  public int getStatsCount() {
    return stats_.size();
  }
  /**
   * <code>repeated .RpcStat stats = 4;</code>
   */
  public RpcStat getStats(int index) {
    return stats_.get(index);
  }
  /**
   * <code>repeated .RpcStat stats = 4;</code>
   */
  public RpcStatOrBuilder getStatsOrBuilder(
      int index) {
    return stats_.get(index);
  }

  public static final int APPSERVICEID_FIELD_NUMBER = 5;
  private int appServiceId_;
  /**
   * <code>int32 appServiceId = 5;</code>
   */
  public int getAppServiceId() {
    return appServiceId_;
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (timestamp_ != 0L) {
      output.writeInt64(1, timestamp_);
    }
    if (!getHostBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, host_);
    }
    if (!getAppBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, app_);
    }
    for (int i = 0; i < stats_.size(); i++) {
      output.writeMessage(4, stats_.get(i));
    }
    if (appServiceId_ != 0) {
      output.writeInt32(5, appServiceId_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (timestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, timestamp_);
    }
    if (!getHostBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, host_);
    }
    if (!getAppBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, app_);
    }
    for (int i = 0; i < stats_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, stats_.get(i));
    }
    if (appServiceId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, appServiceId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ReportRpcStatReq)) {
      return super.equals(obj);
    }
    ReportRpcStatReq other = (ReportRpcStatReq) obj;

    boolean result = true;
    result = result && (getTimestamp()
        == other.getTimestamp());
    result = result && getHost()
        .equals(other.getHost());
    result = result && getApp()
        .equals(other.getApp());
    result = result && getStatsList()
        .equals(other.getStatsList());
    result = result && (getAppServiceId()
        == other.getAppServiceId());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestamp());
    hash = (37 * hash) + HOST_FIELD_NUMBER;
    hash = (53 * hash) + getHost().hashCode();
    hash = (37 * hash) + APP_FIELD_NUMBER;
    hash = (53 * hash) + getApp().hashCode();
    if (getStatsCount() > 0) {
      hash = (37 * hash) + STATS_FIELD_NUMBER;
      hash = (53 * hash) + getStatsList().hashCode();
    }
    hash = (37 * hash) + APPSERVICEID_FIELD_NUMBER;
    hash = (53 * hash) + getAppServiceId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ReportRpcStatReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ReportRpcStatReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ReportRpcStatReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ReportRpcStatReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ReportRpcStatReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ReportRpcStatReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ReportRpcStatReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ReportRpcStatReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ReportRpcStatReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ReportRpcStatReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ReportRpcStatReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ReportRpcStatReq parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ReportRpcStatReq prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ReportRpcStatReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ReportRpcStatReq)
      ReportRpcStatReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MonitorProtos.internal_static_ReportRpcStatReq_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MonitorProtos.internal_static_ReportRpcStatReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ReportRpcStatReq.class, Builder.class);
    }

    // Construct using krpc.rpc.monitor.proto.ReportRpcStatReq.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getStatsFieldBuilder();
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      timestamp_ = 0L;

      host_ = "";

      app_ = "";

      if (statsBuilder_ == null) {
        stats_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
      } else {
        statsBuilder_.clear();
      }
      appServiceId_ = 0;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return MonitorProtos.internal_static_ReportRpcStatReq_descriptor;
    }

    @Override
    public ReportRpcStatReq getDefaultInstanceForType() {
      return ReportRpcStatReq.getDefaultInstance();
    }

    @Override
    public ReportRpcStatReq build() {
      ReportRpcStatReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public ReportRpcStatReq buildPartial() {
      ReportRpcStatReq result = new ReportRpcStatReq(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.timestamp_ = timestamp_;
      result.host_ = host_;
      result.app_ = app_;
      if (statsBuilder_ == null) {
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          stats_ = java.util.Collections.unmodifiableList(stats_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.stats_ = stats_;
      } else {
        result.stats_ = statsBuilder_.build();
      }
      result.appServiceId_ = appServiceId_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ReportRpcStatReq) {
        return mergeFrom((ReportRpcStatReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ReportRpcStatReq other) {
      if (other == ReportRpcStatReq.getDefaultInstance()) return this;
      if (other.getTimestamp() != 0L) {
        setTimestamp(other.getTimestamp());
      }
      if (!other.getHost().isEmpty()) {
        host_ = other.host_;
        onChanged();
      }
      if (!other.getApp().isEmpty()) {
        app_ = other.app_;
        onChanged();
      }
      if (statsBuilder_ == null) {
        if (!other.stats_.isEmpty()) {
          if (stats_.isEmpty()) {
            stats_ = other.stats_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureStatsIsMutable();
            stats_.addAll(other.stats_);
          }
          onChanged();
        }
      } else {
        if (!other.stats_.isEmpty()) {
          if (statsBuilder_.isEmpty()) {
            statsBuilder_.dispose();
            statsBuilder_ = null;
            stats_ = other.stats_;
            bitField0_ = (bitField0_ & ~0x00000008);
            statsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getStatsFieldBuilder() : null;
          } else {
            statsBuilder_.addAllMessages(other.stats_);
          }
        }
      }
      if (other.getAppServiceId() != 0) {
        setAppServiceId(other.getAppServiceId());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ReportRpcStatReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ReportRpcStatReq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long timestamp_ ;
    /**
     * <code>int64 timestamp = 1;</code>
     */
    public long getTimestamp() {
      return timestamp_;
    }
    /**
     * <code>int64 timestamp = 1;</code>
     */
    public Builder setTimestamp(long value) {
      
      timestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 timestamp = 1;</code>
     */
    public Builder clearTimestamp() {
      
      timestamp_ = 0L;
      onChanged();
      return this;
    }

    private Object host_ = "";
    /**
     * <code>string host = 2;</code>
     */
    public String getHost() {
      Object ref = host_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        host_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string host = 2;</code>
     */
    public com.google.protobuf.ByteString
        getHostBytes() {
      Object ref = host_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        host_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string host = 2;</code>
     */
    public Builder setHost(
        String value) {
      if (value == null) value = "";
  
      host_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string host = 2;</code>
     */
    public Builder clearHost() {
      
      host_ = getDefaultInstance().getHost();
      onChanged();
      return this;
    }
    /**
     * <code>string host = 2;</code>
     */
    public Builder setHostBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      host_ = value;
      onChanged();
      return this;
    }

    private Object app_ = "";
    /**
     * <code>string app = 3;</code>
     */
    public String getApp() {
      Object ref = app_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        app_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string app = 3;</code>
     */
    public com.google.protobuf.ByteString
        getAppBytes() {
      Object ref = app_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        app_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string app = 3;</code>
     */
    public Builder setApp(
        String value) {
      if (value == null) value = "";
  
      app_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string app = 3;</code>
     */
    public Builder clearApp() {
      
      app_ = getDefaultInstance().getApp();
      onChanged();
      return this;
    }
    /**
     * <code>string app = 3;</code>
     */
    public Builder setAppBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      app_ = value;
      onChanged();
      return this;
    }

    private java.util.List<RpcStat> stats_ =
      java.util.Collections.emptyList();
    private void ensureStatsIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        stats_ = new java.util.ArrayList<RpcStat>(stats_);
        bitField0_ |= 0x00000008;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        RpcStat, RpcStat.Builder, RpcStatOrBuilder> statsBuilder_;

    /**
     * <code>repeated .RpcStat stats = 4;</code>
     */
    public java.util.List<RpcStat> getStatsList() {
      if (statsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(stats_);
      } else {
        return statsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .RpcStat stats = 4;</code>
     */
    public int getStatsCount() {
      if (statsBuilder_ == null) {
        return stats_.size();
      } else {
        return statsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .RpcStat stats = 4;</code>
     */
    public RpcStat getStats(int index) {
      if (statsBuilder_ == null) {
        return stats_.get(index);
      } else {
        return statsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .RpcStat stats = 4;</code>
     */
    public Builder setStats(
        int index, RpcStat value) {
      if (statsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStatsIsMutable();
        stats_.set(index, value);
        onChanged();
      } else {
        statsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .RpcStat stats = 4;</code>
     */
    public Builder setStats(
        int index, RpcStat.Builder builderForValue) {
      if (statsBuilder_ == null) {
        ensureStatsIsMutable();
        stats_.set(index, builderForValue.build());
        onChanged();
      } else {
        statsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .RpcStat stats = 4;</code>
     */
    public Builder addStats(RpcStat value) {
      if (statsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStatsIsMutable();
        stats_.add(value);
        onChanged();
      } else {
        statsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .RpcStat stats = 4;</code>
     */
    public Builder addStats(
        int index, RpcStat value) {
      if (statsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStatsIsMutable();
        stats_.add(index, value);
        onChanged();
      } else {
        statsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .RpcStat stats = 4;</code>
     */
    public Builder addStats(
        RpcStat.Builder builderForValue) {
      if (statsBuilder_ == null) {
        ensureStatsIsMutable();
        stats_.add(builderForValue.build());
        onChanged();
      } else {
        statsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .RpcStat stats = 4;</code>
     */
    public Builder addStats(
        int index, RpcStat.Builder builderForValue) {
      if (statsBuilder_ == null) {
        ensureStatsIsMutable();
        stats_.add(index, builderForValue.build());
        onChanged();
      } else {
        statsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .RpcStat stats = 4;</code>
     */
    public Builder addAllStats(
        Iterable<? extends RpcStat> values) {
      if (statsBuilder_ == null) {
        ensureStatsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, stats_);
        onChanged();
      } else {
        statsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .RpcStat stats = 4;</code>
     */
    public Builder clearStats() {
      if (statsBuilder_ == null) {
        stats_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
      } else {
        statsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .RpcStat stats = 4;</code>
     */
    public Builder removeStats(int index) {
      if (statsBuilder_ == null) {
        ensureStatsIsMutable();
        stats_.remove(index);
        onChanged();
      } else {
        statsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .RpcStat stats = 4;</code>
     */
    public RpcStat.Builder getStatsBuilder(
        int index) {
      return getStatsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .RpcStat stats = 4;</code>
     */
    public RpcStatOrBuilder getStatsOrBuilder(
        int index) {
      if (statsBuilder_ == null) {
        return stats_.get(index);  } else {
        return statsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .RpcStat stats = 4;</code>
     */
    public java.util.List<? extends RpcStatOrBuilder>
         getStatsOrBuilderList() {
      if (statsBuilder_ != null) {
        return statsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(stats_);
      }
    }
    /**
     * <code>repeated .RpcStat stats = 4;</code>
     */
    public RpcStat.Builder addStatsBuilder() {
      return getStatsFieldBuilder().addBuilder(
          RpcStat.getDefaultInstance());
    }
    /**
     * <code>repeated .RpcStat stats = 4;</code>
     */
    public RpcStat.Builder addStatsBuilder(
        int index) {
      return getStatsFieldBuilder().addBuilder(
          index, RpcStat.getDefaultInstance());
    }
    /**
     * <code>repeated .RpcStat stats = 4;</code>
     */
    public java.util.List<RpcStat.Builder>
         getStatsBuilderList() {
      return getStatsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        RpcStat, RpcStat.Builder, RpcStatOrBuilder>
        getStatsFieldBuilder() {
      if (statsBuilder_ == null) {
        statsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            RpcStat, RpcStat.Builder, RpcStatOrBuilder>(
                stats_,
                ((bitField0_ & 0x00000008) == 0x00000008),
                getParentForChildren(),
                isClean());
        stats_ = null;
      }
      return statsBuilder_;
    }

    private int appServiceId_ ;
    /**
     * <code>int32 appServiceId = 5;</code>
     */
    public int getAppServiceId() {
      return appServiceId_;
    }
    /**
     * <code>int32 appServiceId = 5;</code>
     */
    public Builder setAppServiceId(int value) {
      
      appServiceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 appServiceId = 5;</code>
     */
    public Builder clearAppServiceId() {
      
      appServiceId_ = 0;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ReportRpcStatReq)
  }

  // @@protoc_insertion_point(class_scope:ReportRpcStatReq)
  private static final ReportRpcStatReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ReportRpcStatReq();
  }

  public static ReportRpcStatReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReportRpcStatReq>
      PARSER = new com.google.protobuf.AbstractParser<ReportRpcStatReq>() {
    @Override
    public ReportRpcStatReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReportRpcStatReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReportRpcStatReq> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<ReportRpcStatReq> getParserForType() {
    return PARSER;
  }

  @Override
  public ReportRpcStatReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

