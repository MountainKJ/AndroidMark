package com.youqi.note;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.TextView;

import com.x.core.widget.wrv.BaseRecycleViewHolder;
import com.youqi.note.model.StringItem;

public class HomePageHolder extends BaseRecycleViewHolder {
    public HomePageHolder(@NonNull View itemView, Context context) {
        super(itemView, context);
    }

    TextView tvTitle;
    @Override
    protected void onInitViews(View view) {
        tvTitle = find(R.id.item_hp_layout_title_tv);
    }

    @Override
    protected void onBindItem() {
        if(getItem().getData() instanceof StringItem) {
            StringItem si = (StringItem) getItem().getData();
            tvTitle.setText(si.getStr());
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
