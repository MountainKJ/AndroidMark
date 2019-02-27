package com.x.mode.establish.prototype.manager;

public class SRS implements OfficialDocument {
    @Override
    public OfficialDocument clone() {
        OfficialDocument srs = null;
        try {
            srs = (OfficialDocument) super.clone();
        }catch (Exception e) {
            System.out.println("克隆失败SRS");
        }
        return srs;
    }

    @Override
    public void disPlay() {
        System.out.println("SRS.disPlay()");
    }
}
