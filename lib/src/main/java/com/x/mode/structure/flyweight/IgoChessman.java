package com.x.mode.structure.flyweight;

/**
 * 围棋棋子类【抽象享元类】
 *
 */
public abstract class IgoChessman {
    abstract String getColor();
    public void display(Coordinates coord) {
        System.out.println("棋子颜色："+this.getColor()+"\t棋子位置："+coord.getX()+":"+coord.getY());
    }
}
