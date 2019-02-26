package com.x.mode.establish.fac.method;

public class FileLogger implements Logger {
    public FileLogger() {
        System.out.printf("FileLogger.init()!\n");
    }

    @Override
    public void writeLog() {
        System.out.printf("FileLogger.writeLog()!\n");
    }
}
