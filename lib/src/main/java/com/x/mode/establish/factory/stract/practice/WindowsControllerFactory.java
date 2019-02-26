package com.x.mode.establish.factory.stract.practice;

public class WindowsControllerFactory implements ControllerFactory {
    @Override
    public OperationController createOperationController() {
        return new WindowsOperationController();
    }

    @Override
    public WidgetController createWidgetController() {
        return new WindowsWidgetController();
    }
}
