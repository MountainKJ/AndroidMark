package com.x.mode.establish.builder.game;

public class BuilderGameTestJava {
    public static void main(String[] args) {
        ActorBuilder actorBuilder = new AngelBuilder();
        Actor actor = ActorController.getInstance().construct(actorBuilder);
        System.out.println(actor.toString());
        System.out.println(ActorController.getInstance().construct(new HeroBuilder()).toString());
        System.out.println(ActorController.getInstance().construct(new DevilBuilder()).toString());
    }
}
