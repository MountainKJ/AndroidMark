package com.x.mode.establish.factory.stract.practice;

public class SymbianControllerFactory implements ControllerFactory {
    @Override
    public OperationController createOperationController() {
        return new SymbianOperationController();
    }

    @Override
    public WidgetController createWidgetController() {
        return new SymbianWidgetController();
    }
}
