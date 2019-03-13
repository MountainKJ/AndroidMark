package com.x.mode.structure.decorator;

/**
 * 抽象装饰类:构件装饰类
 */
public class ComponentDecorator extends DecoratorComponent {
    private DecoratorComponent component;

    public ComponentDecorator(DecoratorComponent component) {
        this.component = component;
    }

    @Override
    void display() {
        component.display();
    }
}
