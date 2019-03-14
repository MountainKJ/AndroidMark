package com.x.mode.structure.flyweight.practice;

public class Document1 extends AbstractDoc {
    @Override
    String getImg() {
        return "doc【1】.jpg";
    }

    @Override
    String getAnim() {
        return "doc【1】.gif";
    }

    @Override
    String getVideo() {
        return "doc【1】.mp3";
    }
}
