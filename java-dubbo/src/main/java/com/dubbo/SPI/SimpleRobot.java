package com.dubbo.SPI;

public class SimpleRobot implements Robot {
    @Override
    public void sayHello() {
        System.out.println("Hello, I am a simple robot.");
    }
}
