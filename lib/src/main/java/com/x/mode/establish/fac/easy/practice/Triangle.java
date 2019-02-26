package com.x.mode.establish.fac.easy.practice;

public class Triangle implements Graphical {
    public Triangle() {
        System.out.printf("创建三角形！\n");
    }

    @Override
    public void draw() {
        System.out.printf("Triangle.draw()!\n");
    }

    @Override
    public void erase() {
        System.out.printf("Triangle.erase()!\n");
    }
}
