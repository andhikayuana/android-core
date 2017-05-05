package io.github.andhikayuana.lib.base;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yuana <andhikayuana@gmail.com>
 * @since 5/5/17
 */

public abstract class BaseRecyclerViewAdapter<T, VH extends BaseViewHolder>
        extends RecyclerView.Adapter<VH> {

    protected List<T> mData = new ArrayList<T>();
    protected Context mContext;

    public BaseRecyclerViewAdapter(Context context) {
        this.mContext = context;
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public T get(int position) {
        return mData.get(position);
    }

    public boolean add(T item) {
        return mData.add(item);
    }

    public int indexOf(T item) {
        return mData.indexOf(item);
    }

    public void updateItemAt(int idx, T item) {
        mData.set(idx, item);
    }

    public void addAll(List<T> items) {
        mData.clear();
        for (T item : items) {
            mData.add(item);
        }
    }

    public void addAll(T[] items) {
        addAll(Arrays.asList(items));
    }

    public boolean remove(T item) {
        return mData.remove(item);
    }

    public T removeItemAt(int idx) {
        return mData.remove(idx);
    }

    public void clear() {
        mData.clear();
    }

    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(setItemView(viewType), parent, false);
        return initViewHolder(view);
    }

    protected abstract VH initViewHolder(View view);

    @Override
    public void onBindViewHolder(VH holder, int position) {
        holder.bind(get(position));
    }

    @LayoutRes
    protected abstract int setItemView(int viewType);
}
