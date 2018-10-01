package com.newhelper.lhj.android.newhelper;

import android.app.Activity;

public class BasicTabPresenter implements BaseContract.BasePresenter {
    private BaseContract.BaseView mBaseView;
    private Activity mActivity;

    public BasicTabPresenter(Activity activity){
        mActivity = activity;
    }

    @Override
    public void setBaseView(BaseContract.BaseView baseView) {
        mBaseView = baseView;
    }
}
