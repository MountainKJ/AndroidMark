package com.x.mode.structure.decorator.practice;

public class EncryDecorator extends EncryComponent {
    private EncryComponent component;

    public EncryDecorator(EncryComponent component) {
        this.component = component;
    }

    @Override
    void doEncry() {
        component.doEncry();
    }
}
