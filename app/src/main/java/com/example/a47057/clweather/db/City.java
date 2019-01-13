package com.example.a47057.clweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 47057 on 2019/1/13.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceID;

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceID() {
        return provinceID;
    }

    public void setProvinceId(int provinceID) {
        this.provinceID = provinceID;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
