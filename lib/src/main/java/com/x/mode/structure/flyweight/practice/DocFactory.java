package com.x.mode.structure.flyweight.practice;

import java.util.Hashtable;

public class DocFactory {
    private static class DocFactoryHolder {
        private static final DocFactory instance = new DocFactory();
    }

    public static DocFactory getInstance(){
        return DocFactoryHolder.instance;
    }

    private static Hashtable ht;
    private DocFactory() {
        ht = new Hashtable();
        AbstractDoc doc1, doc2, doc3;
        doc1 = new Document1();
        ht.put(1, doc1);

        doc2 = new Document2();
        ht.put(2, doc2);
    }

    public AbstractDoc getDoc(int key) {
        return (AbstractDoc) ht.get(key);
    }
}
