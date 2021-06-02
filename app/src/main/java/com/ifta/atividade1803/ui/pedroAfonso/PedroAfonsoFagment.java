package com.ifta.atividade1803.ui.pedroAfonso;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.ifta.atividade1803.R;

public class PedroAfonsoFagment extends Fragment {

    private PedroAfonsoViewModel pedroAfonsoViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        pedroAfonsoViewModel =
                new ViewModelProvider(this).get(PedroAfonsoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_pedroafonso, container, false);
        return root;
    }
}
