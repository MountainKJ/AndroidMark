package com.x.mode.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 迭代器模式
 *          提供一种方法来访问聚合对象，而不用暴露这个对象的内部表示，其别名为游标（Cursor）。
 * 包含角色如下：
 *          Iterator（抽象迭代器）：
 *                  它定义了访问和遍历元素的接口，声明了用于遍历数据元素的方法
 *          ConcreteIterator(具体迭代器)：
 *                  实现了抽象迭代器接口，完成对聚合对象的遍历，同时在具体迭代器中通过游标来记录在聚合对象中所处
 *                  的当前位置，在具体实现时，游标通常是一个表示位置的非负整数
 *          Aggregate（抽象聚合类）：
 *                  它用于存储和管理元素对象，声明一个createIterator（）方法用于创建一个迭代器对象，充当抽象迭代器
 *                  工厂角色
 *          ConcreteAggregate(具体聚合类)：
 *                  实现了抽象聚合类中声明的createIterator（）方法，该方法返回一个与该具体聚合类对应的具体迭代器实例
 *
 */
public class IteratorTestJava {
    public static void main(String[] args) {
        List products = new ArrayList();
        products.add("倚天剑");
        products.add("屠龙刀");
        products.add("断肠草");
        products.add("葵花宝典");
        products.add("四十二章经");

        AbstractObjectList list;
        AbstractIterator iterator;

        list = new ProductList(products);
        iterator = list.createIterator();
        System.out.println("正向遍历:");
        while(!iterator.isLast()) {
            System.out.print(iterator.getNextItem()+",");
            iterator.next();
        }

        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println("逆向遍历：");
        while (!iterator.isFirst()) {
            System.out.print(iterator.getPreviousItem()+"，");
            iterator.previous();
        }

    }
}
