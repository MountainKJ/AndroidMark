package com.x.mode.establish.factory.easy.practice;

public class Circle implements Graphical {
    public Circle() {
        System.out.printf("创建圆形！\n");
    }

    @Override
    public void draw() {
        System.out.printf("Circle.draw()！\n");
    }

    @Override
    public void erase() {
        System.out.printf("Circle.erase()!\n");
    }
}
