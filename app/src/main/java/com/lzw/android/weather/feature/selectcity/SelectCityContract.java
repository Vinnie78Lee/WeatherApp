package com.lzw.android.weather.feature.selectcity;

import java.util.List;

import com.lzw.android.weather.data.db.entities.City;
import com.lzw.android.weather.base.BasePresenter;
import com.lzw.android.weather.base.BaseView;


public interface SelectCityContract {

    interface View extends BaseView<Presenter> {

        void displayCities(List<City> cities);
    }

    interface Presenter extends BasePresenter {

        void loadCities();
    }
}
