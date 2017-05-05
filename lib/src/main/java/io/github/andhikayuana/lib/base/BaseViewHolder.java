package io.github.andhikayuana.lib.base;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * @author yuana <andhikayuana@gmail.com>
 * @since 5/5/17
 */

public abstract class BaseViewHolder<T> extends RecyclerView.ViewHolder {

    public BaseViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void bind(T item);
}

