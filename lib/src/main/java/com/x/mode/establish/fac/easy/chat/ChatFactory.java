package com.x.mode.establish.fac.easy.chat;

public class ChatFactory {
    public static Chat makeChat(ChatType type) {
        Chat chat = null;
        if(type == ChatType.HIS) {
            chat = new HistogramChat();
        }
        else if(type == ChatType.PIE) {
            chat = new PieChat();
        }
        else if(type == ChatType.LINE) {
            chat = new LineChat();
        }

        return chat;
    }
}
