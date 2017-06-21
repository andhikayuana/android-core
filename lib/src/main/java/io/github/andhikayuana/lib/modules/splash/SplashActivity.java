package io.github.andhikayuana.lib.modules.splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;

import io.github.andhikayuana.lib.Yuana;
import io.github.andhikayuana.lib.base.BaseActivity;

/**
 * @author yuana <andhikayuana@gmail.com>
 * @since 6/12/17
 */

public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(Yuana.getSplashConfig().getLayoutResource());

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this,
                        Yuana.getSplashConfig().getAfterSplashActivityClass());
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        }, Yuana.getSplashConfig().getDurationMilis());
    }
}
