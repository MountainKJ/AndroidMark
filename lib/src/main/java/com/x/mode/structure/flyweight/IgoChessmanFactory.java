package com.x.mode.structure.flyweight;

import java.util.Hashtable;

//围棋工厂类【享元工厂类】
public class IgoChessmanFactory {
    private static class IgoChessmanFacHolder{
        private static IgoChessmanFactory instance = new IgoChessmanFactory();
    }

    public static IgoChessmanFactory getInstance(){
        return IgoChessmanFacHolder.instance;
    }

    private static Hashtable ht;
    private IgoChessmanFactory(){
        ht = new Hashtable();
        IgoChessman black, white;
        black = new BlackIgoChessman();
        ht.put("b", black);
        white = new WhiteIgoChessman();
        ht.put("w", white);
    }

    public IgoChessman getIgoChessman(String color) {
        return (IgoChessman) ht.get(color);
    }
}
