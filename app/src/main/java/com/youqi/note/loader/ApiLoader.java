package com.youqi.note.loader;

import com.youqi.note.http.ObjectLoader;
import com.youqi.note.http.PayLoad;
import com.youqi.note.http.RetrofitServiceManager;
import com.youqi.note.model.RankResult;
import rx.Observable;

public class ApiLoader extends ObjectLoader {
    private ApiService apiService;

    public ApiLoader() {
        apiService = RetrofitServiceManager.getInstance().create(ApiService.class);
    }

    public Observable<RankResult> loadRank() {
        return observable(apiService.loadRank())
                .map(new PayLoad<RankResult>());
    }
}
