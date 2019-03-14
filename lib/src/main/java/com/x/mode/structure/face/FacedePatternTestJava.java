package com.x.mode.structure.face;

/**
 * 外观模式
 *          通过引入一个外观角色来简化客户端与子系统之间的交互，为复杂子系统提供一个统一的入口，降低子系统与客户端的耦合度，
 *          主要目的在于降低系统的复杂程度。
 *
 *  外观模式包含如下两个角色：
 *                  Facade(外观角色)：
 *                          在客户端可以调用他的方法，在外观角色中可以知道相关的子系统的功能和责任，在正常情况下，它将所有从客户端发来的请求
 *                          委派到相应的子系统去，传递给相应的子系统对象处理。
 *
 *                  SubSystem(子系统角色):
 *                          在软件系统中可以有一个或者多个子系统角色，每一个子系统可以不是一个单独的类，而是一个类的集合，它实现子系统的功能
 *                          每一个子系统都可以被客户端直接调用，或者被外观角色调用，它处理由外观类传递过来的请求，子系统并不知道外观的存在，对于
 *                          子系统而言，外观角色是另一个客户端而已
 */
public class FacedePatternTestJava {
    private static final String fileNameSrc = "123.txt";
    private static final String fileNameDes = "456.txt";
    public static void main(String[] args) {
        AbstractEncryptFacade aef = new EncryptFacade(new CipherMachineImpl2());
        aef.fileEncrypt(fileNameSrc, fileNameDes);
    }
}
