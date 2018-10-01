package com.newhelper.lhj.android.newhelper;

public interface BaseContract {

    interface BaseView {

    }

    interface BasePresenter {
        void setBaseView(BaseView baseView);
    }


}
