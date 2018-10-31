package com.newhelper.lhj.android.newhelper.main.child.childbasic.adapter;


import android.content.Context;
import android.support.annotation.Nullable;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.newhelper.lhj.android.newhelper.model.CalendarDate;
import com.newhelper.lhj.android.newhelper.R;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static com.newhelper.lhj.android.newhelper.main.child.childbasic.adapter.AdapterContract.*;


public class CalendarAdapter extends BaseAdapter implements CalendarAdapterView, CalendarAdapterModel {

    private final Context mContext;
    private List<CalendarDate> mDateList;
    private CalendarViewHolder mHolder;

    public CalendarAdapter(Context context) {
        mContext = context;
        mDateList = new ArrayList<>();
    }

    private class CalendarViewHolder {
        View mView;
        TextView mDateView;

        CalendarViewHolder(View view) {
            mView = view;
            mDateView = view.findViewById(R.id.ITEM_Calendar_item);
        }


    }

    @Override
    public void addAll(List<CalendarDate> list) {
        mDateList.addAll(list);
    }

    @Override
    public void clear() {
        mDateList.clear();
    }

    @Override
    public int getCount() {
        return mDateList.size();
    }

    @Override
    public void refresh() {
        notifyDataSetChanged();
    }


    @Override
    public CalendarDate getItem(int position) {
        return mDateList.get(position);
    }

    @Override
    public long getItemId(int position) {
       return getItem(position).hashCode();
    }

    @Override
    public String getItemUUID(int position) {
        return mDateList.get(position).getId().toString().replace("-","");
    }

    @Nullable
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        LayoutInflater inflater = getInflater();

        if(view == null){
            view = inflater.inflate(R.layout.gridview_calendar_item, parent, false);
        }

        mHolder = new CalendarViewHolder(view);
        setItemText(position);

        return view;
    }

    @Override
    public void setItemText(int position) {
        mHolder.mDateView.setText(Html.fromHtml(String.valueOf(getItem(position).getCalendar(Calendar.DATE))));
        mHolder.mDateView.setTextColor(getItem(position).getStringColor());
    }

    @Override
    public LayoutInflater getInflater() {
        return (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
}
