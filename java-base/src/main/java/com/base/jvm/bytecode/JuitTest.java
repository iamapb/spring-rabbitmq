package com.base.jvm.bytecode;

import org.openjdk.jol.info.ClassLayout;

public class JuitTest {

    private static class T {
        int l;
        long hell;
        boolean flag;
        String name = "hello world netty";
    }

    public static void main(String[] args) {
        T t = new T();
        System.out.println(ClassLayout.parseInstance(t).toPrintable());
    }
}
