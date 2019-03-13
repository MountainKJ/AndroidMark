package com.x.mode.establish.builder.game;

/**
 * 人物角色类【产品类】
 */
public class Actor {
    private String type;        //角色类型
    private String sex;         //角色性别
    private String face;        //脸型
    private String costume;     //服装
    private String hairStyle;   //发型

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getCostume() {
        return costume;
    }

    public void setCostume(String costume) {
        this.costume = costume;
    }

    public String getHairStyle() {
        return hairStyle;
    }

    public void setHairStyle(String hairStyle) {
        this.hairStyle = hairStyle;
    }

    @Override
    public String toString() {
        return "类型："+type+"\t性别："+sex+"\t面容："+face+"\t服装："+costume+"\t发型："+hairStyle;
    }
}
