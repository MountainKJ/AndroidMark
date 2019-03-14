package com.x.mode.structure.flyweight;

/**
 * 白色棋子类【具体享元类】
 */
public class WhiteIgoChessman extends IgoChessman {
    @Override
    String getColor() {
        return "白色";
    }
}
