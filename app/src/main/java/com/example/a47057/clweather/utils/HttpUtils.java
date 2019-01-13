package com.example.a47057.clweather.utils;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by 47057 on 2019/1/13.
 */

public class HttpUtils {
    public static void sendOKHttpRequest(String address,Callback callback) {
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
