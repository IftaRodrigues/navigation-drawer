package com.ifta.atividade1803.ui.pedroAfonso;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PedroAfonsoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PedroAfonsoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Formoso fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
