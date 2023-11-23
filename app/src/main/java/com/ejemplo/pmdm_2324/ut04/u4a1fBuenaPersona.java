package com.ejemplo.pmdm_2324.ut04;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ejemplo.pmdm_2324.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link u4a1fBuenaPersona#newInstance} factory method to
 * create an instance of this fragment.
 */
public class u4a1fBuenaPersona extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public u4a1fBuenaPersona() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment u4a1fBuenaPersona.
     */
    // TODO: Rename and change types and number of parameters
    public static u4a1fBuenaPersona newInstance(String param1, String param2) {
        u4a1fBuenaPersona fragment = new u4a1fBuenaPersona();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    TextView tvContadorFumar;
    public static final String DIAS_SIN_FUMAR = "|";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View layout = inflater.inflate(R.layout.fragment_u4a1f_buena_persona, container, false);
        tvContadorFumar = layout.findViewById(R.id.u4a1ftvFumar);

        tvContadorFumar.setOnClickListener((View v) -> {
            tvContadorFumar.setText(tvContadorFumar.getText() + DIAS_SIN_FUMAR);
        });

        return layout;
    }
}