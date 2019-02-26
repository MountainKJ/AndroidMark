package com.x.mode.establish.fac.method.practice;

public class PngReadFormatFactory implements ReadFormatFactory {
    @Override
    public Picture createPicture() {
        return new PngPicture();
    }
}
