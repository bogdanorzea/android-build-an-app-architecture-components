package com.example.android.sunshine.ui.list;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.example.android.sunshine.data.SunshineRepository;
import com.example.android.sunshine.data.database.WeatherEntry;

import java.util.Date;
import java.util.List;

public class MainActivityViewModel extends ViewModel {

    private final Date mDate;
    private SunshineRepository mRepository;

    private LiveData<List<WeatherEntry>> mWeatherList;

    public MainActivityViewModel(SunshineRepository repository, Date date) {
        mRepository = repository;
        mDate = date;
        mWeatherList = mRepository.getWeatherListAfterDate(mDate);
    }

    public LiveData<List<WeatherEntry>> getWeatherList() {
        return mWeatherList;
    }
}
