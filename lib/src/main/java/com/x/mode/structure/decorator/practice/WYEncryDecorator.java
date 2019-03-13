package com.x.mode.structure.decorator.practice;

public class WYEncryDecorator extends EncryDecorator {
    public WYEncryDecorator(EncryComponent component) {
        super(component);
    }

    @Override
    void doEncry() {
        this.doWY();
        super.doEncry();
    }

    public void doWY() {
        System.out.println("进行位移加密！");
    }
}
