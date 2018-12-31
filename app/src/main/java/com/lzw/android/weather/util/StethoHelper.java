package com.lzw.android.weather.util;

import android.content.Context;

import okhttp3.OkHttpClient;

/**
 * @author lzw (baron[dot]zhanglei[at]gmail[dot]com)
 *         2017/7/25
 */
public interface StethoHelper {

    void init(Context context);

    OkHttpClient.Builder addNetworkInterceptor(OkHttpClient.Builder builder);
}
