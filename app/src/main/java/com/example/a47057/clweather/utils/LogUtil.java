package com.example.a47057.clweather.utils;

import android.util.Log;

/**
 * Created by 47057 on 2019/1/13.
 */

public class LogUtil {
    private static final int VERBOSE = 2;
    private static final int DEBUG = 3;
    private static final int INFO = 4;
    private static final int WARN = 5;
    private static final int ERROR = 6;
    private static final int ASSERT = 7;
    private static final int level = 0;


    public static void v(String tag, String message) {
        if (level <= VERBOSE) {
            Log.v(tag, message);
        }
    }

    public static void d(String tag, String message) {
        if (level <= DEBUG) {
            Log.d(tag, message);
        }
    }

    public static void i(String tag, String message) {
        if (level <= INFO) {
            Log.i(tag, message);
        }
    }

    public static void w(String tag, String message) {
        if (level <= WARN) {
            Log.w(tag, message);
        }
    }

    public static void e(String tag, String message) {
        if (level <= ERROR) {
            Log.e(tag, message);
        }
    }

}
