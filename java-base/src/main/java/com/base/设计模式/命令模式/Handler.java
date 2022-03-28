package com.base.设计模式.命令模式;

public class Handler {

    private InformMsg informMsg;

    public Handler(InformMsg informMsg) {
        super();
        this.informMsg = informMsg;
    }

    public void sendMes(String name) {
        informMsg.execute(name);
    }
}
