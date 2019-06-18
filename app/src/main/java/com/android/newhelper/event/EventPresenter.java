package com.android.newhelper.event;

import android.content.Context;

import static com.android.newhelper.event.EventContract.*;

public class EventPresenter implements Presenter {
    private View mView;
    private Context mContext;

    EventPresenter(View view, Context context) {
        mView = view;
        mContext = context;
        mView.setPresenter(this);
    }
}
