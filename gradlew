package com.niyagrace.aplikasiii.activity;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.niyagrace.aplikasiii.LatihanFragment;
import com.niyagrace.aplikasiii.MateriFragment;
import com.niyagrace.aplikasiii.PengolahFragment;
import com.niyagrace.aplikasiii.R;

public class MulaiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mulai);

        Button btProfil = (Button) findViewById(R.id.btProfil);
        btProfil.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MulaiActivity.this, ProfilActivity.class);
                startActivity(intent);
            }
        });

        Button btMateri = (Button) findViewById(R.id.btMateri);
        btMateri.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Fragment fragment = new MateriFragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fl_container, fragment, fragment.getClass().getSimpleName())
                        .commit();
            }
        });

        Button btLatihan = (Button) findViewById(R.id.btLatihan);
        btLatihan.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Fragment fragment = new LatihanFragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fl_container, fragment, fragment.getClass().getSimpleName())
                        .commit();
            }
        });

        Button btPengolah = (Button) findViewById(R.id.btPengolah);
        btPengolah.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Fragment fragment = new PengolahFragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fl_container, fragment, fragment.getClass().getSimpleName())
                        .commit();
            }
        });
    }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                