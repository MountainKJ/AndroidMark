package com.youqi.note.model;

public class StringItem {
    private String str;
    private int itemId;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public StringItem(String str, int itemId) {
        this.str = str;
        this.itemId = itemId;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
