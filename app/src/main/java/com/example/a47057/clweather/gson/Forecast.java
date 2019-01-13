package com.example.a47057.clweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 47057 on 2019/1/13.
 * 单日天气
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;
    public class Temperature {

        public String max;
        public String min;
    }
    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
