package com.x.mode.structure.bridge;

public class LinuxImp implements ImageImp {
    @Override
    public void doPaint(ImageMatrix m) {
        System.out.println("Linux doPaint");
    }
}
