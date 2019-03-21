package com.x.core.widget.nav;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.x.core.R;

import java.util.List;

public class ActionBarMenu implements View.OnClickListener {
    private int iconResId;
    private String title;
    private List<ItemView> items = null;

    public ActionBarMenu(String title) {
        this.title = title;
    }

    public ActionBarMenu(int iconResId, String title) {
        this.iconResId = iconResId;
        this.title = title;
    }

    @Override
    public void onClick(View v) {
        if(listener != null) {
            this.listener.onActionBarClick(v);
        }
    }

    private ViewGroup viewGroup = null;
    private TextView tvTitle;
    private ImageView leftIcon;
    private LinearLayout itemLayout = null;
    private OnActionBarItemSelectedListener listener;
    public void setViewAndListener(View v, OnActionBarItemSelectedListener listener) {
        this.listener = listener;
        this.viewGroup = (ViewGroup) v;
        tvTitle = viewGroup.findViewById(R.id.action_bar_title_tv);
        tvTitle.setText(getTitle());
        leftIcon = viewGroup.findViewById(R.id.action_bar_left_iv);
        if (this.getIconResId() > 0) {
            leftIcon.setImageResource(getIconResId());
            leftIcon.setVisibility(View.VISIBLE);
            leftIcon.setOnClickListener(this);
            leftIcon.setAdjustViewBounds(true);
            leftIcon.setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            leftIcon.setVisibility(View.INVISIBLE);
        }
        List<ItemView> itemList = getItems();
        if(itemList != null && itemList.size() > 0) {
            itemLayout = viewGroup.findViewById(R.id.action_bar_right_layout);
            for (ItemView item : itemList) {
                addItemView(item);
            }
        }
    }

    public void addItemView(ItemView item){
        if(item == null){
            return;
        }
        View vv = item.getView();
        if (item.isClickable()) {
            vv.setOnClickListener(this);
        }

        vv.setOnClickListener(this);
        itemLayout.addView(vv);
    }


    public List<ItemView> getItems() {
        return items;
    }

    public void setItems(List<ItemView> items) {
        this.items = items;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIconResId() {
        return iconResId;
    }

    public void setIconResId(int iconResId) {
        this.iconResId = iconResId;
    }

    public ImageView getLeftIcon() {
        return leftIcon;
    }
}
