package com.ifta.atividade1803.ui.dianopolis;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.ifta.atividade1803.R;

public class DianopolisFagment extends Fragment {

    private DianopolisShowViewModel dianopolisShowViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dianopolisShowViewModel =
                new ViewModelProvider(this).get(DianopolisShowViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dianopolis, container, false);
        return root;
    }
}
