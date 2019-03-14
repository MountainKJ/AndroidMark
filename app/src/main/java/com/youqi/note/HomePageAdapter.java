package com.youqi.note;

import android.content.Context;
import android.view.View;

import com.x.core.widget.wrv.BaseRecycleViewAdapter;
import com.x.core.widget.wrv.BaseRecycleViewHolder;
import com.youqi.note.model.StringItem;

public class HomePageAdapter extends BaseRecycleViewAdapter<BaseRecycleViewHolder> {
    public HomePageAdapter(Context ctx) {
        super(ctx);
    }

    @Override
    protected void onInitViewType() {
        addViewType(StringItem.class, R.layout.item_hp_layout);
    }

    @Override
    protected BaseRecycleViewHolder onCreateViewHolder(View view, Context ctx, int viewType) {
        return new HomePageHolder(view, ctx);
    }

    @Override
    protected void onDestroy() {

    }
}
