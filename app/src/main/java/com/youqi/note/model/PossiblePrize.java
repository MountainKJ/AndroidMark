package com.youqi.note.model;

import java.io.Serializable;

public class PossiblePrize implements Serializable {
    private static final long serialVersionUID = 1L;
    private boolean over;
    private String nextBatchStr;
    private String currBatch;
    private String currTime;

    public boolean isOver() {
        return over;
    }

    public void setOver(boolean over) {
        this.over = over;
    }

    public String getNextBatchStr() {
        return nextBatchStr;
    }

    public void setNextBatchStr(String nextBatchStr) {
        this.nextBatchStr = nextBatchStr;
    }

    public String getCurrBatch() {
        return currBatch;
    }

    public void setCurrBatch(String currBatch) {
        this.currBatch = currBatch;
    }

    public String getCurrTime() {
        return currTime;
    }

    public void setCurrTime(String currTime) {
        this.currTime = currTime;
    }
}
