package com.x.mode.structure.bridge;

public class JPGImage extends Img {
    @Override
    public void parseFile(String fileName) {
        ImageMatrix im = new ImageMatrix();
        imp.doPaint(im);
        System.out.println(fileName+",格式为JPG.");
    }
}
