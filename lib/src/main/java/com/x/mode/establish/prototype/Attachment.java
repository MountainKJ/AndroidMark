package com.x.mode.establish.prototype;

import java.io.Serializable;

//附件
public class Attachment implements Serializable {
    private String name;    //附件名称

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void download() {
        System.out.println("下载附件，文件名为【"+name+"】");
    }
}
