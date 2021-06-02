package com.ifta.atividade1803.ui.paraiso;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.ifta.atividade1803.R;

public class ParaisoFagment extends Fragment {

    private ParaisoViewModel paraisoViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        paraisoViewModel =
                new ViewModelProvider(this).get(ParaisoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_paraiso, container, false);
        return root;
    }
}
