package com.x.mode.establish.factory.stract.practice;

public interface ControllerFactory {
    OperationController createOperationController();
    WidgetController createWidgetController();
}
