package com.youqi.note.loader;

import com.youqi.note.model.PossiblePrize;
import com.youqi.note.model.RankResult;
import com.youqi.note.model.ResponseModel;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface ApiService {
    @GET("dd/GetPossiblePrize")
    Observable<ResponseModel<PossiblePrize>> getPossible(@Query("UserId")String userId, @Query("Source") String source);

    @GET("dd/LoadRank")
    Observable<ResponseModel<RankResult>> loadRank();

    @GET("dd/LoadRank")
    Observable<RankResult> loadRank2();
}
