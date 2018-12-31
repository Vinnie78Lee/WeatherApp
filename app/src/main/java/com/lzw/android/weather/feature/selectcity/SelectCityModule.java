package com.lzw.android.weather.feature.selectcity;

import dagger.Module;
import dagger.Provides;

import com.lzw.android.weather.di.scope.ActivityScoped;


@Module
public class SelectCityModule {

    private SelectCityContract.View view;

    public SelectCityModule(SelectCityContract.View view) {
        this.view = view;
    }

    @Provides
    @ActivityScoped
    SelectCityContract.View provideSelectCityContractView() {
        return view;
    }
}
