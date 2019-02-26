package com.x.mode.establish.fac.method;

public class DataBaseLoggerFactory implements LoggerFactory {
    public DataBaseLoggerFactory() {
        System.out.printf("DataBaseLogger.init()!\n");
    }

    @Override
    public Logger createLogger(String args) {
        DataBaseLogger logger = new DataBaseLogger();
        return logger;
    }

    @Override
    public Logger createLogger(Object obj) {
        DataBaseLogger logger = new DataBaseLogger();
        return logger;
    }

    @Override
    public Logger createLogger() {
        return new DataBaseLogger();
    }
}
