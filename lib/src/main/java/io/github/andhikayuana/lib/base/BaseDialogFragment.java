package io.github.andhikayuana.lib.base;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;

/**
 * @author yuana <andhikayuana@gmail.com>
 * @since 5/5/17
 */

public abstract class BaseDialogFragment extends DialogFragment {

    protected ProgressDialog mProgress;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // TODO: 5/5/17 style here
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(setView(), null);
        initView(view);
        initProgress();
        return setupDialog(builder.setView(view));
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        // TODO: 5/5/17 animation
//        getDialog().getWindow().getAttributes().windowAnimations = R.style.WindowAnimation;
    }


    private void initProgress() {
        mProgress = new ProgressDialog(getActivity());
        mProgress.setMessage("Loading...");
    }


    protected abstract void initView(View view);

    protected abstract Dialog setupDialog(AlertDialog.Builder builder);

    @LayoutRes
    protected abstract int setView();
}

