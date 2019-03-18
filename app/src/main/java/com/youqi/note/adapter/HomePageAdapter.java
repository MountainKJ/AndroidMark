package com.youqi.note.adapter;

import android.content.Context;
import android.view.View;

import com.x.core.widget.wrv.BaseRecycleViewAdapter;
import com.x.core.widget.wrv.BaseRecycleViewHolder;
import com.youqi.note.holder.DividerSmall5Holder;
import com.youqi.note.holder.DividerSmall1Holder;
import com.youqi.note.holder.HomePageHolder;
import com.youqi.note.R;
import com.youqi.note.model.DividerB;
import com.youqi.note.model.DividerS;
import com.youqi.note.model.StringItem;

public class HomePageAdapter extends BaseRecycleViewAdapter<BaseRecycleViewHolder> {
    public HomePageAdapter(Context ctx) {
        super(ctx);
    }

    @Override
    protected void onInitViewType() {
        addViewType(StringItem.class, R.layout.item_hp_layout);
        addViewType(DividerS.class, R.layout.item_divider_1dp_layout);
        addViewType(DividerB.class, R.layout.item_divider_5dp_layout);
    }

    @Override
    protected BaseRecycleViewHolder onCreateViewHolder(View view, Context ctx, int viewType) {
        if(viewType == 0) {
            return new HomePageHolder(view, ctx);
        }else if(viewType == 1) {
            return new DividerSmall1Holder(view, ctx);
        }
        return new DividerSmall5Holder(view, ctx);
    }

    @Override
    protected void onDestroy() {

    }
}
