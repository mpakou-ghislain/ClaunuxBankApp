package com.dev.claunuxbankapp.ui.transfers;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TransfersViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public TransfersViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}