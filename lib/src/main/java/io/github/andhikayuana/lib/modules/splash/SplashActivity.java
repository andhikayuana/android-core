package io.github.andhikayuana.lib.modules.splash;

import android.os.Bundle;
import android.support.annotation.Nullable;

import io.github.andhikayuana.lib.R;
import io.github.andhikayuana.lib.base.BaseActivity;

/**
 * @author yuana <andhikayuana@gmail.com>
 * @since 6/12/17
 */

public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        initView();
    }

    private void initView() {
        // TODO: 6/12/17 customizable layout maybe using callback
    }
}
