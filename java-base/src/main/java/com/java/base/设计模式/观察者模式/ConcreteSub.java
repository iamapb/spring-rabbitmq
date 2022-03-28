package com.java.base.设计模式.观察者模式;

public class ConcreteSub extends Subject {

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.response();
        }
    }
}
