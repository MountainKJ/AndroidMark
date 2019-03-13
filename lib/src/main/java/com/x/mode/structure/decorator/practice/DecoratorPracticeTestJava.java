package com.x.mode.structure.decorator.practice;

public class DecoratorPracticeTestJava {
    public static void main(String[] args) {
        EncryComponent componentTxt,componentWY,componentNX;
        componentTxt = new TextFile("总裁");
        componentWY = new WYEncryDecorator(componentTxt);
        componentNX = new NXEncryDecorator(componentWY);
        componentNX.doEncry();
    }
}
