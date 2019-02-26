package com.x.mode.establish.fac.easy;

import com.x.mode.establish.fac.easy.Factory;
import com.x.mode.establish.fac.easy.Product;
import com.x.mode.establish.fac.easy.chat.Chat;
import com.x.mode.establish.fac.easy.chat.ChatFactory;
import com.x.mode.establish.fac.easy.chat.ChatType;
import com.x.mode.establish.fac.easy.practice.Graphical;
import com.x.mode.establish.fac.easy.practice.GraphicalFactory;
import com.x.mode.establish.fac.easy.practice.GraphicalType;

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
