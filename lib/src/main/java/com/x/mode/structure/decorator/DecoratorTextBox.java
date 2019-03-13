package com.x.mode.structure.decorator;

/**
 * 具体构件类：文本框
 */
public class DecoratorTextBox extends DecoratorComponent {
    @Override
    void display() {
        System.out.println("显示文本框");
    }
}
