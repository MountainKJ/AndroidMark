package com.x.mode.structure.composite.practice;

public class CompositePracticeTestJava {

    public static void main(String[] args) {
        AbstractView av1, av2;
        av1 = new ButtonView();
        av2 = new TextView();
        WindowView containerV = new WindowView();
        containerV.add(av1);
        containerV.add(av2);
        containerV.display();
    }
}
