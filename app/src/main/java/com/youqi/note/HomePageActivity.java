package com.youqi.note;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.x.core.rv.WrapRecycleView;
import com.youqi.note.model.StringItem;

public class HomePageActivity extends AppCompatActivity {

    private WrapRecycleView mRecycle;
    private HomePageAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        mRecycle = findViewById(R.id.act_hp_ry);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        mRecycle.setLayoutManager(llm);
        adapter = new HomePageAdapter(this);
        mRecycle.setAdapter(adapter);
        for (int i = 0; i < 100; i++) {
            adapter.addItem(new StringItem("123"), null);
        }
        adapter.notifyDataSetChanged();
    }

}
