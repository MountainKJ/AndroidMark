package com.youqi.note.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import android.widget.ImageView;

import com.x.core.widget.nav.ActionBarMenu;
import com.youqi.note.R;

import butterknife.BindView;
import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

public class RxTestActivity extends SupperActivity {
    @BindView(R.id.act_test_rx_iv)
    ImageView ivChange;

    @BindView(R.id.act_test_rx_edi)
    EditText editText;

    @Override
    protected int getContentView() {
        return R.layout.act_rx_test;
    }

    @Override
    protected ActionBarMenu onActionBarCreate() {
        return createDefaultBackActionMenu("RxJavaTest");
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int[] resId = {R.mipmap.iv1,R.mipmap.iv2,R.mipmap.iv3,R.mipmap.iv4,R.mipmap.iv5,R.mipmap.iv6,R.mipmap.iv7,R.mipmap.iv8,R.mipmap.iv9,R.mipmap.iv10};
//        Observable.create(new Observable.OnSubscribe<Drawable>() {
//            @Override
//            public void call(Subscriber<? super Drawable> subscriber) {
//                Drawable drawable = getResources().getDrawable(R.mipmap.iv1);
//                subscriber.onNext(drawable);
//                subscriber.onCompleted();
//            }
//        })
//        .subscribeOn(Schedulers.io())
//        .observeOn(AndroidSchedulers.mainThread())
//        .subscribe(new Observer<Drawable>() {
//            @Override
//            public void onCompleted() {
//
//            }
//
//            @Override
//            public void onError(Throwable e) {
//
//            }
//
//            @Override
//            public void onNext(Drawable drawable) {
//                ivChange.setImageDrawable(drawable);
//            }
//        });

        Observable.just("images/logo.jpg")
                .map(new Func1<String, Bitmap>() {
                    @Override
                    public Bitmap call(String filePath) {
                        return BitmapFactory.decodeFile(filePath);
                    }
                })
                .subscribe(new Action1<Bitmap>() {
                    @Override
                    public void call(Bitmap bitmap) {
                        ivChange.setImageBitmap(bitmap);
                    }
                });

    }
}
