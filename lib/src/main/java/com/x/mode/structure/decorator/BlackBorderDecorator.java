package com.x.mode.structure.decorator;

public class BlackBorderDecorator extends ComponentDecorator {
    public BlackBorderDecorator(DecoratorComponent component) {
        super(component);
    }

    @Override
    void display() {
        this.setBlackBorder();
        super.display();
    }

    public void setBlackBorder() {
        System.out.println("为构件增加黑色边框");
    }
}
