package com.x.mode.behavior.chain;

/**
 * 职责链模式
 *          避免请求发送者与接口者耦合在一起，让多个对象都有可能接受请求，将这些对象连接成一条链，并且沿着这条链传递请求，
 *          直到有对象处理它为止
 * 包含角色如下：
 *          Handler（抽象处理者）：
 *                  定义了处理请求的接口，一般设计为抽象类，由于不同具体处理者处理请求的方式不同，因此在其中定义了抽象请求处理方法
 *                  因为每一个处理者的下架还是处理者，因此在抽象处理者中定义了一个抽象处理者类型的对象，作为其下家的引用
 *          ConcreteHandler（具体处理者）：
 *                  抽象处理者的子类，可以处理用户请求，在具体处理者类中实现了抽象处理者中定义的抽象处理方法，在处理请求之前需要进行判断
 *                  看是否有相应的处理权限，如果可以处理请求就处理它，否则转发给后继者；在具体处理者中可以访问链中下一个对象，以便请求的
 *                  转发
 *
 */
public class ChainTestJava {
    public static void main(String[] args) {
        Approver wjzhang,gyang,jguo,meeting,rhuang;
        wjzhang = new Director("张无忌");
        rhuang = new Manager("黄蓉");
        gyang = new VicePresident("杨过");
        jguo = new President("郭靖");
        meeting = new Congress("董事会");

        //创建职责链
        wjzhang.setSuccessor(rhuang);
        rhuang.setSuccessor(gyang);
        gyang.setSuccessor(jguo);
        jguo.setSuccessor(meeting);

        //创建采购单
        PurchaseRequest pr1 = new PurchaseRequest(45000, 10001, "购买倚天剑");
        wjzhang.processRequest(pr1);

        PurchaseRequest pr2 = new PurchaseRequest(60000, 10002, "购买【葵花宝典】");
        wjzhang.processRequest(pr2);

        PurchaseRequest pr3 = new PurchaseRequest(160000, 10003, "购买【金刚经】");
        wjzhang.processRequest(pr3);

        PurchaseRequest pr4 = new PurchaseRequest(800000, 10004, "购买桃花岛");
        wjzhang.processRequest(pr4);
    }
}
