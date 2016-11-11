package com.chenpan.mvpframe.base;

import android.content.Context;

import com.chenpan.mvpframe.mvp.IPresenter;

public abstract class BasePresenter<T> implements IPresenter<T> {
    public Context mActivity;
    public T mView;

    @Override
    public void attachView(T view, Context context) {
        this.mView = view;
        this.mActivity = context;
        this.onStart();
    }

    @Override
    public void detachView() {
        this.mView = null;
    }

    public void onStart(){}

}