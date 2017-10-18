package io.github.andhikayuana.core.login;

import android.view.View;

import io.github.andhikayuana.core.R;
import io.github.andhikayuana.lib.base.BaseFragment;

/**
 * @author yuana <andhikayuana@gmail.com>
 * @since 6/5/17
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
        mPresenter.login();
    }

    @Override
    protected LoginPresenter initPresenter() {
        return new LoginPresenter();
    }

    @Override
    protected int setView() {
        return R.layout.fragment_login;
    }
}
