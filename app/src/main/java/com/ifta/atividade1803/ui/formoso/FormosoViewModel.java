package com.ifta.atividade1803.ui.formoso;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FormosoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FormosoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Formoso fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
