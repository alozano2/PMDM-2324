package com.ejemplo.pmdm_2324.ut04;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ejemplo.pmdm_2324.R;
import com.ejemplo.pmdm_2324.ut03.Monstruo;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link u4a2fMonstruo#newInstance} factory method to
 * create an instance of this fragment.
 */
public class u4a2fMonstruo extends Fragment {
    public u4a2fMonstruo() {
        // Required empty public constructor
    }

    public static u4a2fMonstruo newInstance(String param1, String param2) {
        u4a2fMonstruo fragment = new u4a2fMonstruo();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    TextView tvMonstruo;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View layout = inflater.inflate(R.layout.fragment_u4a2f_monstruo, container, false);
        tvMonstruo = layout.findViewById(R.id.u4a2fMonstruo);
        return layout;

    }

    public void pintaMonstruo (Monstruo mons){
        tvMonstruo.setText(mons.toString());
    }
}