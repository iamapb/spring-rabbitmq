package com.base.depends;

/**
 * 事件发布类 通过eventManager来发布事件
 */
public class EventPublisherBean {

    public void initialize() {
        System.out.println("eventPublishBean initializing");
        EventManager.getInstance().publish("event publish from evenetPublisherBean");
    }

}
