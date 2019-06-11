package com.niyagrace.edalearn.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.niyagrace.edalearn.R;
import com.niyagrace.edalearn.adapter.AdapterSoal;
import com.niyagrace.edalearn.response.ResponseSoal;
import com.niyagrace.edalearn.response.SemuasoalItem;
import com.niyagrace.edalearn.util.api.BaseApiService;
import com.niyagrace.edalearn.util.api.UtilsApi;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SoalActivity extends AppCompatActivity {

    // Deklarasi Widget
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal);
        // Inisialisasi Widget
        recyclerView = (RecyclerView) findViewById(R.id.rvListSoal);
        // RecyclerView harus pakai Layout manager
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // Eksekusi method
        tampilSoal();
    }

    private void tampilSoal() {
        BaseApiService api = UtilsApi.getInstance();
        // Siapkan request
        Call<ResponseSoal> materiCall = api.request_show_all_soal();
        // Kirim request
        materiCall.enqueue(new Callback<ResponseSoal>() {
            @Override
            public void onResponse(Call<ResponseSoal> call, Response<ResponseSoal> response) {
                // Pasikan response Sukses
                if (response.isSuccessful()){
                    Log.d("response api", response.body().toString());
                    // tampung data response body ke variable
                    List<SemuasoalItem> data_listsoal = response.body().getSemuasoal();
                    AdapterSoal adapter = new AdapterSoal(SoalActivity.this, data_listsoal);
                    recyclerView.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<ResponseSoal> call, Throwable t) {
                // print ke log jika Error
                t.printStackTrace();
            }
        });
    }
}
