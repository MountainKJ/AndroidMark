package com.x.mode.establish.fac.method;

public interface LoggerFactory {
    Logger createLogger();
    Logger createLogger(String args);
    Logger createLogger(Object obj);
}
