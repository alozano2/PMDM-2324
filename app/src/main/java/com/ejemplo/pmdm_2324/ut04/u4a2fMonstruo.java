package com.ejemplo.pmdm_2324.ut04;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ejemplo.pmdm_2324.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link u4a2fMonstruo#newInstance} factory method to
 * create an instance of this fragment.
 */
public class u4a2fMonstruo extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public u4a2fMonstruo() {
        // Required empty public constructor
    }


    public static u4a2fMonstruo newInstance(String param1, String param2) {
        u4a2fMonstruo fragment = new u4a2fMonstruo();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_u4a2f_monstruo, container, false);
    }
}