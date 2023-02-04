package com.zpb.protobuf.test;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import com.zpb.protobuf.message.hello.Hello;
import com.zpb.protobuf.message.hello.HelloOrBuilder;
import com.zpb.protobuf.message.hello.HelloOuterClass;

import java.util.Arrays;

/**
 * @author       pengbo.zhao
 * @description  
 * @createDate   2021/12/21 19:17
 * @updateDate   2021/12/21 19:17
 * @version      1.0
 */

public class HelloProtocolBuffersTest {

    public static void main(String[] args) throws InvalidProtocolBufferException {
        Hello hello = Hello.newBuilder().setName("张三").setAge(23).setAddress("北京").build();

        // 序列化
        byte[] bytes = hello.toByteArray();
        System.err.println("protobuf 数据："+ Arrays.toString(bytes));
        System.err.println("protobuf 序列化大小："+bytes.length);

        // 反序列化
        Hello parseHello = Hello.parseFrom(bytes);
        String json = JsonFormat.printer().print(parseHello);

        System.err.println("json格式："+json);
        System.err.println("json格式大小："+json.getBytes().length);
    }
}
