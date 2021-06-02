package com.ifta.atividade1803.ui.reitoria;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.ifta.atividade1803.R;

public class ReitoriaFagment extends Fragment {

    private ReitoriaViewModel reitoriaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        reitoriaViewModel =
                new ViewModelProvider(this).get(ReitoriaViewModel.class);
        View root = inflater.inflate(R.layout.fragment_reitoria, container, false);
        return root;
    }
}
