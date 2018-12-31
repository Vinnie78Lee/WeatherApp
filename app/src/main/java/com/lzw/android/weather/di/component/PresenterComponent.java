package com.lzw.android.weather.di.component;

import com.lzw.android.weather.di.module.ApplicationModule;
import com.lzw.android.weather.feature.home.drawer.DrawerMenuPresenter;
import com.lzw.android.weather.feature.selectcity.SelectCityPresenter;

import javax.inject.Singleton;

import dagger.Component;
import com.lzw.android.weather.feature.home.HomePagePresenter;


@Singleton
@Component(modules = {ApplicationModule.class})
public interface PresenterComponent {

    void inject(HomePagePresenter presenter);

    void inject(SelectCityPresenter presenter);

    void inject(DrawerMenuPresenter presenter);
}
 