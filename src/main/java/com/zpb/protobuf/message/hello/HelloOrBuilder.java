// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hello.proto

package com.zpb.protobuf.message.hello;

public interface HelloOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.zpb.protobuf.message.hello.Hello)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>int32 age = 2;</code>
   * @return The age.
   */
  int getAge();

  /**
   * <code>string name = 3;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 3;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string address = 4;</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <code>string address = 4;</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();
}
