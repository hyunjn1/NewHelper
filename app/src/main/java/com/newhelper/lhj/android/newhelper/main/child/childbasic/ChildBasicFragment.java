package com.newhelper.lhj.android.newhelper.main.child.childbasic;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.newhelper.lhj.android.newhelper.main.child.ChildFragment;
import com.newhelper.lhj.android.newhelper.R;
import com.newhelper.lhj.android.newhelper.main.child.childbasic.adapter.AdapterContract;
import com.newhelper.lhj.android.newhelper.main.child.childbasic.adapter.CalendarAdapter;

import static com.google.common.base.Preconditions.*;

public class ChildBasicFragment extends ChildFragment implements ChildBasicContract.View, View.OnClickListener{

    ChildBasicContract.Presenter mPresenter;
    AdapterContract.CalendarAdapterView mAdapterView;

    TextView titleDate;
    ImageView preButton;
    ImageView nextButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.basictab_fragement, container, false);

        GridView gridView = view.findViewById(R.id.GV_ChildBasic_GridCalendar);
        preButton = view.findViewById(R.id.IV_ChildBasic_CalendarPreButton);
        nextButton = view.findViewById(R.id.IV_ChildButton_CalendarNextButton);
        titleDate = view.findViewById(R.id.TV_Child_TitleDate);

        preButton.setOnClickListener(this);
        nextButton.setOnClickListener(this);

        final CalendarAdapter mAdapter = new CalendarAdapter(getActivity());
        mAdapterView = mAdapter;

        mPresenter = new ChildBasicPresenter(this, mAdapter, getActivity());
        mPresenter.initAdapterData();
        mPresenter.getDayOfWeekArray(view);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

        gridView.setAdapter(mAdapter);
        return view;
    }

    @Override
    public void refresh() {
        mAdapterView.refresh();
    }

    @Override
    public void setTitleDate(String title) {
        titleDate.setText(title);
    }

    @Override
    public void setPresenter(ChildBasicContract.Presenter presenter) {
        mPresenter = checkNotNull(presenter);
    }

    @Override
    public void onClick(View v) {
        int gradient =
                v.getId() == preButton.getId() ? -1 : 1;
        mPresenter.adapterDataSetChange(gradient);
    }

    @Override
    public void setDayOfWeekText(View view, String[] arr) {
        for(int i=1; i<8; i++){
            TextView textView = view.findViewWithTag(String.valueOf(i));
            textView.setText(arr[i-1]);
        }
    }
}
