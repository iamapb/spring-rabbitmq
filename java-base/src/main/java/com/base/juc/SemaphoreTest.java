package com.base.juc;

import java.util.Random;
import java.util.concurrent.Semaphore;

/**
 * 使用信号量测试功能
 */
public class SemaphoreTest {

    private static Semaphore semaphore = new Semaphore(10);
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {

                @Override
                public void run() {
                    try {
                        System.out.println("=====" + Thread.currentThread().getName() + "来到停车场了");
                        if (semaphore.availablePermits() == 0) {
                            System.out.println("车位不足,请等待");
                        }
                        semaphore.acquire(); // 获取令牌尝试进入停车场
                        System.out.println("=====" + Thread.currentThread().getName() + "成功进入停车场");
                        Thread.sleep(new Random().nextInt(1000));
                        System.out.println("-----" + Thread.currentThread().getName() + "离开停车场");
                        semaphore.release(); // 释放令牌
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
