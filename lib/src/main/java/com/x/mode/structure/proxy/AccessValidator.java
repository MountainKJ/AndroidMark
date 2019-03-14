package com.x.mode.structure.proxy;

public class AccessValidator {
    public boolean validate(String userId) {
        if(userId.equals("杨过")) {
            System.out.println("登录成功");
            return true;
        }
        System.out.println("登录失败");
        return false;
    }
}
