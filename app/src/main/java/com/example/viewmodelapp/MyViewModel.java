package com.example.viewmodelapp;

import android.view.View;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    // Using Live Data
    private MutableLiveData<Integer> counter = new MutableLiveData<>();

//    int counter = 0;

    public void increaseCounter(View view){
        // Retrieve the current value from LiveData
        int currentValue = counter.getValue() != null ? counter.getValue():0;

        // Increase Value by 1
        counter.setValue(currentValue+1);
    }

    public LiveData<Integer> getCounter() {
        return counter;
    }
}
