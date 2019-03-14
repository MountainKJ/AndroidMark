package com.x.mode.structure.flyweight.practice;

public class FlyweightPracticeTestJava {
    public static void main(String[] args) {
        AbstractDoc doc1, doc2, doc3, doc4;
        doc1 = DocFactory.getInstance().getDoc(1);
        doc2 = DocFactory.getInstance().getDoc(1);
        System.out.println("doc1 == doc2 ?"+(doc1 == doc2));

        doc3 = DocFactory.getInstance().getDoc(2);
        doc4 = DocFactory.getInstance().getDoc(2);
        System.out.println("doc3 == doc4 ?"+(doc3 == doc4));

        doc1.disPlay(new DocProperty(0,0,0,0));
        doc2.disPlay(new DocProperty(10,10,10,10));
        doc3.disPlay(new DocProperty(20,20,20,20));
        doc4.disPlay(new DocProperty(30,30,30,30));

    }
}
