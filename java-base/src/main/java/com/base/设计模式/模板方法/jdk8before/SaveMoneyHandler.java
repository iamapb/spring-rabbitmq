package com.base.设计模式.模板方法.jdk8before;

public class SaveMoneyHandler extends AbstracBusinessHandler{

    @Override
    protected void handler() {
        System.out.println("save 1000");
    }
}
