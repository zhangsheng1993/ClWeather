package com.example.a47057.clweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 47057 on 2019/1/13.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    @SerializedName("lifestyle")
    public List<Suggestion > suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
