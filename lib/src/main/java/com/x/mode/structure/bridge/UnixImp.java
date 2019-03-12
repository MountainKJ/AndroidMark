package com.x.mode.structure.bridge;

public class UnixImp implements ImageImp {
    @Override
    public void doPaint(ImageMatrix m) {
        System.out.println("Unix doPaint");
    }
}
