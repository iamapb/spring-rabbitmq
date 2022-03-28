package com.java.base.设计模式.模板方法.jdk8After;

import java.math.BigDecimal;

public class DemoHandler {
    public static void main(String[] args) {
        SaveMoneyBackBusinessHandler handler = new SaveMoneyBackBusinessHandler();
        handler.save(new BigDecimal("1000"));
        handler.delete(new BigDecimal("9990"));
    }
}
