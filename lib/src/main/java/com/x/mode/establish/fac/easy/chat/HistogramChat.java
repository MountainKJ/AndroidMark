package com.x.mode.establish.fac.easy.chat;

public class HistogramChat implements Chat {
    public HistogramChat() {
        System.out.printf("创建柱状图！\n");
    }

    @Override
    public void disPlay() {
        System.out.printf("显示柱状图！\n");
    }
}
