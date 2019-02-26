package com.x.mode.establish.factory.method.practice;

public class GifReadFormatFactory implements ReadFormatFactory {

    @Override
    public Picture createPicture() {
        return new GifPicture();
    }
}
