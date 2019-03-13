package com.x.mode.establish.builder.practice;

public class CompletePlaerBuilder extends PlayerBuilder {
    @Override
    void builderMenu() {
        player.setMenu("完整模式菜单");
    }

    @Override
    void buildPlayList() {
        player.setPlayList("完整模式播放列表");
    }

    @Override
    void buildWindow() {
        player.setWindow("完整模式窗口");
    }

    @Override
    void buildController() {
        player.setController("完整模式控制条");
    }

    @Override
    void buildCollectList() {
        player.setController("完整模式收藏列表");
    }

    @Override
    public boolean showCollectList() {
        return false;
    }
}
