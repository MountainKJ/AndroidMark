package com.x.mode.structure.bridge;

public class GIFImage extends Img {
    @Override
    public void parseFile(String fileName) {
        ImageMatrix im = new ImageMatrix();
        imp.doPaint(im);
        System.out.println(fileName+"，格式为GIF.");
    }
}
