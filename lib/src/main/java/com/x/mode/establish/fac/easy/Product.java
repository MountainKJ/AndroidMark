package com.x.mode.establish.fac.easy;

/**
 * 抽象产品角色：他是工厂类所创建的所有对象的父类，封装了各种产品对象的共有方法
 *              在工厂类中只需要定义一个通用的工厂方法，因为具体的产品对象都是它
 *              的子类
 */
public abstract class Product {
    //所有产品类的公共业务方法
    public void methodName() {
        System.out.printf("Product.methodName()>>>>>>\n");
    }

    //抽象业务方法
    public abstract void methodDiff();
}
