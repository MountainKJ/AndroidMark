package com.x.mode.structure.decorator;

/**
 * 具体构件类：列表框类
 */
public class DecoratorListBox extends DecoratorComponent {
    @Override
    void display() {
        System.out.println("显示列表框");
    }
}
