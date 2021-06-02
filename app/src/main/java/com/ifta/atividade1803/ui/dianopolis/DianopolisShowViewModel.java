package com.ifta.atividade1803.ui.dianopolis;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DianopolisShowViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DianopolisShowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
