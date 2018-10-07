package com.newhelper.lhj.android.newhelper.main.child.childbasic;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.newhelper.lhj.android.newhelper.R;
import com.newhelper.lhj.android.newhelper.main.child.ChildFragment;

import static com.google.common.base.Preconditions.*;

public class ChildBasicFragment extends ChildFragment implements ChildBasicContract.View{
    ChildBasicContract.Presenter mPresenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.basictab_fragement, container, false);

        return view;
    }

    @Override
    public void setPresenter(ChildBasicContract.Presenter presenter) {
        mPresenter = checkNotNull(presenter);
    }
}
