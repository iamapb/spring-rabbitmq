package com.java.base.jvm;

import java.util.ArrayList;

/**
 * @author panbin
 * @date 2021年11月04日10:25 下午
 */
// jmap 使用
public class JmapTest {
    public static void main(String[] args) {
        ArrayList<byte[]> list = new ArrayList<byte[]>();
        for (int i = 0; i < 1000; i++) {
            byte[] arr = new byte[1024 * 100];
            list.add(arr);
            try {
                Thread.sleep(20);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
