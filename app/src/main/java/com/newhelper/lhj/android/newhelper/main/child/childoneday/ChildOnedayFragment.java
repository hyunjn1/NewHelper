package com.newhelper.lhj.android.newhelper.main.child.childoneday;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.newhelper.lhj.android.newhelper.R;
import com.newhelper.lhj.android.newhelper.main.child.ChildFragment;

public class ChildOnedayFragment extends ChildFragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.onedaytab_fragement, container, false);

        return view;
    }
}
