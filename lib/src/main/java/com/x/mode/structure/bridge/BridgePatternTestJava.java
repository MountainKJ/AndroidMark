package com.x.mode.structure.bridge;

/**
 * 桥接模式
 *      抽象部分与它的实现部分分离，使它们都可以独立地变化。它是一种对象结构型模式，又称为柄体(Handle and Body)模式或接口(Interface)模式。
 */
public class BridgePatternTestJava {
    public static void main(String[] args) {
        Img img;
        ImageImp imp;
        img = new GIFImage();
        imp = new LinuxImp();
        img.setImp(imp);
        img.parseFile("亚瑟");
    }
}
