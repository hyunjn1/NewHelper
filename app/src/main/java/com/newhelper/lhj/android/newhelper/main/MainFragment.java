package com.newhelper.lhj.android.newhelper.main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.newhelper.lhj.android.newhelper.R;
import static com.google.common.base.Preconditions.*;

public class MainFragment extends Fragment implements View.OnClickListener, MainContract.View{

    MainContract.Presenter mPresenter;

    public static Fragment newInstance(){
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_fragment, container, false);

        TextView basic = view.findViewById(R.id.Main_TV_BasicLabel);
        TextView oneDay = view.findViewById(R.id.Main_TV_OnedayLabel);

        basic.setOnClickListener(this);
        oneDay.setOnClickListener(this);

        mPresenter = new MainPresenter(getActivity(), this);
        mPresenter.onLabelClicked(view.getId());

        return view;
    }

    @Override
    public void onClick(View view) {
        mPresenter.onLabelClicked(view.getId());
    }


    @Override
    public void setChildFragment(Fragment child) {
        FragmentTransaction childFragmentTran = getChildFragmentManager().beginTransaction();
        if(!child.isAdded()){
            childFragmentTran.replace(R.id.Main_FL_ChildContainer, child)
                    .addToBackStack(null)
                    .commit();
        }
    }

    @Override
    public void setPresenter(@NonNull MainContract.Presenter presenter) {
        mPresenter = checkNotNull(presenter);
    }
}
