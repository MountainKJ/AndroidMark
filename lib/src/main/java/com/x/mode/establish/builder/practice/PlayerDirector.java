package com.x.mode.establish.builder.practice;

public class PlayerDirector {
    private static class PlayerDirectorHolder{
        private static final PlayerDirector instance = new PlayerDirector();
    }

    public static PlayerDirector getInstance() {
        return PlayerDirectorHolder.instance;
    }

    public Player construct(PlayerBuilder builder) {
        Player player;
        if(builder.showMenu()) {
            builder.builderMenu();
        }
        if(builder.showPlayList()) {
            builder.buildPlayList();
        }

        if(builder.showCollectList()){
            builder.buildCollectList();
        }
        builder.buildWindow();
        builder.buildController();
        player = builder.createPlayer();
        return player;
    }
}


