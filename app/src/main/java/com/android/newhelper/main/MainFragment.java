package com.android.newhelper.main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.newhelper.main.child.ChildFragment;
import com.android.newhelper.R;

import static com.google.common.base.Preconditions.*;

public class MainFragment extends Fragment implements View.OnClickListener, MainContract.View{

    MainContract.Presenter mPresenter;
    public static final int CHILD_CONTAINER = R.id.Main_FL_ChildContainer;

    public static Fragment newInstance(){
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_fragment, container, false);
        view.setTag(ChildFragment.ChildType.DEFAULT);

        TextView basic = view.findViewById(R.id.Main_TV_BasicLabel);
        basic.setTag(ChildFragment.ChildType.BASIC);
        TextView oneDay = view.findViewById(R.id.Main_TV_OnedayLabel);
        oneDay.setTag(ChildFragment.ChildType.ONEDAY);

        basic.setOnClickListener(this);
        oneDay.setOnClickListener(this);

        mPresenter = new MainPresenter(getActivity(), this);
        mPresenter.onLabelClicked(view);

        return view;
    }

    @Override
    public void onClick(View view) {
        mPresenter.onLabelClicked(view);
    }


    @Override
    public void setChildFragment(Fragment child) {
        FragmentTransaction childFragmentTran = getChildFragmentManager().beginTransaction();
        if(!child.isAdded()){
            childFragmentTran.replace(CHILD_CONTAINER, child)
                    .addToBackStack(null)
                    .commit();
        }
    }

    @Override
    public void setPresenter(@NonNull MainContract.Presenter presenter) {
        mPresenter = checkNotNull(presenter);
    }
}
