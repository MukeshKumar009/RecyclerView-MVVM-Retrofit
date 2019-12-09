package com.mukeshapps.android_mvvm_retrofit_recyclerview.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

//Single class for all Retrofit requests
public class RetrofitRequest {

    private static Retrofit retrofit;

    //TODO: change your URL here
    //private static final String BASE_URL = "Url";

    private RetrofitRequest() {
        //To make it singleton
    }

    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
