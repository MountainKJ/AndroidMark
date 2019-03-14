package com.x.mode.structure.flyweight;

/**
 * 享元模式：
 *          享元模式(Flyweight Pattern)：运用共享技术有效地支持大量细粒度对象的复用。系统只使用少量的对象，
 *          而这些对象都很相似，状态变化很小，可以实现对象的多次复用。由于享元模式要求能够共享的对象必须是细粒度对象，
 *          因此它又称为轻量级模式，它是一种对象结构型模式。
 *
 * 包含结构如下：
 *          Flyweight（抽象享元类）：
 *                          通常是一个接口或者抽象类，在抽象享元类中声明了具体享元类公共的方法，这些方法可以
 *                          向外界提供享元对象的内部数据（内部状态），同时也可以通过这些方法来设置外部数据（外部
 *                          状态）。
 *          ConcreteFlyweight(具体享元类)：
 *                          实现了抽象享元类，实例称为享元对象，在具体享元类中为内部状态提供了存储空间。通常可以结合
 *                          单例模式来设计具体享元类，为每一个具体享元类提供唯一的享元对象
 *          UnsharedConcreteFlyweight(非共享具体享元类):
 *                           并不是所有的抽象享元类的子类都需要被共享，不能被共享的子类可以设计成为非共享具体享元类；
 *                           当需要一个非共享具体享元类的对象时可以直接通过实例化创建
 *          FlyweightFactory(享元工厂类)：
 *                           享元工厂类用于创建并管理享元对象，针对抽象享元类编程，将各种类型的具体享元对象存储在一个
 *                           享元池中，享元池一般设计为“键值对”集合，可以结合工厂模式进行设计，当用户请求一个具体享
 *                           元对象时，享元工厂提供一个存储在享元池中已创建的实例或者创建一个新的实例,返回新的创建的示例
 *                           并将其存储在享元池中。
 */
public class FlyweightTestJava {
    public static void main(String[] args) {
        IgoChessman black1, black2, black3, white1, white2;
        IgoChessmanFactory factory = IgoChessmanFactory.getInstance();
        black1 = factory.getIgoChessman("b");
        black2 = factory.getIgoChessman("b");
        black3 = factory.getIgoChessman("b");
        System.out.println("黑棋是否相同："+(black1 == black2));

        white1 = factory.getIgoChessman("w");
        white2 = factory.getIgoChessman("w");
        System.out.println("白棋是否相同:"+(white1 == white2));

        black1.display(new Coordinates(0,0));
        black2.display(new Coordinates(10,10));
        black3.display(new Coordinates(20,20));
        white1.display(new Coordinates(30,30));
        white2.display(new Coordinates(40,40));
    }
}
