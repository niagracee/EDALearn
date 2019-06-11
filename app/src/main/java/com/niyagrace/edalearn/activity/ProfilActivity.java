package com.niyagrace.edalearn.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.niyagrace.edalearn.R;
import com.niyagrace.edalearn.util.SharedPrefManager;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ProfilActivity extends AppCompatActivity {

    @BindView(R.id.tvResultNama)
    TextView tvResultNama;
//    @BindView(R.id.tvResultNim) TextView tvResultNim;

    SharedPrefManager sharedPrefManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        ButterKnife.bind(this);
        sharedPrefManager = new SharedPrefManager(this);

        tvResultNama.setText(sharedPrefManager.getSPNama());
//        tvResultNim.setText(sharedPrefManager.getSPNim());

        Button btLogout = (Button) findViewById(R.id.btLogout);
        btLogout.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                sharedPrefManager.saveSPBoolean(SharedPrefManager.SP_SUDAH_LOGIN, false);
                Intent intent = new Intent(ProfilActivity.this, LoginActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
    }
}
