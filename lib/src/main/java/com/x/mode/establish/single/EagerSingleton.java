package com.x.mode.establish.single;

/**
 * 恶汉式单例模式
 * 当类被加载时，静态变量instance会被初始化,可确保单例对象的唯一性
 */
public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
