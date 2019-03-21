package com.youqi.note.adapter;

import android.content.Context;
import android.view.View;

import com.x.core.widget.wrv.BaseRecycleViewAdapter;
import com.x.core.widget.wrv.BaseRecycleViewHolder;
import com.youqi.note.R;
import com.youqi.note.holder.DividerSmall1Holder;
import com.youqi.note.holder.RankHolder;
import com.youqi.note.model.DividerS;
import com.youqi.note.model.RankInfo;

public class RankAdapter extends BaseRecycleViewAdapter<BaseRecycleViewHolder> {
    public RankAdapter(Context ctx) {
        super(ctx);
    }

    @Override
    protected void onInitViewType() {
        addViewType(RankInfo.class, R.layout.item_rank_list_layout);
        addViewType(DividerS.class, R.layout.item_divider_1dp_layout);
    }

    @Override
    protected BaseRecycleViewHolder onCreateViewHolder(View view, Context ctx, int viewType) {
        if(viewType == 0){
            return new RankHolder(view, ctx);
        }
        return new DividerSmall1Holder(view, ctx);
    }

    @Override
    protected void onDestroy() {

    }
}
