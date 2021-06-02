package com.ifta.atividade1803.ui.palmas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PalmasViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PalmasViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Formoso fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
