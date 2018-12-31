package com.lzw.android.weather.feature.home.drawer;

import com.lzw.android.weather.base.BasePresenter;
import com.lzw.android.weather.base.BaseView;
import com.lzw.android.weather.data.db.entities.minimalist.Weather;

import java.io.InvalidClassException;
import java.util.List;

public interface DrawerContract {

    interface View extends BaseView<DrawerMenuPresenter> {

        void displaySavedCities(List<Weather> weatherList);
    }

    interface Presenter extends BasePresenter {

        void loadSavedCities();

        void deleteCity(String cityId);

        void saveCurrentCityToPreference(String cityId) throws InvalidClassException;
    }
}
