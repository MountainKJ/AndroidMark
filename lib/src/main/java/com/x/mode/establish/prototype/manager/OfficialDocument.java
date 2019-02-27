package com.x.mode.establish.prototype.manager;

/**
 * 抽象公文接口，提供clone方法实现，将业务方法声明为抽象方法
 */
public interface OfficialDocument extends Cloneable{
    OfficialDocument clone();
    void disPlay();
}
