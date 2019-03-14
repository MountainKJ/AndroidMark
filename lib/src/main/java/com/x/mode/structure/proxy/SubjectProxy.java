package com.x.mode.structure.proxy;

/**
 * 代理类【维护了一个真实主题对象的实例】，可以额外做一些其他操作
 */
public class SubjectProxy extends Subject {
    private RealSubject realSubject = new RealSubject();

    public void preExecute(){

    }

    @Override
    void execute() {
        preExecute();
        realSubject.execute();
        finallyExecute();
    }

    public void finallyExecute() {

    }
}
