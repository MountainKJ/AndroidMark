package com.x.mode.structure.decorator.practice;

public class TextFile extends EncryComponent {
    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    void doEncry() {
        System.out.println("文本【"+name+"】开始加密：");
    }
}
