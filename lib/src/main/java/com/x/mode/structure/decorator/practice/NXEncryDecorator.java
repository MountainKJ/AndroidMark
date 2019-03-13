package com.x.mode.structure.decorator.practice;

public class NXEncryDecorator extends EncryDecorator {
    public NXEncryDecorator(EncryComponent component) {
        super(component);
    }

    @Override
    void doEncry() {
        this.doNX();
        super.doEncry();
    }

    public void doNX() {
        System.out.println("进行逆向加密！");
    }
}
