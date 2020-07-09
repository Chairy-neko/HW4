package com.bytedance.camp.chapter4.widget;

import android.util.Log;

class Time {
    private int hours;
    private int minutes;
    private int seconds;

    private static final String TAG = "TIME_";

    Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        Log.i(TAG,"HOUR: "+ hours);
        return hours;
    }

    public int getMinutes() {
        Log.i(TAG,"MIN: "+ minutes);
        return minutes;
    }

    public int getSeconds() {
        Log.i(TAG,"SEC: "+ seconds);
        return seconds;
    }
}
