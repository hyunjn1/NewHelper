package com.newhelper.lhj.android.newhelper.helpermain;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.newhelper.lhj.android.newhelper.R;
import static com.google.common.base.Preconditions.*;

public class MainFragment extends Fragment implements View.OnClickListener, MainContract.View{

    private MainContract.Presenter mPresenter;

    public static Fragment newInstance(){
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_fragment, container, false);

        TextView basic = view.findViewById(R.id.main_label_basic);
        TextView oneDay = view.findViewById(R.id.main_label_oneday);

        basic.setOnClickListener(this);
        oneDay.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.main_label_basic :

        }
    }

    @Override
    public void setPresenter(@NonNull MainContract.Presenter presenter) {
        mPresenter = checkNotNull(presenter);
    }
}
