package com.x.mode.behavior.chain.practice;

/**
 * 抽象处理者：
 */
public abstract class LeaveApproval {
    protected String name;        //审批者姓名

    public LeaveApproval(String name) {
        this.name = name;
    }

    protected LeaveApproval leaveApprover;

    public void setLeaveApprover(LeaveApproval leaveApprover) {
        this.leaveApprover = leaveApprover;
    }

    abstract void handLeaveApproval(LeaveInfo leaveInfo);
}
