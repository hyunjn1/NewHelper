package com.newhelper.lhj.android.newhelper.main.child.childbasic.adapter;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.newhelper.lhj.android.newhelper.main.child.model.CalendarDate;

import java.util.ArrayList;
import java.util.List;

import static com.newhelper.lhj.android.newhelper.main.child.childbasic.adapter.AdapterContract.*;


public class CalendarAdapter extends BaseAdapter implements CalendarAdapterView, CalendarDataModel{

    private final Context mContext;
    private List<CalendarDate> mDateList;

    public CalendarAdapter(Context context) {
        mContext = context;
        mDateList = new ArrayList<>();
    }

    @Override
    public void add(CalendarDate calendarDate) {
        mDateList.add(calendarDate);
    }

    @Override
    public CalendarDate remove(int position) {
        return mDateList.remove(position);
    }

    @Override
    public CalendarDate getDate(int position) {
        return mDateList.get(position);
    }

    @Override
    public int getSize() {
        return mDateList.size();
    }



    @Deprecated
    @Override
    public int getCount() {
        return getSize();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }

}
