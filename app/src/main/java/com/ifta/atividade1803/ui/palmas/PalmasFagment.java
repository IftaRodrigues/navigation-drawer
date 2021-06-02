package com.ifta.atividade1803.ui.palmas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.ifta.atividade1803.R;

public class PalmasFagment extends Fragment {

    private PalmasViewModel palmasViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        palmasViewModel =
                new ViewModelProvider(this).get(PalmasViewModel.class);
        View root = inflater.inflate(R.layout.fragment_palmas, container, false);
        return root;
    }
}
