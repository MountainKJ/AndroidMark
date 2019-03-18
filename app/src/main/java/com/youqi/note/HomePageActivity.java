package com.youqi.note;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import com.x.core.rv.WrapRecyclerView;
import com.youqi.note.adapter.HomePageAdapter;
import com.youqi.note.model.DividerB;
import com.youqi.note.model.DividerS;
import com.youqi.note.model.StringItem;

public class HomePageActivity extends AppCompatActivity {

    private WrapRecyclerView mRecycle;
    private HomePageAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        mRecycle = findViewById(R.id.act_hp_ry);
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
