package com.niyagrace.edalearn;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.niyagrace.edalearn.activity.MateriSoalActivity;

public class LatihanFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_latihan, container, false);



        Button btnLihatMatkul = (Button) view.findViewById(R.id.btnLihatMatkul);
        btnLihatMatkul.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(getActivity(), MateriSoalActivity.class);
                getActivity().startActivity(intent);
            }
        });

        return view;


    }
}