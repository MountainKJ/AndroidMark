package com.x.mode.establish.factory.easy.chat;

/**
 * 饼状图：具体产品类
 */
public class PieChat implements Chat {
    public PieChat() {
        System.out.printf("创建饼状图！\n");
    }

    @Override
    public void disPlay() {
        System.out.printf("显示饼状图！\n");
    }
}
