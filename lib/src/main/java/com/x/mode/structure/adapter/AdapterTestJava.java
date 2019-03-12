package com.x.mode.structure.adapter;

/**
 * 适配器模式：
 *          将一个接口转换成客户希望的另一个接口，使接口不兼容的那些类可以一起工作，其别名为包装器(Wrapper)。适配器模式既可以作为类结构型模式，也可以作为对象结构型模式
 * 对象适配器：（使用频率更高）
 *          适配器与适配者是关联关系
 * 对象适配器模式包含如下角色：
 *          Target:目标抽象类定义客户所需接口，可以是一个抽象类或接口，也可以是具体类
 *          Adapter：适配器可以调用另一个接口，作为一个转换器，对Adapter和Target进行适配，适配器类是适配器模式核心，通过继承Target并关联一个Target对象使二者产生联系
 *          Adaptee：适配者即被适配的角色，定义了一个存在的接口，这个接口需要被适配，适配者类一般是一个具体类，包含了客户希望使用的业务方法
 * 类适配器：
 *          适配器与适配者之间是继承关系
 */
public class AdapterTestJava {
    public static void main(String[] args) {
        ScoreOperation operation = new OperationAdapter();
        int scores[] = {84,76,50,69,90,91,88,96}; //定义成绩数组
        int result[];
        int score;
        System.out.println("成绩排序结果:");
        result = operation.sort(scores);

        for (int i : result) {
            System.out.println(i+",");
        }
        System.out.println();

        System.out.println("查找成绩90：");
        score = operation.search(result, 90);
        if(score != -1) {
            System.out.println("找到成绩90。");
        }else {
            System.out.println("没有找到成绩90。");
        }

        System.out.println("查找成绩92：");
        score = operation.search(result, 92);
        if(score != -1) {
            System.out.println("找到成绩92。");
        }else {
            System.out.println("没有找到成绩92。");
        }
    }
}
