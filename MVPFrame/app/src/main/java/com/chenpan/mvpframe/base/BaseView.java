package com.chenpan.mvpframe.base;

/**
 * MVP基础view
 */
public interface BaseView {

    void showProgress();

    void hideProgress();

    void showMsg(String message);
}