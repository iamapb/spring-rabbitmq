package com.java.base.depends;

/**
 * 事件监听类 去监听事件
 */
public class EventListenerBean {

    public void initialize() {
        System.out.println("EventListenerBean initializing");
       EventManager.getInstance().addListener(s ->
                System.out.println("event reveived in eventListenerBean" + s));
    }
}
