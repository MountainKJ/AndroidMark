package com.x.mode.behavior.chain.practice;

public class LeaveDirector extends LeaveApproval {
    public LeaveDirector(String name) {
        super(name);
    }

    @Override
    void handLeaveApproval(LeaveInfo leaveInfo) {
        if(leaveInfo.getLeaveDay() < 3) {
            System.out.println("主任【"+this.name+"】审批【"+leaveInfo.getName()+"】的请假【"+leaveInfo.getLeaveDay()+"】天");
        }else {
            this.leaveApprover.handLeaveApproval(leaveInfo);
        }
    }
}
