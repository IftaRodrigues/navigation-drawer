package com.ifta.atividade1803.ui.paraiso;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ParaisoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ParaisoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Formoso fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
