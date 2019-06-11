package com.niyagrace.edalearn.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.niyagrace.edalearn.R;

public class MulaiActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mulai);

//        tvResultNim.setText(sharedPrefManager.getSPNim());

        Button btProfil = (Button) findViewById(R.id.btProfil);
        btProfil.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MulaiActivity.this, ProfilActivity.class);
                startActivity(intent);
            }
        });

        Button btMateri = (Button) findViewById(R.id.btMateri);
        btMateri.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MulaiActivity.this, MainActivity.class);
                startActivity(intent);


            }
        });

    }
}
