package io.github.andhikayuana.lib.modules.auth.login;

import android.view.View;

import io.github.andhikayuana.lib.base.BaseFragment;

/**
 * @author yuana <andhikayuana@gmail.com>
 * @since 6/12/17
 */

public class LoginFragment extends BaseFragment<LoginPresenter> {

    @Override
    public void showLoading() {

    }

    @Override
    public void dismissLoading() {

    }

    @Override
    public void showError(Throwable throwable) {

    }

    @Override
    protected void initView(View v) {

    }

    @Override
    protected LoginPresenter initPresenter() {
        return new LoginPresenter();
    }

    @Override
    protected int setView() {
        return 0;
    }
}
