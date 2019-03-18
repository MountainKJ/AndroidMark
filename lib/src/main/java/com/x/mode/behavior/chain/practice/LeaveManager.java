package com.x.mode.behavior.chain.practice;

public class LeaveManager extends LeaveApproval {
    public LeaveManager(String name) {
        super(name);
    }

    @Override
    void handLeaveApproval(LeaveInfo leaveInfo) {
        if(leaveInfo.getLeaveDay() < 10) {
            System.out.println("经理【"+this.name+"】审批【"+leaveInfo.getName()+"】的请假【"+leaveInfo.getLeaveDay()+"】天");
        }else {
            this.leaveApprover.handLeaveApproval(leaveInfo);
        }
    }
}
