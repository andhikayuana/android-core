package io.github.andhikayuana.lib.base;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author yuana <andhikayuana@gmail.com>
 * @since 5/5/17
 */

public abstract class BaseFragment<P extends BasePresenter> extends Fragment implements BaseView {

    protected P mPresenter;
    protected ProgressDialog mProgress;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (mPresenter == null) mPresenter = initPresenter();
    }

    @Override
    public void onStart() {
        super.onStart();
        mPresenter.attachView(this);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mPresenter.detachView();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(setView(), container, false);
        initView(view);
        return view;
    }

    protected abstract void initView(View v);

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initProgress();
    }

    private void initProgress() {
        mProgress = new ProgressDialog(getActivity());
        mProgress.setMessage("Loading...");
    }

    protected abstract P initPresenter();

    @LayoutRes
    protected abstract int setView();
}

