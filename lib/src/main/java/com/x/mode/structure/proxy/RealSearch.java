package com.x.mode.structure.proxy;

public class RealSearch implements Searcher {
    @Override
    public String doSearch(String userId, String keyWord) {
        System.out.println("doSearch:"+userId+":"+keyWord);
        return "返回具体内容";
    }
}
