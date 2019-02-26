package com.x.mode.establish.fac.method.practice;

public class GifPicture implements Picture{
    public GifPicture() {
        System.out.printf("GifPicture init()!\n");
    }

    @Override
    public void readFormat() {
        System.out.printf("GifPicture.readFormat()!\n");
    }
}
