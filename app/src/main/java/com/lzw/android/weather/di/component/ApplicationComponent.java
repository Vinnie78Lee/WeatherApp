package com.lzw.android.weather.di.component;

import android.content.Context;

import com.lzw.android.weather.WeatherApplication;
import com.lzw.android.weather.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    WeatherApplication getApplication();

    Context getContext();
}
