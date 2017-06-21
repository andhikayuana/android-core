package io.github.andhikayuana.core;

import android.app.Application;

import io.github.andhikayuana.lib.Yuana;
import io.github.andhikayuana.lib.confg.YuanaConfig;

/**
 * @author yuana <andhikayuana@gmail.com>
 * @since 6/12/17
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        initYuanaCore();
    }

    private void initYuanaCore() {

        // TODO: 6/12/17 initialize concept here

        YuanaConfig yuanaConfig = YuanaConfig
                .Builder()
                .setAppName("Hello App")
                .build();

        Yuana.init(this, yuanaConfig);

        Yuana.getSplashConfig()
                .setAfterSplashActivityClass(MainActivity.class)
                .setDurationMilis(3000)
                .setLayout(R.layout.fragment_login);
    }
}
