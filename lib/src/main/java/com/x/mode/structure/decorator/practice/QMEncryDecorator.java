package com.x.mode.structure.decorator.practice;

public class QMEncryDecorator extends EncryDecorator {
    public QMEncryDecorator(EncryComponent component) {
        super(component);
    }

    @Override
    void doEncry() {
        this.doQM();
        super.doEncry();
    }

    public void doQM() {
        System.out.println("执行高级求模加密");
    }
}
