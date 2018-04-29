package com.example.android.sunshine.ui.list;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.example.android.sunshine.data.SunshineRepository;

import java.util.Date;

public class MainViewModelFactory extends ViewModelProvider.NewInstanceFactory {
    private final SunshineRepository mRepository;
    private final Date mDate;

    public MainViewModelFactory(SunshineRepository mRepository, Date mDate) {
        this.mRepository = mRepository;
        this.mDate = mDate;
    }

    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {
        //noinspection unchecked
        return (T) new MainActivityViewModel(mRepository, mDate);
    }
}
