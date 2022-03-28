package com.base.设计模式.命令模式;

import lombok.Data;

@Data
public class SpecificInformMsg implements InformMsg{

    public Executer executer;


    public SpecificInformMsg(Executer executer) {
        this.executer = executer;
    }

    @Override
    public void execute(String name) {
        executer.execute(name);
    }
}
