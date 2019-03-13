package com.x.mode.establish.builder.game;

public class HeroBuilder extends ActorBuilder {
    @Override
    void buildType() {
        actor.setType("英雄");
    }

    @Override
    void buildSex() {
        actor.setSex("男");
    }

    @Override
    void buildFace() {
        actor.setFace("英俊");
    }

    @Override
    void buildCostume() {
        actor.setCostume("盔甲");
    }

    @Override
    void buildHairStyle() {
        actor.setHairStyle("飘逸");
    }
}
