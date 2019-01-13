package com.example.a47057.clweather.gson;

/**
 * Created by 47057 on 2019/1/13.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}