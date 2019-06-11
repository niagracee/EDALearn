package com.niyagrace.edalearn.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.niyagrace.edalearn.R;
import com.niyagrace.edalearn.adapter.AdapterMateri;
import com.niyagrace.edalearn.response.ResponseMateri;
import com.niyagrace.edalearn.response.SemuamateriItem;
import com.niyagrace.edalearn.util.api.BaseApiService;
import com.niyagrace.edalearn.util.api.UtilsApi;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MateriSoalActivity extends AppCompatActivity {

    // Deklarasi Widget
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi_soal);
        // Inisialisasi Widget
        recyclerView = (RecyclerView) findViewById(R.id.rvListMateri);
        // RecyclerView harus pakai Layout manager
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // Eksekusi method
        tampilMateri();
    }

    private void tampilMateri() {
        BaseApiService api = UtilsApi.getInstance();
        // Siapkan request
        Call<ResponseMateri> materiCall = api.request_show_all_materi();
        // Kirim request
        materiCall.enqueue(new Callback<ResponseMateri>() {
            @Override
            public void onResponse(Call<ResponseMateri> call, Response<ResponseMateri> response) {
                // Pasikan response Sukses
                if (response.isSuccessful()){
                    Log.d("response api", response.body().toString());
                    // tampung data response body ke variable
                    List<SemuamateriItem> data_listmateri = response.body().getSemuamateri();
                    AdapterMateri adapter = new AdapterMateri(MateriSoalActivity.this, data_listmateri);
                    recyclerView.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<ResponseMateri> call, Throwable t) {
                // print ke log jika Error
                t.printStackTrace();
            }
        });
    }
}
