package com.x.mode.establish.builder.practice;

public abstract class PlayerBuilder {
    protected Player player = new Player();
    abstract void builderMenu();
    abstract void buildPlayList();
    abstract void buildWindow();
    abstract void buildController();
    abstract void buildCollectList();

    public boolean showMenu(){
        return true;
    }

    public boolean showCollectList() {
        return true;
    }

    public boolean showPlayList() {
        return true;
    }

    public Player createPlayer() {
        return player;
    }
}
