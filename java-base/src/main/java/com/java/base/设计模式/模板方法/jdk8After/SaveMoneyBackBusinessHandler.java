package com.java.base.设计模式.模板方法.jdk8After;

import java.math.BigDecimal;

public class SaveMoneyBackBusinessHandler extends BankBusinessHandler{

    public void save(BigDecimal amount) {
        execute(a -> System.out.println("我的" + amount));
    }

    public void delete(BigDecimal amount) {
        execute(a -> System.out.println("删除" + amount));
    }
}
