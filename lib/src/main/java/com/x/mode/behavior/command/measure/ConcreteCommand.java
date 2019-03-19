package com.x.mode.behavior.command.measure;

//具体命令类
public class ConcreteCommand extends AbstractCommand {
    private Adder adder = new Adder();
    private int value;

    @Override
    int execute(int value) {
        this.value = value;
        return adder.add(value);
    }

    @Override
    int undo() {
        return adder.add(-value);
    }
}
