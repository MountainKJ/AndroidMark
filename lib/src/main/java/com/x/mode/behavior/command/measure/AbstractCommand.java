package com.x.mode.behavior.command.measure;

public abstract class AbstractCommand {
    abstract int execute(int value);        //声明命令方法
    abstract int undo();                    //声明撤销方法
}
