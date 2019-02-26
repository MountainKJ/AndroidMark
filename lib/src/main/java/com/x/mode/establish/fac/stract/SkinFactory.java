package com.x.mode.establish.fac.stract;

/**
 * 界面皮肤抽象工厂
 */
public interface SkinFactory {
    Button createButton();
    TextField createTextField();
    ComboBox createComboBox();
}
