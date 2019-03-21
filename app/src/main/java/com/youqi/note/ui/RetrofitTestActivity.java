package com.youqi.note.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.widget.Toast;

import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.x.core.base.BaseActivity;
import com.x.core.rv.WrapRecyclerView;
import com.x.core.widget.nav.ActionBarMenu;
import com.youqi.note.R;
import com.youqi.note.adapter.RankAdapter;
import com.youqi.note.loader.ApiLoader;
import com.youqi.note.model.DividerS;
import com.youqi.note.model.RankInfo;
import com.youqi.note.model.RankResult;

import java.util.List;

import butterknife.BindView;
import rx.functions.Action1;

public class RetrofitTestActivity extends BaseActivity {

    @BindView(R.id.act_retrofit_test_wrv)
    WrapRecyclerView mRecycleView;

    @BindView(R.id.act_retrofit_refresh_layout)
    SmartRefreshLayout mRefreshLayout;

    RankAdapter mAdapter;

    @Override
    protected int getContentView() {
        return R.layout.act_retrofit_test_layout;
    }

    @Override
    protected ActionBarMenu onActionBarCreate() {
        return new ActionBarMenu(R.mipmap.icon_back,"排行榜【Retrofit Test】");
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAdapter = new RankAdapter(this);
        mRecycleView.setAdapter(mAdapter);
        loadData();
        mRefreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                refreshLayout.finishRefresh(1000);
            }
        });

        mRefreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
                mRefreshLayout.finishLoadMore(1000);
            }
        });
    }

    public void loadData() {
        ApiLoader loader = new ApiLoader();
        loader.loadRank().subscribe(new Action1<RankResult>() {
                    @Override
                    public void call(RankResult rankResult) {
                        List<RankInfo> rankList = rankResult.getRanks();
                        for (RankInfo rankInfo : rankList) {
                            mAdapter.addItem(rankInfo, null);
                            mAdapter.addItem(new DividerS(), null);
                        }
                        mAdapter.notifyDataSetChanged();
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        Toast.makeText(RetrofitTestActivity.this, "error = "+throwable.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });
    }
}
