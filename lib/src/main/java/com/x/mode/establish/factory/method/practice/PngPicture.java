package com.x.mode.establish.factory.method.practice;

public class PngPicture implements Picture {
    public PngPicture() {
        System.out.printf("Png读取器准备就绪！\n");
    }

    @Override
    public void readFormat() {
        System.out.printf("Png读取器开始读取\n");
    }
}
