package com.base.设计模式.单利模式;

/**
 * 懒汉式
 *
 * final 必须要初始化
 */
public class Mgr03 {

    private static Mgr03 INSTANCE ;
    private Mgr03() {

    }

    public static Mgr03 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Mgr03();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                System.out.println(Mgr03.getInstance().hashCode());
            }).start();
        }
    }

}
