package com.x.mode.behavior.chain;

/**
 * 主任类：具体处理者
 */
public class Director extends Approver {
    public Director(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if(request.getAmount() < 50000) {
            System.out.println("主任"+this.name+"审批采购单："+request.getNumber()+"\t金额："+request.getAmount()+"元，" +
                    "采购目的："+request.getPurpose()+"。");
        }else {
            this.successor.processRequest(request);
        }
    }
}
