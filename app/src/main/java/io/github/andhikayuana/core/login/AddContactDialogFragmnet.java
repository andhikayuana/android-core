package io.github.andhikayuana.core.login;

import android.app.Dialog;
import android.support.v7.app.AlertDialog;
import android.view.View;

import io.github.andhikayuana.core.R;
import io.github.andhikayuana.lib.base.BaseDialogFragment;

/**
 * @author yuana <andhikayuana@gmail.com>
 * @since 6/5/17
 */

public class AddContactDialogFragmnet extends BaseDialogFragment {

    @Override
    protected void initView(View view) {

    }

    @Override
    protected Dialog setupDialog(AlertDialog.Builder builder) {
        return builder.create();
    }

    @Override
    protected int setView() {
        return R.layout.dialog_fragment_add_contact;
    }
}
