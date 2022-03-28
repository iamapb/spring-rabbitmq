package com.java.base.设计模式.模板方法.jdk8before;

import org.apache.commons.lang3.RandomUtils;

public abstract class AbstracBusinessHandler {

    public final void execute() {
        getNumber();
        handler();
        judge();
    }

    protected void getNumber() {
        System.out.println("number--" + RandomUtils.nextInt());
    };

    // 抽象方法办理业务，有子类实现
    protected abstract void handler();

    protected void judge() {
        System.out.println("give a praised");
    };
}
