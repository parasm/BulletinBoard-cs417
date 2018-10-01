// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BulletinBoard.proto

package com.bulletinboard;

/**
 * Protobuf type {@code com.bulletinboard.Posts}
 */
public  final class Posts extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.bulletinboard.Posts)
    PostsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Posts.newBuilder() to construct.
  private Posts(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Posts() {
    posts_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Posts(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              posts_ = new java.util.ArrayList<com.bulletinboard.Post>();
              mutable_bitField0_ |= 0x00000001;
            }
            posts_.add(
                input.readMessage(com.bulletinboard.Post.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        posts_ = java.util.Collections.unmodifiableList(posts_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.bulletinboard.BulletinBoardOuterClass.internal_static_com_bulletinboard_Posts_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.bulletinboard.BulletinBoardOuterClass.internal_static_com_bulletinboard_Posts_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.bulletinboard.Posts.class, com.bulletinboard.Posts.Builder.class);
  }

  public static final int POSTS_FIELD_NUMBER = 1;
  private java.util.List<com.bulletinboard.Post> posts_;
  /**
   * <code>repeated .com.bulletinboard.Post posts = 1;</code>
   */
  public java.util.List<com.bulletinboard.Post> getPostsList() {
    return posts_;
  }
  /**
   * <code>repeated .com.bulletinboard.Post posts = 1;</code>
   */
  public java.util.List<? extends com.bulletinboard.PostOrBuilder> 
      getPostsOrBuilderList() {
    return posts_;
  }
  /**
   * <code>repeated .com.bulletinboard.Post posts = 1;</code>
   */
  public int getPostsCount() {
    return posts_.size();
  }
  /**
   * <code>repeated .com.bulletinboard.Post posts = 1;</code>
   */
  public com.bulletinboard.Post getPosts(int index) {
    return posts_.get(index);
  }
  /**
   * <code>repeated .com.bulletinboard.Post posts = 1;</code>
   */
  public com.bulletinboard.PostOrBuilder getPostsOrBuilder(
      int index) {
    return posts_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < posts_.size(); i++) {
      output.writeMessage(1, posts_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < posts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, posts_.get(i));
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
    if (!(obj instanceof com.bulletinboard.Posts)) {
      return super.equals(obj);
    }
    com.bulletinboard.Posts other = (com.bulletinboard.Posts) obj;

    boolean result = true;
    result = result && getPostsList()
        .equals(other.getPostsList());
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
    if (getPostsCount() > 0) {
      hash = (37 * hash) + POSTS_FIELD_NUMBER;
      hash = (53 * hash) + getPostsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.bulletinboard.Posts parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bulletinboard.Posts parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bulletinboard.Posts parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bulletinboard.Posts parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bulletinboard.Posts parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bulletinboard.Posts parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bulletinboard.Posts parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bulletinboard.Posts parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bulletinboard.Posts parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.bulletinboard.Posts parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bulletinboard.Posts parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bulletinboard.Posts parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.bulletinboard.Posts prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code com.bulletinboard.Posts}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.bulletinboard.Posts)
      com.bulletinboard.PostsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.bulletinboard.BulletinBoardOuterClass.internal_static_com_bulletinboard_Posts_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.bulletinboard.BulletinBoardOuterClass.internal_static_com_bulletinboard_Posts_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.bulletinboard.Posts.class, com.bulletinboard.Posts.Builder.class);
    }

    // Construct using com.bulletinboard.Posts.newBuilder()
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
        getPostsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (postsBuilder_ == null) {
        posts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        postsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.bulletinboard.BulletinBoardOuterClass.internal_static_com_bulletinboard_Posts_descriptor;
    }

    public com.bulletinboard.Posts getDefaultInstanceForType() {
      return com.bulletinboard.Posts.getDefaultInstance();
    }

    public com.bulletinboard.Posts build() {
      com.bulletinboard.Posts result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.bulletinboard.Posts buildPartial() {
      com.bulletinboard.Posts result = new com.bulletinboard.Posts(this);
      int from_bitField0_ = bitField0_;
      if (postsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          posts_ = java.util.Collections.unmodifiableList(posts_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.posts_ = posts_;
      } else {
        result.posts_ = postsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.bulletinboard.Posts) {
        return mergeFrom((com.bulletinboard.Posts)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.bulletinboard.Posts other) {
      if (other == com.bulletinboard.Posts.getDefaultInstance()) return this;
      if (postsBuilder_ == null) {
        if (!other.posts_.isEmpty()) {
          if (posts_.isEmpty()) {
            posts_ = other.posts_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePostsIsMutable();
            posts_.addAll(other.posts_);
          }
          onChanged();
        }
      } else {
        if (!other.posts_.isEmpty()) {
          if (postsBuilder_.isEmpty()) {
            postsBuilder_.dispose();
            postsBuilder_ = null;
            posts_ = other.posts_;
            bitField0_ = (bitField0_ & ~0x00000001);
            postsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPostsFieldBuilder() : null;
          } else {
            postsBuilder_.addAllMessages(other.posts_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.bulletinboard.Posts parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.bulletinboard.Posts) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.bulletinboard.Post> posts_ =
      java.util.Collections.emptyList();
    private void ensurePostsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        posts_ = new java.util.ArrayList<com.bulletinboard.Post>(posts_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.bulletinboard.Post, com.bulletinboard.Post.Builder, com.bulletinboard.PostOrBuilder> postsBuilder_;

    /**
     * <code>repeated .com.bulletinboard.Post posts = 1;</code>
     */
    public java.util.List<com.bulletinboard.Post> getPostsList() {
      if (postsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(posts_);
      } else {
        return postsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.bulletinboard.Post posts = 1;</code>
     */
    public int getPostsCount() {
      if (postsBuilder_ == null) {
        return posts_.size();
      } else {
        return postsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.bulletinboard.Post posts = 1;</code>
     */
    public com.bulletinboard.Post getPosts(int index) {
      if (postsBuilder_ == null) {
        return posts_.get(index);
      } else {
        return postsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.bulletinboard.Post posts = 1;</code>
     */
    public Builder setPosts(
        int index, com.bulletinboard.Post value) {
      if (postsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePostsIsMutable();
        posts_.set(index, value);
        onChanged();
      } else {
        postsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.bulletinboard.Post posts = 1;</code>
     */
    public Builder setPosts(
        int index, com.bulletinboard.Post.Builder builderForValue) {
      if (postsBuilder_ == null) {
        ensurePostsIsMutable();
        posts_.set(index, builderForValue.build());
        onChanged();
      } else {
        postsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.bulletinboard.Post posts = 1;</code>
     */
    public Builder addPosts(com.bulletinboard.Post value) {
      if (postsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePostsIsMutable();
        posts_.add(value);
        onChanged();
      } else {
        postsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.bulletinboard.Post posts = 1;</code>
     */
    public Builder addPosts(
        int index, com.bulletinboard.Post value) {
      if (postsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePostsIsMutable();
        posts_.add(index, value);
        onChanged();
      } else {
        postsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.bulletinboard.Post posts = 1;</code>
     */
    public Builder addPosts(
        com.bulletinboard.Post.Builder builderForValue) {
      if (postsBuilder_ == null) {
        ensurePostsIsMutable();
        posts_.add(builderForValue.build());
        onChanged();
      } else {
        postsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.bulletinboard.Post posts = 1;</code>
     */
    public Builder addPosts(
        int index, com.bulletinboard.Post.Builder builderForValue) {
      if (postsBuilder_ == null) {
        ensurePostsIsMutable();
        posts_.add(index, builderForValue.build());
        onChanged();
      } else {
        postsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.bulletinboard.Post posts = 1;</code>
     */
    public Builder addAllPosts(
        java.lang.Iterable<? extends com.bulletinboard.Post> values) {
      if (postsBuilder_ == null) {
        ensurePostsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, posts_);
        onChanged();
      } else {
        postsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.bulletinboard.Post posts = 1;</code>
     */
    public Builder clearPosts() {
      if (postsBuilder_ == null) {
        posts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        postsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.bulletinboard.Post posts = 1;</code>
     */
    public Builder removePosts(int index) {
      if (postsBuilder_ == null) {
        ensurePostsIsMutable();
        posts_.remove(index);
        onChanged();
      } else {
        postsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.bulletinboard.Post posts = 1;</code>
     */
    public com.bulletinboard.Post.Builder getPostsBuilder(
        int index) {
      return getPostsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.bulletinboard.Post posts = 1;</code>
     */
    public com.bulletinboard.PostOrBuilder getPostsOrBuilder(
        int index) {
      if (postsBuilder_ == null) {
        return posts_.get(index);  } else {
        return postsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.bulletinboard.Post posts = 1;</code>
     */
    public java.util.List<? extends com.bulletinboard.PostOrBuilder> 
         getPostsOrBuilderList() {
      if (postsBuilder_ != null) {
        return postsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(posts_);
      }
    }
    /**
     * <code>repeated .com.bulletinboard.Post posts = 1;</code>
     */
    public com.bulletinboard.Post.Builder addPostsBuilder() {
      return getPostsFieldBuilder().addBuilder(
          com.bulletinboard.Post.getDefaultInstance());
    }
    /**
     * <code>repeated .com.bulletinboard.Post posts = 1;</code>
     */
    public com.bulletinboard.Post.Builder addPostsBuilder(
        int index) {
      return getPostsFieldBuilder().addBuilder(
          index, com.bulletinboard.Post.getDefaultInstance());
    }
    /**
     * <code>repeated .com.bulletinboard.Post posts = 1;</code>
     */
    public java.util.List<com.bulletinboard.Post.Builder> 
         getPostsBuilderList() {
      return getPostsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.bulletinboard.Post, com.bulletinboard.Post.Builder, com.bulletinboard.PostOrBuilder> 
        getPostsFieldBuilder() {
      if (postsBuilder_ == null) {
        postsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.bulletinboard.Post, com.bulletinboard.Post.Builder, com.bulletinboard.PostOrBuilder>(
                posts_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        posts_ = null;
      }
      return postsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.bulletinboard.Posts)
  }

  // @@protoc_insertion_point(class_scope:com.bulletinboard.Posts)
  private static final com.bulletinboard.Posts DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.bulletinboard.Posts();
  }

  public static com.bulletinboard.Posts getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Posts>
      PARSER = new com.google.protobuf.AbstractParser<Posts>() {
    public Posts parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Posts(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Posts> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Posts> getParserForType() {
    return PARSER;
  }

  public com.bulletinboard.Posts getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
