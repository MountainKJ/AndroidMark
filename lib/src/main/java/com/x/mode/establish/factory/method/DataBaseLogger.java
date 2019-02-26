package com.x.mode.establish.factory.method;

public class DataBaseLogger implements Logger {
    public DataBaseLogger() {
        System.out.printf("DataBaseLogger.init()!\n");
    }

    @Override
    public void writeLog() {
        System.out.printf("DataBaseLogger.writeLog()!\n");
    }
}
