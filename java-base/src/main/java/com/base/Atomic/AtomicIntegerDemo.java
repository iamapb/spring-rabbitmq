package com.base.Atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerDemo {

    private static AtomicInteger atomicInteger = new AtomicInteger();

    public static void main(String[] args) {
        System.out.println(atomicInteger.get());
        System.out.println(atomicInteger.getAndSet(2));

        System.out.println(atomicInteger.get());
        atomicInteger.incrementAndGet();
    }
}
