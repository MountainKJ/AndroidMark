package com.x.mode.establish.prototype.manager;

public class FAR implements OfficialDocument {
    @Override
    public OfficialDocument clone() {
        OfficialDocument far = null;
        try {
            far = (OfficialDocument) super.clone();
        }catch (Exception e) {
            System.out.println("不支持复制");
        }
        return far;
    }

    @Override
    public void disPlay() {
        System.out.println("FAR.disPlay()");
    }
}
