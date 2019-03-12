package com.x.mode.structure.bridge;

public abstract class Img {
    protected ImageImp imp;

    public void setImp(ImageImp imp) {
        this.imp = imp;
    }

    public abstract void parseFile(String fileName);
}
