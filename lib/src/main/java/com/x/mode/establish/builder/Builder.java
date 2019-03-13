package com.x.mode.establish.builder;

/**
 * 抽象建造者类
 */
public abstract class Builder {
    protected Product product = new Product();
    abstract void buildPartA();
    abstract void buildPartB();
    abstract void buildPartC();

    public Product getResult() {
        return product;
    }
}
