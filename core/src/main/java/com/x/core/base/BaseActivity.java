package com.x.core.base;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.x.core.R;
import com.x.core.widget.nav.ActionBarMenu;
import com.x.core.widget.nav.OnActionBarItemSelectedListener;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseActivity extends AppCompatActivity implements OnActionBarItemSelectedListener {
    protected final String TAG = this.getClass().getSimpleName();
    private Unbinder bind;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initGlobalView();
        setContentView(mGlobalView);
        bind = ButterKnife.bind(this, mGlobalView);
        initGoBack();
    }

    protected abstract int getContentView();

    protected ActionBarMenu onActionBarCreate(){
        return null;
    }

    protected ViewGroup mGlobalView = null;
    protected ActionBarMenu mActionBar = null;
    protected View mActionBarView = null;
    protected void initGlobalView() {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this).inflate(getContentView(), null);
        mActionBar = onActionBarCreate();
        if(mActionBar == null) {
            mGlobalView = viewGroup;
            return;
        }
        LinearLayout tempLayout = getLinearLayout();
        mActionBarView = createActionBarView(tempLayout);
        mActionBar.setViewAndListener(mActionBarView, this);
        tempLayout.addView(mActionBarView);
        tempLayout.addView(viewGroup);

        mGlobalView = tempLayout;
    }

    @Override
    public void onActionBarClick(View v) {

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        bind.unbind();
    }

    protected View createActionBarView(ViewGroup parent) {
        return LayoutInflater.from(this).inflate(R.layout.default_action_bar_layout, parent, false);
    }

    private LinearLayout getLinearLayout() {
        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        int width = LinearLayout.LayoutParams.MATCH_PARENT;
        int height = LinearLayout.LayoutParams.MATCH_PARENT;
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(width, height);
        ll.setLayoutParams(params);
        return ll;
    }

    protected void jumpAct(Context fromCtx, Class targetClazz) {
        startActivity(new Intent(fromCtx, targetClazz));
    }

    protected void onGoBack() {
        this.finish();
    }

    private void initGoBack() {
        View goBackView = getGoBackView();
        if (goBackView != null) {
            goBackView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onGoBack();
                }
            });
        }
    }

    protected View getGoBackView() {
        ActionBarMenu bar = getActionBarMenu();
        if(bar != null){
            return bar.getLeftIcon();
        }
        return null;
    }

    public ActionBarMenu getActionBarMenu() {
        return mActionBar;
    }
}
