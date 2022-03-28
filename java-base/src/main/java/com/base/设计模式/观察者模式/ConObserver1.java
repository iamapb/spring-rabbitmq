package com.base.设计模式.观察者模式;

/**
 * 具体观察者
 */
public class ConObserver1 implements Observer{
    @Override
    public void response() {
        System.out.println("收到通知1111---------");
    }
}
