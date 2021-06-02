package com.ifta.atividade1803.ui.gurupi;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GurupiViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GurupiViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Formoso fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
