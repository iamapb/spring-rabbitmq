package com.base.juc;

import java.util.concurrent.CyclicBarrier;

/**
 * 等到所有的线程准备就绪后 才开始执行
 */
public class CyclicBarrierTest {

    private static CyclicBarrier barrier = new CyclicBarrier(8, () -> {

        System.out.println("所有运动员入场，裁判员一声令下！！！");

    });

    public static void main(String[] args) {

        System.out.println("运动员准备进场，全场欢呼......");

        for (int i = 0; i < 8; i++) {

            new Thread() {
                public void run() {

                    System.out.println(Thread.currentThread().getName() + " 运动员到达起点，准备好了！！！");

                    try {

                        barrier.await();// 运动员等待，等所有运动员全部到齐后一起开始比赛

                    } catch (Exception e) {

                        e.printStackTrace();

                    }

                    System.out.println(Thread.currentThread().getName() + " 运动员出发！！！");

                };

            }.start();
        }
    }
}


