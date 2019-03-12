package com.x.mode.structure.composite;

/**
 * 抽象构件
 */
public abstract class AbstractFile {
    protected void add(AbstractFile file){
        System.out.println("对不起不支持该方法");
    }

    protected void remove(AbstractFile file){
        System.out.println("对不起不支持该方法");

    }

    protected AbstractFile getChild(int i){
        System.out.println("对不起不支持该方法");
        return null;
    }

    abstract void killVirus();
}
