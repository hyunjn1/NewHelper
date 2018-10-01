package com.newhelper.lhj.android.newhelper.helpermain;

import android.support.v4.app.Fragment;
import android.view.View;

import com.newhelper.lhj.android.newhelper.SingleFragmentActivity;

public class HelperActivity extends SingleFragmentActivity{
    @Override
    protected Fragment createFragment() {
        return MainFragment.newInstance();
    }
}
