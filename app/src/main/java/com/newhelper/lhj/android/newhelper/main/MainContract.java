package com.newhelper.lhj.android.newhelper.main;

import android.support.v4.app.Fragment;

import com.newhelper.lhj.android.newhelper.BasePresenter;
import com.newhelper.lhj.android.newhelper.BaseView;

/**
 * Created by LHJ on 2018-10-01.
 */

public interface MainContract {

    interface View extends BaseView<Presenter>{
        void setChildFragment(Fragment child);
    }

    interface Presenter extends BasePresenter{
        void onLabelClicked(android.view.View view);
    }

}
