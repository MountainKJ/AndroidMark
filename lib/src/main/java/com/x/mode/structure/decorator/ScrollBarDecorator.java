package com.x.mode.structure.decorator;

//滚动条装饰类：具体装饰类
public class ScrollBarDecorator extends ComponentDecorator {
    public ScrollBarDecorator(DecoratorComponent component) {
        super(component);
    }

    @Override
    void display() {
        this.setScrollBar();
        super.display();
    }

    public void setScrollBar() {
        System.out.println("为构件增加滚动条！");
    }
}
