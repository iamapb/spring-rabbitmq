package com.base.Thread;

import java.util.concurrent.LinkedTransferQueue;

// transfreQueue 进行两个线程 交替输出  一个输出1234567 一个输出 ABCDEFG
public class TransferQueue {


    public static void main(String[] args) {
        char[] aI = "1234567".toCharArray();
        char[] aO = "ABCDEFG".toCharArray();
        LinkedTransferQueue<Character> queue = new LinkedTransferQueue<>();
        new Thread(() -> {
            for (char c : aI) {
                try {
                    System.out.printf(String.valueOf(queue.take()));
                    queue.transfer(c);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "t1").start();

        new Thread(() -> {
            for (char c : aO) {
                try {
                    queue.transfer(c);
                    System.out.printf(String.valueOf(queue.take()));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "t2").start();
    }
}
