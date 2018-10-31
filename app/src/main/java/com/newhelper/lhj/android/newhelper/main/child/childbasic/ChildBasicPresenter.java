package com.newhelper.lhj.android.newhelper.main.child.childbasic;

import android.content.Context;
import android.util.Log;

import com.newhelper.lhj.android.newhelper.main.child.childbasic.adapter.AdapterContract;
import com.newhelper.lhj.android.newhelper.main.child.childbasic.adapter.DateManager;
import com.newhelper.lhj.android.newhelper.model.CalendarDate;
import com.newhelper.lhj.android.newhelper.model.DateFactory;
import com.newhelper.lhj.android.newhelper.R;
import com.newhelper.lhj.android.newhelper.main.child.childbasic.ChildBasicContract.View;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

public class ChildBasicPresenter implements ChildBasicContract.Presenter {

    private View mView;
    private Context mContext;
    private AdapterContract.CalendarAdapterModel mAdapterModel;

    private final SimpleDateFormat titleFormat = new SimpleDateFormat("yyyy년 MM월", Locale.US);

    ChildBasicPresenter(View view, AdapterContract.CalendarAdapterModel adapterModel, Context context) {
        mView = view;
        mAdapterModel = adapterModel;
        mContext = context;
    }

    private void setAdapterData(Calendar calendar){
        ArrayList<CalendarDate> list = new ArrayList<>();

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        int week = DateManager.DayOfWeek(year, month, 1);
        int lastDay = DateManager.LastDayInMonth(year, month);

        Log.d("initAdapterData()", "year=" + year + " month=" + month + " day=" + day + " lastDay=" + lastDay);

        for(int i = 1; i < week; i++){
            CalendarDate date = DateFactory.newInstance(week, true);
            date.setCalendar(year, month-1, 1-(week-i));
            list.add(date);
        }

        for(int i = 1; i <= lastDay; i++){
            week = DateManager.DayOfWeek(year, month, i);
            CalendarDate date = DateFactory.newInstance(week, null);
            date.setCalendar(year, month-1, i);
            list.add(date);
        }

        mAdapterModel.addAll(list);
    }

    private void setTitleDate(Calendar calendar){
        titleFormat.setCalendar(calendar);
        String titleDate = titleFormat.format(calendar.getTime());
        mView.setTitleDate(titleDate);

    }

    @Override
    public void adapterDataSetChange(int gradient){
        Calendar current = titleFormat.getCalendar();
        current.set(Calendar.MONTH, current.get(Calendar.MONTH)+gradient);
        titleFormat.setCalendar(current);

        mAdapterModel.clear();
        setAdapterData(current);
        setTitleDate(current);

        mView.refresh();
    }

    @Override
    public void initAdapterData() {
        Calendar today = Calendar.getInstance();
        setTitleDate(today);
        setAdapterData(today);
    }

    @Override
    public void getDayOfWeekArray(android.view.View view) {
        String[] texts = mContext.getResources().getStringArray(R.array.day_of_week_array);
        mView.setDayOfWeekText(view, texts);
    }
}
