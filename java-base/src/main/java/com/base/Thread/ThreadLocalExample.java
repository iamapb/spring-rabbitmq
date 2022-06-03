package com.base.Thread;

import java.text.SimpleDateFormat;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadLocalExample  implements Runnable{

    private static final ThreadLocal<SimpleDateFormat> formatter = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyyMMdd HHmm"));


    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock(true);
        try {
            reentrantLock.lock();
        } catch (Exception e) {

        } finally {

        }
        System.out.println(Thread.currentThread().getName() + Thread.activeCount());
        System.out.println(16 << 4);
    }

    @Override
    public void run() {
        System.out.println("Thread Name=" + Thread.currentThread().getName() + formatter.get().toPattern());
    }
}
