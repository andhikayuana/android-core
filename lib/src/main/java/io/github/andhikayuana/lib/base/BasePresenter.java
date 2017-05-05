package io.github.andhikayuana.lib.base;

/**
 * @author yuana <andhikayuana@gmail.com>
 * @since 5/5/17
 */

public abstract class BasePresenter<V extends BaseView> {

    protected V mView;

    public BasePresenter() {
    }

    public void attachView(V view) {
        mView = view;
    }

    public void detachView() {
        mView = null;
    }
}
