package com.x.mode.establish.fac.easy.practice;

public class Square implements Graphical {
    public Square() {
        System.out.printf("方形创建!\n");
    }

    @Override
    public void draw() {
        System.out.printf("Square.draw()!\n");
    }

    @Override
    public void erase() {
        System.out.printf("Square.erase()!\n");
    }
}
