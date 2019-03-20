package com.x.mode.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象聚合类
 */
public abstract class AbstractObjectList {
    protected List objects = new ArrayList();

    public AbstractObjectList(List objects) {
        this.objects = objects;
    }

    public void addObject(Object obj) {
        this.objects.add(obj);
    }

    public void removeObject(Object obj) {
        this.objects.remove(obj);
    }

    public List getObjects() {
        return objects;
    }

    abstract AbstractIterator createIterator();
}
