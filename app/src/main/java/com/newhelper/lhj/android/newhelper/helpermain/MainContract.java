package com.newhelper.lhj.android.newhelper.helpermain;

import com.newhelper.lhj.android.newhelper.BasePresenter;
import com.newhelper.lhj.android.newhelper.BaseView;

/**
 * Created by LHJ on 2018-10-01.
 */

public interface MainContract {

    interface View extends BaseView<Presenter>{}

    interface Presenter extends BasePresenter{

    }

}
