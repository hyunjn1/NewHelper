package com.android.newhelper.main;

import android.app.Activity;
import android.view.View;

import com.android.newhelper.main.child.ChildFragment;

import static com.google.common.base.Preconditions.*;

/**
 * Created by LHJ on 2018-10-01.
 */

public class MainPresenter implements MainContract.Presenter {

    private Activity mActivity;
    private MainContract.View mView;

    MainPresenter(Activity activity, MainContract.View view) {
        mActivity = activity;
        mView = checkNotNull(view);
        mView.setPresenter(this);
    }

    @Override
    public void onLabelClicked(View view) {
        mView.setChildFragment(ChildFragment.newInstance(ChildFragment.ChildType.valueOf(view.getTag().toString())));
    }
}
