package io.github.andhikayuana.core.login;

import android.view.View;
import android.widget.TextView;

import io.github.andhikayuana.core.R;
import io.github.andhikayuana.lib.base.BaseViewHolder;

/**
 * @author yuana <andhikayuana@gmail.com>
 * @since 6/5/17
 */

public class ContactsViewHolder extends BaseViewHolder<Contact> {

    private TextView tvNumber;
    private TextView tvName;

    public ContactsViewHolder(View itemView) {
        super(itemView);

        tvName = (TextView) itemView.findViewById(R.id.tvName);
        tvNumber = (TextView) itemView.findViewById(R.id.tvNumber);
    }

    @Override
    public void bind(Contact item) {
        tvName.setText(item.getName());
        tvNumber.setText(item.getNumber());
    }
}
