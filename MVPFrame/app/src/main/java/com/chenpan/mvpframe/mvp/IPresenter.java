package com.chenpan.mvpframe.mvp;

import android.content.Context;

public interface IPresenter<T> {
    void attachView(T view, Context context);

    void detachView();
}