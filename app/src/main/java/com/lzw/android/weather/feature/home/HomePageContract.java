package com.lzw.android.weather.feature.home;

import com.lzw.android.weather.data.db.entities.minimalist.Weather;
import com.lzw.android.weather.base.BasePresenter;
import com.lzw.android.weather.base.BaseView;


public interface HomePageContract {

    interface View extends BaseView<Presenter> {

        void displayWeatherInformation(Weather weather);
    }

    interface Presenter extends BasePresenter {

        void loadWeather(String cityId, boolean refreshNow);
    }
}
