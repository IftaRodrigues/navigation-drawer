package com.ifta.atividade1803.ui.formoso;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.ifta.atividade1803.R;

public class FormosoFagment extends Fragment {

    private FormosoViewModel formosoViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        formosoViewModel =
                new ViewModelProvider(this).get(FormosoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_formoso, container, false);
        return root;
    }
}
