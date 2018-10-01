package com.newhelper.lhj.android.newhelper;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static com.newhelper.lhj.android.newhelper.BaseContract.*;


public class BasicTabFragment extends Fragment{

    public static Fragment newInstance(){
        return new BasicTabFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.basictab_fragement, container, false);


        return view;
    }
}
