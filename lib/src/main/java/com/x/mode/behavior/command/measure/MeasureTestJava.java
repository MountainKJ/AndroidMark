package com.x.mode.behavior.command.measure;

public class MeasureTestJava {
    public static void main(String[] args) {
        AbstractCommand ac = new ConcreteCommand();
        CalculatorForm cf = new CalculatorForm();
        cf.setCommand(ac);

        cf.compute(1);
        cf.compute(2);
        cf.compute(3);
        cf.undo();
        cf.undo();
    }
}
