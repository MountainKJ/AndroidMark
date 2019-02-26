package com.x.mode.establish.single.practice;

public class EagerLoadBalancer {
    private static EagerLoadBalancer instance = new EagerLoadBalancer();
    private EagerLoadBalancer(){

    }

    public static EagerLoadBalancer getInstance() {
        return instance;
    }
}
