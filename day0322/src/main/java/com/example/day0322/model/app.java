package com.example.day0322.model;

import android.Manifest;
import android.app.Application;
import android.os.Build;
import android.support.v4.app.ActivityCompat;

import com.umeng.commonsdk.UMConfigure;
import com.umeng.socialize.PlatformConfig;

/**
 * @Auther: 白俊岭
 * @Date: 2019/3/24 18:57:25
 * @Description:
 */
public class app extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        UMConfigure.init(this,"5a12384aa40fa3551f0001d1"
                ,"umeng",UMConfigure.DEVICE_TYPE_PHONE,"");//58edcfeb310c93091c000be2 5965ee00734be40b580001a0
        PlatformConfig.setQQZone("100424468", "c7394704798a158208a74ab60104f0ba");


        }
    }

