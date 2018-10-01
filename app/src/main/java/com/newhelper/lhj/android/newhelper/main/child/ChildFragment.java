package com.newhelper.lhj.android.newhelper.main.child;

import android.support.v4.app.Fragment;

import com.newhelper.lhj.android.newhelper.R;
import com.newhelper.lhj.android.newhelper.main.child.childbasic.ChildBasicFragment;
import com.newhelper.lhj.android.newhelper.main.child.childoneday.ChildOnedayFragment;


public abstract class ChildFragment extends Fragment {
    public static ChildFragment newInstance(int viewId){
        switch(viewId){
            case R.id.Main_TV_BasicLabel :
                return new ChildBasicFragment();
            case R.id.Main_TV_OnedayLabel :
                return new ChildOnedayFragment();
            default:
                return new ChildBasicFragment();
        }
    }
}
