package com.example.android.sunshine.ui.list;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.example.android.sunshine.data.SunshineRepository;
import com.example.android.sunshine.data.database.ListWeatherEntry;

import java.util.List;

public class MainActivityViewModel extends ViewModel {

    private SunshineRepository mRepository;

    private LiveData<List<ListWeatherEntry>> mWeatherList;

    public MainActivityViewModel(SunshineRepository repository) {
        mRepository = repository;
        mWeatherList = mRepository.getCurrentWeatherForecasts();
    }

    public LiveData<List<ListWeatherEntry>> getForecast() {
        return mWeatherList;
    }
}
