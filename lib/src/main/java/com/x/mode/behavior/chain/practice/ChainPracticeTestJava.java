package com.x.mode.behavior.chain.practice;

/**
 * Sunny软件公司的OA系统需要提供一个假条审批模块：
 * 如果员工请假天数小于3天，主任可以审批该假条；
 * 如果员工请假天数大于等于3天，小于10天，经理可以审批；
 * 如果员工请假天数大于等于10天，小于30天，总经理可以审批；
 * 如果超过30天，总经理也不能审批，提示相应的拒绝信息。
 * 试用职责链模式设计该假条审批模块。
 */
public class ChainPracticeTestJava {
    public static void main(String[] args) {
        LeaveApproval laZR,laJL,laZJL;
        laZR = new LeaveDirector("X");
        laJL = new LeaveManager("XX");
        laZJL = new LeaveGeneralManager("XXX");

        //设置职责链
        laZR.setLeaveApprover(laJL);
        laJL.setLeaveApprover(laZJL);

        LeaveInfo leaveInfo = new LeaveInfo(2, "张三");
        LeaveInfo leaveInfo2 = new LeaveInfo(9, "李四");
        LeaveInfo leaveInfo3 = new LeaveInfo(29, "王五");
        LeaveInfo leaveInfo4 = new LeaveInfo(40, "赵六");

        laZR.handLeaveApproval(leaveInfo);
        laZR.handLeaveApproval(leaveInfo2);
        laZR.handLeaveApproval(leaveInfo3);
        laZR.handLeaveApproval(leaveInfo4);
    }
}
