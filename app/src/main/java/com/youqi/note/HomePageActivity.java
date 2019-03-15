package com.youqi.note;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import com.x.core.rv.WrapRecyclerView;
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
        for (int i = 0; i < 100; i++) {
            adapter.addItem(new StringItem("123"), null);
        }
        adapter.notifyDataSetChanged();
    }

    private void addHeaderView() {
        View headerView = LayoutInflater.from(this).inflate(R.layout.header_hp_layout, mRecycle, false);
        mRecycle.addHeaderView(headerView);
    }

}
