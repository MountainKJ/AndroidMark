package com.x.mode.establish.builder.game;

public abstract class ActorBuilder {
    protected Actor actor = new Actor();
    abstract void buildType();
    abstract void buildSex();
    abstract void buildFace();
    abstract void buildCostume();
    abstract void buildHairStyle();

    public Actor createActor() {
        return actor;
    }
}
