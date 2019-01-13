package com.example.a47057.clweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 47057 on 2019/1/13.
 */

public class Basic {
    @SerializedName("location")//@SerializedName注解的方式来让JSON字段和Java字段之间建立映射关系
    public String cityName;
    @SerializedName("cid")
    public String weatherId;
    public Update update;
    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
