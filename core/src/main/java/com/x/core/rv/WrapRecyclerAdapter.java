package com.x.core.rv;

import android.support.annotation.NonNull;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;

public class WrapRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final String TAG = WrapRecyclerAdapter.class.getSimpleName();

    private SparseArray<View> mHeaderViews;
    private SparseArray<View> mFooterViews;

    //头部类型开始位置  itemViewType
    private static int BASE_ITEM_TYPE_HEADER = 1000000;
    //底部类型开始位置  itemViewType
    private static int BASE_ITEM_TYPE_FOOTER = 2000000;

    //列表的Adapter
    private RecyclerView.Adapter<RecyclerView.ViewHolder> mAdapter;

    public WrapRecyclerAdapter(RecyclerView.Adapter<RecyclerView.ViewHolder> mAdapter) {
        this.mAdapter = mAdapter;
        mHeaderViews = new SparseArray<>();
        mFooterViews = new SparseArray<>();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        if (isHeaderViewType(viewType)) {
            View headerView = mHeaderViews.get(viewType);
            return createHeaderFooterViewHolder(headerView);
        }
        if (isFooterViewType(viewType)) {
            View footerView = mFooterViews.get(viewType);
            return createHeaderFooterViewHolder(footerView);
        }
        return mAdapter.onCreateViewHolder(viewGroup, viewType);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        if (isHeaderPosition(position) || isFooterPosition(position)) {
            return;
        }
        position = position - mHeaderViews.size();
        mAdapter.onBindViewHolder(viewHolder, position);
    }

    @Override
    public int getItemViewType(int position) {
        if (isHeaderPosition(position)) {
            return mHeaderViews.keyAt(position);
        }
        if (isFooterPosition(position)) {
            position = position - mHeaderViews.size() - mAdapter.getItemCount();
            return mFooterViews.keyAt(position);
        }
        position = position - mHeaderViews.size();
        return mAdapter.getItemViewType(position);
    }

    @Override
    public int getItemCount() {
        return mAdapter.getItemCount() + mHeaderViews.size() + mFooterViews.size();
    }

    private boolean isHeaderViewType(int viewType) {
        int position = mHeaderViews.indexOfKey(viewType);
        return position >= 0;
    }

    private RecyclerView.ViewHolder createHeaderFooterViewHolder(View v) {
        return new RecyclerView.ViewHolder(v) {
        };
    }

    private boolean isFooterViewType(int viewType) {
        int position = mFooterViews.indexOfKey(viewType);
        return position >= 0;
    }

    private boolean isHeaderPosition(int position) {
        return position < mHeaderViews.size();
    }

    private boolean isFooterPosition(int position) {
        return position >= (mHeaderViews.size() + mAdapter.getItemCount());
    }

    public void addHeaderView(View v) {
        int position = mHeaderViews.indexOfValue(v);
        if (position < 0) {
            mHeaderViews.put(BASE_ITEM_TYPE_HEADER++, v);
        }
        notifyDataSetChanged();
    }

    public void addFooterView(View v) {
        int position = mFooterViews.indexOfValue(v);
        if (position < 0) {
            mFooterViews.put(BASE_ITEM_TYPE_FOOTER++, v);
        }
        notifyDataSetChanged();
    }

    public void removeHeaderView(View v) {
        int index = mHeaderViews.indexOfValue(v);
        if (index < 0) return;
        mHeaderViews.removeAt(index);
        notifyDataSetChanged();
    }

    public void removeFooterView(View v) {
        int index = mFooterViews.indexOfValue(v);
        if (index < 0) return;
        mFooterViews.removeAt(index);
        notifyDataSetChanged();
    }

    /**
     * 解决GridLayoutManager添加头部和底部不占用一行的问题
     *
     * @param recyclerView view
     * @version 1.0
     */
    public void adjustSpanSize(RecyclerView recyclerView) {
        if (recyclerView.getLayoutManager() instanceof GridLayoutManager) {
            final GridLayoutManager layoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            layoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                @Override
                public int getSpanSize(int position) {
                    boolean isHeaderOrFooter = isHeaderPosition(position) || isFooterPosition(position);
                    return isHeaderOrFooter ? layoutManager.getSpanCount() : 1;
                }
            });
        }
    }
}
