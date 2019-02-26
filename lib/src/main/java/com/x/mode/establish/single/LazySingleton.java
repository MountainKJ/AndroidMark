package com.x.mode.establish.single;

/**
 * 懒汉式单例模式
 * 注意：如果使用双重检查锁定来实现懒汉式单例类，需要在静态成员变量instance之前增加修饰符volatile，被volatile修饰的成员变量可以确保多个线程都能够正确处理
 */
public class LazySingleton {
    private static volatile LazySingleton instance = null;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if(instance == null) {
            synchronized(LazySingleton.class) {
                if(instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
