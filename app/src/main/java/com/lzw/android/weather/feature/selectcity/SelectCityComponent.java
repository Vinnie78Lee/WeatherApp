package com.lzw.android.weather.feature.selectcity;

import com.lzw.android.weather.di.component.ApplicationComponent;
import com.lzw.android.weather.di.scope.ActivityScoped;

import dagger.Component;


@ActivityScoped
@Component(modules = SelectCityModule.class, dependencies = ApplicationComponent.class)
public interface SelectCityComponent {

    void inject(SelectCityActivity selectCityActivity);
}
