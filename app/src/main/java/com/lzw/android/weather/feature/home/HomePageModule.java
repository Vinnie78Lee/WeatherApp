package com.lzw.android.weather.feature.home;

import com.lzw.android.weather.di.scope.ActivityScoped;
import com.lzw.android.weather.feature.home.HomePagePresenter;

import dagger.Module;
import dagger.Provides;

import com.lzw.android.weather.feature.home.HomePageContract;

@Module
public class HomePageModule {

    private HomePageContract.View view;

    public HomePageModule(HomePageContract.View view) {

        this.view = view;
    }

    @Provides
    @ActivityScoped
    HomePageContract.View provideHomePageContractView() {
        return view;
    }

}
