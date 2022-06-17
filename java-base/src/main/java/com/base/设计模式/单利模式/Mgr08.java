package com.base.设计模式.单利模式;

/**
 * 线程安全 ，防止反序列
 */
public enum Mgr08 {

    INSTANCE;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                System.out.println(INSTANCE.hashCode());
            }).start();
        }
    }
}
