package com.newhelper.lhj.android.newhelper.main.child;

import android.support.v4.app.Fragment;

import com.newhelper.lhj.android.newhelper.main.child.childbasic.ChildBasicFragment;
import com.newhelper.lhj.android.newhelper.main.child.childoneday.ChildOnedayFragment;


public abstract class ChildFragment extends Fragment {
    public enum ChildType{
        BASIC, ONEDAY, DEFAULT
    }
    public static ChildFragment newInstance(ChildType type){
        switch(type){
            case BASIC :
                return new ChildBasicFragment();
            case ONEDAY :
                return new ChildOnedayFragment();
            default:
                return new ChildBasicFragment();
        }
    }
}
