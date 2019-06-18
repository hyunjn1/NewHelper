package com.android.newhelper.event;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.newhelper.R;

import static com.google.common.base.Preconditions.*;

public class EventFragment extends Fragment implements EventContract.View {

    EventContract.Presenter mPresenter;

    public static EventFragment newInstance(){
        return new EventFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.event_fragment, container, false);

        return view;
    }

    @Override
    public void setPresenter(EventContract.Presenter presenter) {
        mPresenter = checkNotNull(presenter);
    }
}
