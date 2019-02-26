package com.x.mode.establish.fac.stract.practice;

public class AndroidControllerFactory implements ControllerFactory {
    @Override
    public OperationController createOperationController() {
        return new AndroidOperationController();
    }

    @Override
    public WidgetController createWidgetController() {
        return new AndroidWidgetController();
    }
}
