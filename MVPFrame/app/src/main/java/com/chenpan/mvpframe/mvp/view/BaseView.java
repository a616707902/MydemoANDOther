package com.chenpan.mvpframe.mvp.view;

/**
 * MVP基础view
 */
public interface BaseView {

    void showProgress();

    void hideProgress();

    void showMsg(String message);
}