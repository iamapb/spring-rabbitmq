package com.base.设计模式.观察者模式;

/**
 * 观察者模式 就是将被观察者添加到具体的
 */
public class ObserverDemo {

    public static void main(String[] args) {
        Subject subject = new ConcreteSub();
        ConObserver1 conObserver1 = new ConObserver1();
        subject.add(conObserver1);
        subject.notifyObserver();
    }
}
