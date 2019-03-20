package com.x.mode.behavior.iterator;

import java.util.List;

//具体聚合类
public class ProductList extends AbstractObjectList{
    public ProductList(List objects) {
        super(objects);
    }

    @Override
    AbstractIterator createIterator() {
        return new ProductIterator();
    }


    private class ProductIterator implements AbstractIterator {
        private int cursor1;
        private int cursor2;

        public ProductIterator() {
            cursor1 = 0;
            cursor2 = objects.size() - 1;
        }

        @Override
        public void next() {
            if(cursor1 < objects.size()) {
                cursor1 ++;
            }
        }

        @Override
        public boolean isLast() {
            return (cursor1 == objects.size());
        }

        @Override
        public void previous() {
            if(cursor2 > -1) {
                cursor2 --;
            }
        }

        @Override
        public boolean isFirst() {
            return (cursor2 == -1);
        }

        @Override
        public Object getNextItem() {
            return objects.get(cursor1);
        }

        @Override
        public Object getPreviousItem() {
            return objects.get(cursor2);
        }
    }
}
