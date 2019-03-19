package com.x.mode.behavior.command;

import java.util.ArrayList;

public class FBSettingWindow {
    private String title;       //窗口标题
    private ArrayList<FunctionButton> functionButtons = new ArrayList<>();      //定义集合存储所有功能键

    public FBSettingWindow(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addFunctionButton(FunctionButton fb) {
        functionButtons.add(fb);
    }

    public void removeFunctionButton(FunctionButton fb) {
        functionButtons.remove(fb);
    }

    public void display() {
        System.out.println("显示窗口【"+this.title+"】");
        System.out.println("显示功能键：");
        for (FunctionButton functionButton : functionButtons) {
            System.out.println(functionButton.getName());
        }
        System.out.println("----------------------------------");
    }
}
