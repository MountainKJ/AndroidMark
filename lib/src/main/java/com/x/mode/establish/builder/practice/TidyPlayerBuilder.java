package com.x.mode.establish.builder.practice;

public class TidyPlayerBuilder extends PlayerBuilder {
    @Override
    void builderMenu() {
        player.setController("精简模式菜单");
    }

    @Override
    void buildPlayList() {
        player.setPlayList("精简模式播放列表");
    }

    @Override
    void buildWindow() {
        player.setWindow("精简模式窗口");
    }

    @Override
    void buildController() {
        player.setController("精简模式控制条");
    }

    @Override
    void buildCollectList() {
        player.setCollectList("精简模式收藏列表");
    }

    @Override
    public boolean showMenu() {
        return false;
    }

    @Override
    public boolean showCollectList() {
        return false;
    }

    @Override
    public boolean showPlayList() {
        return false;
    }
}
