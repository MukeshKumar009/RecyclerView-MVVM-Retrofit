package com.mukeshapps.android_mvvm_retrofit_recyclerview.retrofit;



import com.mukeshapps.android_mvvm_retrofit_recyclerview.response.ArticleResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * This interface contains all the web request methods
 */
public interface ApiRequest {

    //TODO: Change according to your web services

    @GET("v2/everything/")
    Call<ArticleResponse> getMovieArticles(
            @Query("q") String query,
            @Query("apikey") String apiKey
    );
}
