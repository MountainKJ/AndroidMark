package com.x.mode.establish.builder.game;

public class ActorController {
    private static class ActorControllerHolder{
        private final static ActorController instance = new ActorController();
    }

    public static ActorController getInstance(){
        return ActorControllerHolder.instance;
    }

    public Actor construct(ActorBuilder ab) {
        Actor actor;
        ab.buildType();
        ab.buildSex();
        ab.buildFace();
        ab.buildCostume();
        ab.buildHairStyle();
        actor = ab.createActor();
        return actor;
    }
}
