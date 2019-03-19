package com.x.mode.behavior.command;

public class MinimizeCommand extends Command {
    private WindowHelper whObj;

    public MinimizeCommand() {
        whObj = new WindowHelper();
    }

    @Override
    void execute() {
        whObj.minimize();
    }
}
