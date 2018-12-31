package com.lzw.android.weather.feature.home;

import com.lzw.android.weather.di.component.ApplicationComponent;
import com.lzw.android.weather.di.scope.ActivityScoped;

import dagger.Component;

@ActivityScoped
@Component(modules = HomePageModule.class, dependencies = ApplicationComponent.class)
public interface HomePageComponent {

    void inject(MainActivity mainActivity);
}
