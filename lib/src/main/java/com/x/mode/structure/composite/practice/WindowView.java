package com.x.mode.structure.composite.practice;

import java.util.ArrayList;
import java.util.List;

public class WindowView extends AbstractView{
    private List<AbstractView> abstractViews = new ArrayList<>();

    public void add(AbstractView av) {
        abstractViews.add(av);
    }

    public void remove(AbstractView av) {
        abstractViews.remove(av);
    }

    public AbstractView getChild(int i) {
        return abstractViews.get(i);
    }

    @Override
    void display() {
        for (AbstractView abstractView : abstractViews) {
            abstractView.display();
        }
    }
}
