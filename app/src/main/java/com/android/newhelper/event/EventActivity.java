package com.android.newhelper.event;

import com.android.newhelper.SingleFragmentActivity;

public class EventActivity extends SingleFragmentActivity {
    @Override
    protected EventFragment createFragment() {
        EventFragment fragment = EventFragment.newInstance();
        new EventPresenter(fragment, this);

        return fragment;
    }
}

