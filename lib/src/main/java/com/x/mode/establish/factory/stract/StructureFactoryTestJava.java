package com.x.mode.establish.factory.stract;

/**
 * 抽象工厂模式：
 *              提供一个创建一系列相关或相互依赖对象的接口，而无须指定它们具体的类。抽象工厂模式又称为Kit模式，它是一种对象创建型模式。
 *              与工厂方法模式相比，抽象工厂模式中的具体工厂不只是创建一种产品，它负责创建一族产品。
 *
 * 总结：
 * 这也是抽象工厂模式最大的缺点。在抽象工厂模式中，增加新的产品族很方便，但是增加新的产品等级结构很麻烦，抽象工厂模式的这种性质称为“开闭原则”的倾斜性。
 * “开闭原则”要求系统对扩展开放，对修改封闭，通过扩展达到增强其功能的目的，对于涉及到多个产品族与多个产品等级结构的系统，其功能增强包括两方面：
 * (1) 增加产品族：对于增加新的产品族，抽象工厂模式很好地支持了“开闭原则”，只需要增加具体产品并对应增加一个新的具体工厂，对已有代码无须做任何修改。
 *
 * (2) 增加新的产品等级结构：对于增加新的产品等级结构，需要修改所有的工厂角色，包括抽象工厂类，在所有的工厂类中都需要增加生产新产品的方法，违背了“开闭原则”。
 *
 *
 * 例如下面在增加一个单选框  就违反了开闭原则
 */
public class StructureFactoryTestJava {
    public static void main(String[] args) {
        SkinFactory factory;
        factory = new SummerSkinFactory();
        Button btn;
        TextField tf;
        ComboBox cb;
        btn = factory.createButton();
        tf = factory.createTextField();
        cb = factory.createComboBox();

        btn.disPlay();
        tf.disPlay();
        cb.disPlay();
    }
}
