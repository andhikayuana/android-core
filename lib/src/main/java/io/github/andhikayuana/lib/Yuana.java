package io.github.andhikayuana.lib;

import android.app.Application;
import android.content.Context;

import io.github.andhikayuana.lib.confg.SplashConfig;
import io.github.andhikayuana.lib.confg.YuanaConfig;

/**
 * @author yuana <andhikayuana@gmail.com>
 * @since 6/12/17
 */

public class Yuana {

    private static Application sAplication;
    private static Context sContext;
    private static YuanaConfig sYuanaConfig;
    private static SplashConfig mSplashConfig;

    public static void init(Application application, YuanaConfig yuanaConfig) {
        sAplication = application;
        sContext = sAplication.getApplicationContext();
        sYuanaConfig = yuanaConfig;

        mSplashConfig = new SplashConfig();
    }

    public static synchronized Application getApplication() {
        return sAplication;
    }

    public static synchronized Context getContext() {
        return sContext;
    }

    public static YuanaConfig getConfig() {
        return sYuanaConfig;
    }

    public static SplashConfig getSplashConfig() {
        return mSplashConfig;
    }
}
