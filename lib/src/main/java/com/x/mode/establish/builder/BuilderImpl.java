package com.x.mode.establish.builder;

public class BuilderImpl extends Builder {
    @Override
    void buildPartA() {
        product.setPartA("BuilderImpl--AAAAAA");
    }

    @Override
    void buildPartB() {
        product.setPartB("BuilderImpl--BBBBBB");
    }

    @Override
    void buildPartC() {
        product.setPartC("BuilderImpl--CCCCCCC");

    }
}
