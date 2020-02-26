package com.yc.roundelayout;

import android.app.Application;
import android.support.v7.app.AppCompatDelegate;

import skin.support.SkinCompatManager;

/**
 * @Author: YuChuan
 * @CreateDate: 2020/2/26 0026 上午 11:00
 * @Description:
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SkinCompatManager.withoutActivity(this)                         // 基础控件换肤初始化
                .setSkinStatusBarColorEnable(true)                     // 关闭状态栏换肤，默认打开[可选]
                .setSkinWindowBackgroundEnable(false)                   // 关闭windowBackground换肤，默认打开[可选]
                .loadSkin();
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }
}
