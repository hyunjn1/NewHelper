package com.android.newhelper.main.child.childbasic;

import com.android.newhelper.BasePresenter;
import com.android.newhelper.BaseView;

public interface ChildBasicContract {
    interface View extends BaseView<Presenter> {
        void refresh();
        void setTitleDate(String title);
        void setDayOfWeekText(android.view.View view, String[] arr);

    }
    interface Presenter extends BasePresenter {
        void initAdapterData();
        void adapterDataSetChange(int gradient);
        void getDayOfWeekArray(android.view.View view);
        void checkItemClick(int position);
    }
}
