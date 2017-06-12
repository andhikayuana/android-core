package io.github.andhikayuana.lib.modules.auth;

import android.os.Bundle;
import android.support.annotation.Nullable;

import io.github.andhikayuana.lib.R;
import io.github.andhikayuana.lib.base.BaseActivity;

/**
 * @author yuana <andhikayuana@gmail.com>
 * @since 6/12/17
 */

public class AuthActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);

        initView();
    }

    private void initView() {
        // TODO: 6/12/17 initialize the view and setup some fragment in auth module
    }
}
