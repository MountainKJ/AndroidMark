package com.x.mode.establish.builder.game;

public class DevilBuilder extends ActorBuilder {
    @Override
    void buildType() {
        actor.setType("恶魔");
    }

    @Override
    void buildSex() {
        actor.setSex("妖");
    }

    @Override
    void buildFace() {
        actor.setFace("丑陋");
    }

    @Override
    void buildCostume() {
        actor.setCostume("黑衣");
    }

    @Override
    void buildHairStyle() {
        actor.setHairStyle("光头");
    }
}
