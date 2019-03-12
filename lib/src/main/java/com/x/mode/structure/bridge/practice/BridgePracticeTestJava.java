package com.x.mode.structure.bridge.practice;

/**
 * Sunny软件公司欲开发一个数据转换工具，可以将数据库中的数据转换成多种文件格式，例如txt、xml、pdf等格式，
 * 同时该工具需要支持多种不同的数据库。试使用桥接模式对其进行设计。
 */
public class BridgePracticeTestJava {
    public static void main(String[] args) {
        Data data = new TxtData();
        DataImp di = new SqlServerImp();
        data.setDi(di);
        data.parseFile("123");
    }
}
