package com.ifta.atividade1803.ui.gurupi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.ifta.atividade1803.R;

public class GurupiFagment extends Fragment {

    private GurupiViewModel gurupiViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        gurupiViewModel =
                new ViewModelProvider(this).get(GurupiViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gurupi, container, false);
        return root;
    }
}
