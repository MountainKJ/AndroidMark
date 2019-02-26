package com.x.mode.establish.fac.easy.chat;

/**
 * 线状图：具体产品类
 */
public class LineChat implements Chat {
    public LineChat() {
        System.out.printf("创建线状图！\n");
    }

    @Override
    public void disPlay() {
        System.out.printf("显示线状图！\n");
    }
}
