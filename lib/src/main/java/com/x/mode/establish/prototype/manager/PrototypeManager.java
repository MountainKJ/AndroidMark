package com.x.mode.establish.prototype.manager;

import java.util.Hashtable;

public class PrototypeManager {
    //定义HashTable 存储原型对象
    private Hashtable ht = new Hashtable();

    private static PrototypeManager pm = new PrototypeManager();

    private PrototypeManager() {
        ht.put("far", new FAR());
        ht.put("srs", new SRS());
    }

    public void addOfficialDocument(String key, OfficialDocument doc) {
        ht.put(key, doc);
    }

    public OfficialDocument getOfficialDocument(String key) {
        return ((OfficialDocument)ht.get(key)).clone();
    }

    public static PrototypeManager getPrototypeManager() {
        return pm;
    }
}
