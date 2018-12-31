package com.lzw.android.weather.feature.home.drawer;

import com.lzw.android.weather.di.scope.ActivityScoped;
import com.lzw.android.weather.feature.home.drawer.DrawerContract;

import dagger.Module;
import dagger.Provides;

@Module
public class DrawerMenuModule {

    private DrawerContract.View view;

    public DrawerMenuModule(DrawerContract.View view) {
        this.view = view;
    }

    @Provides
    @ActivityScoped
    DrawerContract.View provideCityManagerContactView() {
        return view;
    }
}
