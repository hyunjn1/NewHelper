package com.android.newhelper.event;

import com.android.newhelper.BasePresenter;
import com.android.newhelper.BaseView;

public interface EventContract {
    interface View extends BaseView<Presenter>{

    }

    interface Presenter extends BasePresenter{

    }
}
