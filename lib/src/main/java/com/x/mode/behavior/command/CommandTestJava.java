package com.x.mode.behavior.command;

/**
 * 命令模式：
 *        将一个请求封装为一个对象，从而让我们可用不同的请求对客户进行参数化；对请求排队或者记录请求日志，
 *        以及支持可撤销的操作。命令模式是一种对象行为型模式，其别名为动作(Action)模式或事务(Transaction)模式。
 * 包含如下角色：
 *        Command（抽象命令类）：
 *              抽象命令类一般是一个抽象类或接口，在其中声明了用于执行请求的execute()等方法，通过这些方法可以调用请求接受者的相关操作
 *        ConcreteCommand（具体命令类）：
 *              抽象命令类的子类，实现了抽象命令类中声明的方法，它对应具体的接受者对象，将接受者对象的动作绑定其中，在实现execute（）方法时，
 *              将调用接受者对象的相关操作（Action）
 *        Invoker（调用者）：
 *              调用者就是请求发送者，它通过命令对象来执行请求，一个调用者并不需要在设计时确定其接收者，因此它只与抽象命令类之间存在关联，程序
 *              运行时，可以将一个具体命令对象注入其中，在调用具体命令对象的execute()方法，从而实现间接调用请求接受者的相关操作。
 *        Receiver（接受者）：
 *              接受者执行与请求相关的操作，它具体实现对请求的业务处理。
 *
 */
public class CommandTestJava {
    public static void main(String[] args) {
        FunctionButton fb1,fb2;
        fb1 = new FunctionButton("功能键1");
        fb2 = new FunctionButton("功能键2");

        Command command1, command2;
        command1 = new HelpCommand();
        command2 = new MinimizeCommand();

        fb1.setCommand(command1);
        fb2.setCommand(command2);

        FBSettingWindow fbsw = new FBSettingWindow("功能键设置");
        fbsw.addFunctionButton(fb1);
        fbsw.addFunctionButton(fb2);
        fbsw.display();

        fb1.onClick();
        fb2.onClick();
    }
}
