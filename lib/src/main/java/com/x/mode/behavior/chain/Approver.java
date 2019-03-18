package com.x.mode.behavior.chain;

//抽象处理者
public abstract class Approver {
    protected Approver successor;   //后继对象
    protected String name;          //审批中姓名

    public Approver(String name) {
        this.name = name;
    }

    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    public abstract void processRequest(PurchaseRequest request);
}
