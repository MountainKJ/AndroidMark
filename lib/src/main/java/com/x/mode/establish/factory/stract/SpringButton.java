package com.x.mode.establish.factory.stract;

/**
 * 具体产品
 */
public class SpringButton implements Button {
    @Override
    public void disPlay() {
        System.out.printf("SpringButton.disPlay()!\n");
    }
}
