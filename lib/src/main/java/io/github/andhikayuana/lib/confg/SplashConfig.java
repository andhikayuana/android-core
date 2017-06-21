package io.github.andhikayuana.lib.confg;

import android.support.annotation.LayoutRes;

import io.github.andhikayuana.lib.R;

/**
 * @author yuana <andhikayuana@gmail.com>
 * @since 6/21/17
 */

public class SplashConfig {

    private int durationMilis = 2500;
    @LayoutRes
    private int layout = R.layout.activity_splash;
    private Class<?> afterSplashActivityClass;

    @LayoutRes
    public int getLayoutResource() {
        return layout;
    }

    public SplashConfig setLayout(@LayoutRes int layout) {
        this.layout = layout;
        return this;
    }

    public Class<?> getAfterSplashActivityClass() {
        if (afterSplashActivityClass == null)
            throw new IllegalStateException("You must setAfterSplashCallback");
        return afterSplashActivityClass;
    }

    public SplashConfig setAfterSplashActivityClass(Class<?> activityClass) {
        this.afterSplashActivityClass = activityClass;
        return this;
    }

    public int getDurationMilis() {
        return durationMilis;
    }

    public SplashConfig setDurationMilis(int durationMilis) {
        this.durationMilis = durationMilis;
        return this;
    }
}
