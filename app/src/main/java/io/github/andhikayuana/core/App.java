package io.github.andhikayuana.core;

import android.app.Application;

import io.github.andhikayuana.lib.Yuana;

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
        Yuana.Config config = Yuana.Config
                .Builder()
                .setAppName("Hello")
                .build();

        Yuana.init(this, config);
    }
}
