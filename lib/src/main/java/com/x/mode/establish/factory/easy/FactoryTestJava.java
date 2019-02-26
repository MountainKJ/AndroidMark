package com.x.mode.establish.factory.easy;

import com.x.mode.establish.factory.easy.practice.Graphical;
import com.x.mode.establish.factory.easy.practice.GraphicalFactory;
import com.x.mode.establish.factory.easy.practice.GraphicalType;

public class FactoryTestJava {
    public static void main(String[] args) {
//        Product product;
//        product = Factory.getProduct("A");
//        product.methodName();
//        product.methodDiff();
//
//        product = Factory.getProduct("B");
//        product.methodName();
//        product.methodDiff();

//        Chat chat;
//        chat = ChatFactory.makeChat(ChatType.HIS);
//        chat.disPlay();
//
//        chat = ChatFactory.makeChat(ChatType.PIE);
//        chat.disPlay();
//
//        chat = ChatFactory.makeChat(ChatType.LINE);
//        chat.disPlay();

        Graphical graphical = GraphicalFactory.makeGrap(GraphicalType.NONE);
        graphical.draw();
        graphical.erase();
    }
}
