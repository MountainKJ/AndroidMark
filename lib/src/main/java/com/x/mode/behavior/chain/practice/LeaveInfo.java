package com.x.mode.behavior.chain.practice;

public class LeaveInfo {
    private int leaveDay;       //请假天数
    private String name;        //请假姓名

    public LeaveInfo(int leaveDay, String name) {
        this.leaveDay = leaveDay;
        this.name = name;
    }

    public int getLeaveDay() {
        return leaveDay;
    }

    public void setLeaveDay(int leaveDay) {
        this.leaveDay = leaveDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
