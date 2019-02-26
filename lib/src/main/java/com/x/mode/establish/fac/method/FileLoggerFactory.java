package com.x.mode.establish.fac.method;

public class FileLoggerFactory implements LoggerFactory {
    public FileLoggerFactory() {
        System.out.printf("FileLoggerFactory.init()!\n");
    }

    @Override
    public Logger createLogger() {
        return new FileLogger();
    }

    @Override
    public Logger createLogger(String args) {
        FileLogger logger = new FileLogger();
        return logger;
    }

    @Override
    public Logger createLogger(Object obj) {
        FileLogger logger = new FileLogger();
        return logger;
    }
}
