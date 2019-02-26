package com.x.mode.establish.factory.method.practice;

public class PngReadFormatFactory implements ReadFormatFactory {
    @Override
    public Picture createPicture() {
        return new PngPicture();
    }
}
