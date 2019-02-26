package com.x.mode.establish.factory.easy;

public class Factory {
    public static Product getProduct(String arg) {
        Product product = null;
        if(arg.equalsIgnoreCase("A")) {
            product = new ProductA();
        }
        else if(arg.equalsIgnoreCase("B")) {
            product = new ProductB();
        }

        return product;
    }
}
