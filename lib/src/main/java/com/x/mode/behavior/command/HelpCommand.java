package com.x.mode.behavior.command;

//帮助命令类：具体命令类
public class HelpCommand extends Command {

    private HelpHandler hhObj;

    public HelpCommand() {
        hhObj = new HelpHandler();
    }

    @Override
    void execute() {
        hhObj.display();
    }
}
