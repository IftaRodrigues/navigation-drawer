package com.ifta.atividade1803.ui.porto;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.ifta.atividade1803.R;

public class PortoFagment extends Fragment {

    private PortoViewModel portoViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        portoViewModel =
                new ViewModelProvider(this).get(PortoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_porto, container, false);
        return root;
    }
}
