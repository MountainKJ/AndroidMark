package com.x.mode.structure.proxy;

public class ProxySearcher implements Searcher {
    private RealSearch realSearch = new RealSearch();
    private AccessValidator validator;
    private Logger logger;
    @Override
    public String doSearch(String userId, String keyWord) {
        if(this.validate(userId)) {
            String result = realSearch.doSearch(userId, keyWord);
            this.log(userId);
            return result;
        }
        return null;
    }

    public boolean validate(String userId) {
        validator = new AccessValidator();
        return validator.validate(userId);
    }

    public void log(String userId) {
        logger = new Logger();
        logger.log(userId);
    }
}
