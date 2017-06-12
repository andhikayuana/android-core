package io.github.andhikayuana.core.login;

import android.content.Context;
import android.view.View;

import io.github.andhikayuana.core.R;
import io.github.andhikayuana.lib.base.BaseRecyclerViewAdapter;

/**
 * @author yuana <andhikayuana@gmail.com>
 * @since 6/5/17
 */

public class ContactsAdapter extends BaseRecyclerViewAdapter<Contact, ContactsViewHolder> {

    public ContactsAdapter(Context context) {
        super(context);
    }

    @Override
    protected ContactsViewHolder initViewHolder(View view) {
        return new ContactsViewHolder(view);
    }

    @Override
    protected int setItemView(int viewType) {
        return R.layout.item_contact;
    }
}
