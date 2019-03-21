package com.youqi.note.holder;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.x.core.widget.wrv.BaseRecycleViewHolder;
import com.youqi.note.R;
import com.youqi.note.model.RankInfo;

import java.util.Locale;

public class RankHolder extends BaseRecycleViewHolder {
    public RankHolder(View rootView, Context ctx) {
        super(rootView, ctx);
    }

    TextView tvNickName;
    TextView tvRank;
    @Override
    protected void onInitViews(View view) {
        tvNickName = find(R.id.item_rank_nick_tv);
        tvRank = find(R.id.item_rank_rank_tv);
    }

    @Override
    protected void onBindItem() {
        if(getItem().getData() instanceof RankInfo) {
            RankInfo ri = (RankInfo) getItem().getData();
            tvNickName.setText(ri.getWxNick());
            tvRank.setText(String.format(Locale.getDefault(), "排名：%d", ri.getRank()));
        }
    }

    @Override
    protected void onRecycleItem() {

    }

    @Override
    protected void onRefreshView() {
        onBindItem();
    }

    @Override
    protected void onDestroy() {

    }
}
