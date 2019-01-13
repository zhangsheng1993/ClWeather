package com.example.a47057.clweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 47057 on 2019/1/13.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More {
        @SerializedName("txt")
        public String info;
    }
}