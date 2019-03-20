package com.youqi.note;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.x.core.rv.WrapRecyclerView;
import com.youqi.note.adapter.HomePageAdapter;
import com.youqi.note.model.DividerB;
import com.youqi.note.model.DividerS;
import com.youqi.note.model.StringItem;
import com.x.core.base.BaseActivity;

import butterknife.BindView;

public class HomePageActivity extends BaseActivity {

    @Override
    protected int getContentView() {
        return R.layout.activity_home_page;
    }

    @BindView(R.id.act_hp_ry)
    WrapRecyclerView mRecycle;

    private HomePageAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new HomePageAdapter(this);
        mRecycle.setAdapter(adapter);
        addHeaderView();
        addFooterView();
        adapter.addItem(new DividerB(), null);
        for (int i = 0; i < 100; i++) {
            adapter.addItem(new StringItem("123"), null);
            if(i < 99) {
                adapter.addItem(new DividerS(), null);
            }else {
                adapter.addItem(new DividerB(), null);
            }
        }
        adapter.notifyDataSetChanged();
    }

    private void addHeaderView() {
        View headerView = LayoutInflater.from(this).inflate(R.layout.header_hp_layout, mRecycle, false);
        mRecycle.addHeaderView(headerView);
    }

    private void addFooterView() {
        View headerView = LayoutInflater.from(this).inflate(R.layout.header_hp_layout, mRecycle, false);
        mRecycle.addFooterView(headerView);
    }

}
