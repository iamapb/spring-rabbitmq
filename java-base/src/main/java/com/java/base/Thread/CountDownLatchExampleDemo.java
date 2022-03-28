package com.java.base.Thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchExampleDemo {

    private static final int countDown = 6;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        CountDownLatch countDownLatch = new CountDownLatch(countDown);

        for (int i = 0; i < countDown; i++) {
            final int threadNum = i;
            executorService.execute(() -> {
                try {
                    System.out.println("======================");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                finally {
                    countDownLatch.countDown();
                }
            });
        }

        countDownLatch.await();
        executorService.shutdown();
        System.out.println("finish");
    }
}
