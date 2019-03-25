package com.youqi.note.ui;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.x.core.base.BaseActivity;
import com.x.core.widget.nav.ActionBarMenu;
import com.youqi.note.R;

public abstract class SupperActivity extends BaseActivity {
    protected ActionBarMenu createDefaultBackActionMenu(String title) {
        return new ActionBarMenu(R.mipmap.icon_back, title);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(LOLLIPOP_UP()) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.col_main));
        }

    }

    public static boolean LOLLIPOP_UP() {
        //5.0之上
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP;
    }
}
