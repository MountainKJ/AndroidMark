package com.x.mode.establish.prototype.practice;

/**
 * 设计并实现一个客户类Customer，其中包含一个名为客户地址的成员变量，客户地址的类型为
 * Address，用浅克隆和深克隆分别实现Customer对象的复制并比较这两种克隆方式的异同。
 */
public class PracticePrototypeTestJava {
    public static void main(String[] args) {
        Customer tom_ori = new Customer();
        tom_ori.setName("张三");
        CustomerAddress ca_ori = new CustomerAddress();
        ca_ori.setContent("cqlp");
        tom_ori.setAddress(ca_ori);
        System.out.println(tom_ori.getName());
        System.out.println(tom_ori.getAddress().getContent());

        Customer tom_new = (Customer) tom_ori.clone();
        System.out.println(tom_new.getName());
        System.out.println(tom_new.getAddress().getContent());


        Customer tom_deep = null;
        try {
            tom_deep = tom_ori.deepClone();
        }catch (Exception e) {
            System.out.println("深克隆失败");
        }
        if(tom_deep != null) {
            System.out.println(tom_deep.getName());
            System.out.println(tom_deep.getAddress().getContent());
            System.out.println(tom_deep == tom_ori);
            System.out.println(tom_deep.getAddress() == tom_ori.getAddress());
        }

        System.out.println(tom_ori == tom_new);
        System.out.println(tom_ori.getAddress() == tom_new.getAddress());

    }
}
