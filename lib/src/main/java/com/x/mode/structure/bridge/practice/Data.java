package com.x.mode.structure.bridge.practice;

public abstract class Data {
    protected DataImp di;

    public void setDi(DataImp di) {
        this.di = di;
    }

    public abstract void parseFile(String fileName);
}
