package io.github.andhikayuana.core.login;

import io.github.andhikayuana.lib.base.BasePresenter;

/**
 * @author yuana <andhikayuana@gmail.com>
 * @since 6/5/17
 */

public class LoginPresenter extends BasePresenter<LoginView> {

    public void login() {
        mView.showLoading();
    }
}
