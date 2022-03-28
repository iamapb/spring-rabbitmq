package com.base.设计模式.模板方法.jdk8After;

import org.apache.commons.lang3.RandomUtils;

import java.math.BigDecimal;
import java.util.function.Consumer;

public class BankBusinessHandler {

    public final void execute(Consumer<BigDecimal> consumer) {
        consumer.accept(null);
    }
}
