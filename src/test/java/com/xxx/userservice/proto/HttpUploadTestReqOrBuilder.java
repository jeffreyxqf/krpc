// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: userservice.proto

package com.xxx.userservice.proto;

public interface HttpUploadTestReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:HttpUploadTestReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string httpContentType = 1;</code>
   */
  java.lang.String getHttpContentType();
  /**
   * <code>string httpContentType = 1;</code>
   */
  com.google.protobuf.ByteString
      getHttpContentTypeBytes();

  /**
   * <code>string httpContent = 2;</code>
   */
  java.lang.String getHttpContent();
  /**
   * <code>string httpContent = 2;</code>
   */
  com.google.protobuf.ByteString
      getHttpContentBytes();

  /**
   * <code>string a = 3;</code>
   */
  java.lang.String getA();
  /**
   * <code>string a = 3;</code>
   */
  com.google.protobuf.ByteString
      getABytes();

  /**
   * <code>string b = 4;</code>
   */
  java.lang.String getB();
  /**
   * <code>string b = 4;</code>
   */
  com.google.protobuf.ByteString
      getBBytes();

  /**
   * <code>repeated .UploadFile files = 5;</code>
   */
  java.util.List<com.xxx.userservice.proto.UploadFile> 
      getFilesList();
  /**
   * <code>repeated .UploadFile files = 5;</code>
   */
  com.xxx.userservice.proto.UploadFile getFiles(int index);
  /**
   * <code>repeated .UploadFile files = 5;</code>
   */
  int getFilesCount();
  /**
   * <code>repeated .UploadFile files = 5;</code>
   */
  java.util.List<? extends com.xxx.userservice.proto.UploadFileOrBuilder> 
      getFilesOrBuilderList();
  /**
   * <code>repeated .UploadFile files = 5;</code>
   */
  com.xxx.userservice.proto.UploadFileOrBuilder getFilesOrBuilder(
      int index);
}
