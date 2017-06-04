package com.geo.app;

import android.app.Application;
import android.content.Context;

/**
 * Created by 李伟 on 2017/1/16.
 */

public class APlanApplication extends Application{
    private static APlanApplication mInstance;
    @Override
    public void onCreate() {
        super.onCreate();
        initCrashHandler();
    }

    //初始化日志拦截
    private void initCrashHandler() {
        CrashHandler crashHandler = CrashHandler.getInstance();
        // 注册crashHandler
        crashHandler.init(this.getApplicationContext());
        // 发送以前没发送的报告(可选)
        crashHandler.sendPreviousReportsToServer();
    }
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }
}
