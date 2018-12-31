package com.lzw.android.weather.data.db.entities.adapter;

import com.lzw.android.weather.data.db.entities.minimalist.AirQualityLive;
import com.lzw.android.weather.data.db.entities.minimalist.LifeIndex;
import com.lzw.android.weather.data.db.entities.minimalist.Weather;
import com.lzw.android.weather.data.db.entities.minimalist.WeatherForecast;
import com.lzw.android.weather.data.db.entities.minimalist.WeatherLive;

import java.util.List;


public abstract class WeatherAdapter {

    public abstract String getCityId();

    public abstract String getCityName();

    public abstract String getCityNameEn();

    public abstract WeatherLive getWeatherLive();

    public abstract List<WeatherForecast> getWeatherForecasts();

    public abstract List<LifeIndex> getLifeIndexes();

    public abstract AirQualityLive getAirQualityLive();

    public Weather getWeather() {

        Weather weather = new Weather();
        weather.setCityId(getCityId());
        weather.setCityName(getCityName());
        weather.setCityNameEn(getCityNameEn());
        weather.setAirQualityLive(getAirQualityLive());
        weather.setWeatherForecasts(getWeatherForecasts());
        weather.setLifeIndexes(getLifeIndexes());
        weather.setWeatherLive(getWeatherLive());
        return weather;
    }
}
