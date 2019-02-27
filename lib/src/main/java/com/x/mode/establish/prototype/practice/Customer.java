package com.x.mode.establish.prototype.practice;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.io.Serializable;

public class Customer implements Cloneable, Serializable {
    private String name;
    private CustomerAddress address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomerAddress getAddress() {
        return address;
    }

    public void setAddress(CustomerAddress address) {
        this.address = address;
    }

    //浅克隆必须实现cloneAble
    @Override
    protected Object clone() {
        Object obj;
        try{
            obj = super.clone();
            return obj;
        }catch (Exception e) {
            System.out.println("浅克隆失败");
            return null;
        }
    }

    public Customer deepClone()throws IOException, ClassNotFoundException, OptionalDataException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (Customer) ois.readObject();
    }
}
