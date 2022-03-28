package com.base.设计模式.命令模式;

/**
 * 命令模式的理解
 */
public class CommandDemo {

    public static void main(String[] args) {

        InformMsg informMsg = new SpecificInformMsg(new Executer());
        Handler handler = new Handler(informMsg);
        handler.sendMes("三连");
    }
}
