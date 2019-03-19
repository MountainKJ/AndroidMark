package com.x.mode.behavior.command.measure;

//加法类：请求接受
public class Adder {
    private int num = 0;
    public int add(int value) {
        num += value;
        return num;
    }
}
