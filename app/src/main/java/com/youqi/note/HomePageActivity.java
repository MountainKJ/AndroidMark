package com.youqi.note;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.x.core.base.BaseActivity;
import com.x.core.rv.WrapRecyclerView;
import com.x.core.widget.nav.ActionBarMenu;
import com.youqi.note.adapter.HomePageAdapter;
import com.youqi.note.model.DividerB;
import com.youqi.note.model.DividerS;
import com.youqi.note.model.StringItem;
import com.youqi.note.ui.RetrofitTestActivity;

import java.util.concurrent.atomic.AtomicInteger;

import butterknife.BindView;

public class HomePageActivity extends BaseActivity implements WrapRecyclerView.OnRecycleItemClickListener {

    @Override
    protected int getContentView() {
        return R.layout.activity_home_page;
    }

    @Override
    protected ActionBarMenu onActionBarCreate() {
        return new ActionBarMenu("HomePage");
    }

    @BindView(R.id.act_hp_ry)
    WrapRecyclerView mRecycle;

    private HomePageAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addHeaderView();
        addFooterView();
        adapter = new HomePageAdapter(this);
        mRecycle.setAdapter(adapter);
        mRecycle.setOnItemClickListener(this);
        addAdapterItem();
    }

    private static AtomicInteger ai = new AtomicInteger();
    private static final int ID_TEST_RETROFIT = ai.getAndIncrement();

    private void addAdapterItem() {
        adapter.addItem(new DividerB(), null);
        adapter.addItem(new StringItem("Retrofit Test", ID_TEST_RETROFIT), null);
        adapter.addItem(new DividerS(), null);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onItemClick(View view, int position) {
        if (adapter == null || adapter.getItemCount() == 0)
            return;
        Object data = adapter.getItem(position).getData();
        if (data instanceof DividerB || data instanceof DividerS)
            return;
        StringItem si = (StringItem) data;
        int itemId = si.getItemId();
        if (itemId == ID_TEST_RETROFIT) {
            jumpAct(this, RetrofitTestActivity.class);
        }
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
