package com.x.mode.establish.factory.stract;

/**
 * 界面皮肤抽象工厂
 */
public interface SkinFactory {
    Button createButton();
    TextField createTextField();
    ComboBox createComboBox();
}
