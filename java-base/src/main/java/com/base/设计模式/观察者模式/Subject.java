package com.base.设计模式.观察者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象目标
 */
public abstract class Subject {

    // 增加观察者的引用
    protected List<Observer> observers = new ArrayList<Observer>();

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void remove(Observer observer) {
        observers.remove(observer);
    }

    public abstract void notifyObserver();
}
