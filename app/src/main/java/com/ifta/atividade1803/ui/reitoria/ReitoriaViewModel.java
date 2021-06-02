package com.ifta.atividade1803.ui.reitoria;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ReitoriaViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ReitoriaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Formoso fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
