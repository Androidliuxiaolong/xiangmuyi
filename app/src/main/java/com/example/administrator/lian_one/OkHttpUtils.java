package com.example.administrator.lian_one;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2018/6/5.
 */

public class OkHttpUtils {
            OkHttpClient okHttpClient =  new OkHttpClient();

            Request request = new Request.Builder()
                    .get()
                    .url("https:www.baidu.com")
                    .build();

            Call call = okHttpClient.newCall(request);


}
