package com.x.mode.establish.fac.method;

public class DataBaseLogger implements Logger {
    public DataBaseLogger() {
        System.out.printf("DataBaseLogger.init()!\n");
    }

    @Override
    public void writeLog() {
        System.out.printf("DataBaseLogger.writeLog()!\n");
    }
}
