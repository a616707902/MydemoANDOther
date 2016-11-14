package com.chenpan.mvpframe.common;

import android.app.Application;

/**
 * 作者：chenpan
 * 时间：2016/11/14 20:15
 * 邮箱：616707902@qq.com
 * 描述：
 */

public class MyApplication extends Application {



    private static MyApplication mMyApplication;


    @Override
    public void onCreate() {
        super.onCreate();
        mMyApplication = this;
      //  initFrescoConfig();
    }

    public static MyApplication getApplication(){
        return mMyApplication;
    }





}
