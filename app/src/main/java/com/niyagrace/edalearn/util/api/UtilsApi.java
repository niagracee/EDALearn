package com.niyagrace.edalearn.util.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class UtilsApi {

    // 192.168.1.9 ini adalah localhost.
    public static final String BASE_URL_API = "http://192.168.1.2/rest-api/API-mahasiswa-master/";

    // Mendeklarasikan Interface BaseApiService
    public static BaseApiService getAPIService(){
        return RetrofitClient.getClient(BASE_URL_API).create(BaseApiService.class);
    }

    public static Retrofit setInit() {
        return new Retrofit.Builder().baseUrl(BASE_URL_API)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public static BaseApiService getInstance() {
        return setInit().create(BaseApiService.class);
    }
}
