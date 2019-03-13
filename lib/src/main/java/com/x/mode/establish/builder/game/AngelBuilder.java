package com.x.mode.establish.builder.game;

public class AngelBuilder extends ActorBuilder {
    @Override
    void buildType() {
        actor.setType("天使");
    }

    @Override
    void buildSex() {
        actor.setSex("女");
    }

    @Override
    void buildFace() {
        actor.setFace("漂亮");
    }

    @Override
    void buildCostume() {
        actor.setCostume("白裙");
    }

    @Override
    void buildHairStyle() {
        actor.setHairStyle("披肩长发");
    }
}
