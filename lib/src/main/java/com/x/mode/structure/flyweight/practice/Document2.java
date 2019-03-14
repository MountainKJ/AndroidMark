package com.x.mode.structure.flyweight.practice;

public class Document2 extends AbstractDoc {
    @Override
    String getImg() {
        return "doc【2】.jpg";
    }

    @Override
    String getAnim() {
        return "doc【2】.gif";
    }

    @Override
    String getVideo() {
        return "doc【2】.mp3";
    }
}
