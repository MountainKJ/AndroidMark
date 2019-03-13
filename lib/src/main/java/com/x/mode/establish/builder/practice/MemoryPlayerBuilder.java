package com.x.mode.establish.builder.practice;

public class MemoryPlayerBuilder extends PlayerBuilder {
    @Override
    void builderMenu() {
        player.setMenu("记忆模式菜单");
    }

    @Override
    void buildPlayList() {
        player.setPlayList("记忆模式播放列表");
    }

    @Override
    void buildWindow() {
        player.setWindow("记忆模式窗口");
    }

    @Override
    void buildController() {
        player.setController("记忆模式控制条");
    }

    @Override
    void buildCollectList() {
        player.setCollectList("记忆模式收藏列表");
    }

    @Override
    public boolean showMenu() {
        return false;
    }

    @Override
    public boolean showPlayList() {
        return false;
    }
}
