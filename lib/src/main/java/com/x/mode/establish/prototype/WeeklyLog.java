package com.x.mode.establish.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.io.Serializable;

public class WeeklyLog implements Serializable {
    private String name;
    private String date;
    private String content;

    //对比浅克隆  与 深克隆
    private Attachment attachment;

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    //浅克隆，只能clone对象的值类型， 不能clone对象的引用类型
//    @Override
//    protected WeeklyLog clone() {
//        Object obj = null;
//        try {
//            obj = super.clone();
//            return (WeeklyLog)obj;
//        }catch (CloneNotSupportedException e) {
//            System.out.printf("不支持复制!!");
//            return null;
//        }
//    }

    //深克隆
    public WeeklyLog deepClone() throws IOException, ClassNotFoundException, OptionalDataException {
        //将对象写入流中
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(this);

        //将对象从流中取出
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        return (WeeklyLog) ois.readObject();
    }
}
