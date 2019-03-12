package com.x.mode.structure.bridge;

public class WindowsImp implements ImageImp {
    @Override
    public void doPaint(ImageMatrix m) {
        System.out.println("windows doPaint");
    }
}
