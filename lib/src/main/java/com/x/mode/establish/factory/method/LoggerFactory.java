package com.x.mode.establish.factory.method;

public interface LoggerFactory {
    Logger createLogger();
    Logger createLogger(String args);
    Logger createLogger(Object obj);
}
