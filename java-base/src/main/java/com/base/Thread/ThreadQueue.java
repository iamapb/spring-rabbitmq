package com.base.Thread;

import java.util.ArrayList;
import java.util.concurrent.*;

public class ThreadQueue {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        long start = System.currentTimeMillis();
        ArrayList<Future> queue = new ArrayList<Future>();
        for (int i = 0; i <= 9; i++) {
            queue.add(executorService.submit(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " ");
            }));
        }
        for (Future future : queue) {
            try {
                future.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}
