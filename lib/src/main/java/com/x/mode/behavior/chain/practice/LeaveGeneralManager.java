package com.x.mode.behavior.chain.practice;

public class LeaveGeneralManager extends LeaveApproval {
    public LeaveGeneralManager(String name) {
        super(name);
    }

    @Override
    void handLeaveApproval(LeaveInfo leaveInfo) {
        if(leaveInfo.getLeaveDay() < 30) {
            System.out.println("总经理【"+this.name+"】审批【"+leaveInfo.getName()+"】的请假【"+leaveInfo.getLeaveDay()+"】天");
        }else {
            System.out.println("【"+leaveInfo.getName()+"】的请假天数超过30天，无法审批!");
        }
    }
}
