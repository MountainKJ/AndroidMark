package com.x.mode.structure.decorator;

/**
 * 窗体类：具体构件类
 */
public class DecoratorWindow extends DecoratorComponent {
    @Override
    void display() {
        System.out.println("显示窗体！");
    }
}
