package com.x.mode.establish.single.practice;

public class OverLoadBalancer {
    private OverLoadBalancer() {

    }

    private static class ViewHolder{
        private static final OverLoadBalancer instance = new OverLoadBalancer();
    }

    public static OverLoadBalancer getInstance() {
        return ViewHolder.instance;
    }
}
