package com.android.newhelper.main;

import android.support.v4.app.Fragment;

import com.android.newhelper.SingleFragmentActivity;

public class HelperActivity extends SingleFragmentActivity{
    @Override
    protected Fragment createFragment() {
        return MainFragment.newInstance();
    }
}
