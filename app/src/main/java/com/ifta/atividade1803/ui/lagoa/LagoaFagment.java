package com.ifta.atividade1803.ui.lagoa;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.ifta.atividade1803.R;

public class LagoaFagment extends Fragment {

    private LagoaViewModel lagoaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        lagoaViewModel =
                new ViewModelProvider(this).get(LagoaViewModel.class);
        View root = inflater.inflate(R.layout.fragment_lagoa, container, false);
        return root;
    }
}
