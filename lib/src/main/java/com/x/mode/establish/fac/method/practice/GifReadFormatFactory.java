package com.x.mode.establish.fac.method.practice;

public class GifReadFormatFactory implements ReadFormatFactory {

    @Override
    public Picture createPicture() {
        return new GifPicture();
    }
}
