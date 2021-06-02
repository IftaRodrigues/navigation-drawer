package com.ifta.atividade1803.ui.lagoa;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LagoaViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public LagoaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Formoso fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
