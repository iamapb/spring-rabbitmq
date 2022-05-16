package com.dubbo.SPI;

public class ExtendRobot implements Robot {

    @Override
    public void sayHello() {
        System.out.println("ExtendRobot sayHello");
    }
}
