package com.base.设计模式.装饰器模式;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("========= Circle 发送========");
    }
}
