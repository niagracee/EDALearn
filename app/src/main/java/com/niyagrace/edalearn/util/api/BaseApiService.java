package com.niyagrace.edalearn.util.api;

import com.niyagrace.edalearn.response.ResponseMateri;
import com.niyagrace.edalearn.response.ResponseSoal;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;


public interface BaseApiService {

    // Fungsi ini untuk memanggil API login.php
    @FormUrlEncoded
    @POST("login.php")
    Call<ResponseBody> loginRequest(@Field("email") String email,
                                    @Field("password") String password);

    // Fungsi ini untuk memanggil API  register.php
    @FormUrlEncoded
    @POST("register.php")
    Call<ResponseBody> registerRequest(@Field("nama") String nama,
                                       @Field("nim") String nim,
                                       @Field("email") String email,
                                       @Field("password") String password);

    @GET("semuamateri")
    Call<ResponseMateri> request_show_all_materi();
    // <ModelData> nama_method()

    @GET("semuasoal")
    Call<ResponseSoal> request_show_all_soal();

}
