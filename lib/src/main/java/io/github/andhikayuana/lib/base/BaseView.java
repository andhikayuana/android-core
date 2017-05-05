package io.github.andhikayuana.lib.base;

/**
 * @author yuana <andhikayuana@gmail.com>
 * @since 5/5/17
 */

public interface BaseView {

    void showLoading();

    void dismissLoading();

    void showError(Throwable throwable);
}
