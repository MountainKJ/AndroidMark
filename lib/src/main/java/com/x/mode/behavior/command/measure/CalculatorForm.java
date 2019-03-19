package com.x.mode.behavior.command.measure;

//请求发送者
public class CalculatorForm {
    private AbstractCommand command;

    public void setCommand(AbstractCommand command) {
        this.command = command;
    }

    public void compute(int value) {
        int a = command.execute(value);
        System.out.println("执行运算："+ a);
    }

    public void undo() {
        int i = command.undo();
        System.out.println("执行撤销:"+i);
    }
}
