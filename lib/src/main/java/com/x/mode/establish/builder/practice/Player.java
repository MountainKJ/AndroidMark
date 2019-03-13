package com.x.mode.establish.builder.practice;
//菜单、播放列表、主窗口、控制条/收藏列表
public class Player {
    private String menu;        //菜单
    private String playList;    //播放列表
    private String window;      //窗口
    private String controller;  //控制条
    private String collectList; //收藏列表

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getPlayList() {
        return playList;
    }

    public void setPlayList(String playList) {
        this.playList = playList;
    }

    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }

    public String getCollectList() {
        return collectList;
    }

    public void setCollectList(String collectList) {
        this.collectList = collectList;
    }

    @Override
    public String toString() {
        return "菜单："+menu+"\t播放列表："+playList+"\t窗口："+window+"\t控制条："+controller+"\t收藏列表："+collectList;
    }
}
