package com.newhelper.lhj.android.newhelper.main.child.childbasic.adapter;

import android.view.LayoutInflater;

import com.newhelper.lhj.android.newhelper.model.CalendarDate;

import java.util.List;

public interface AdapterContract {
    interface CalendarAdapterModel {
        void addAll(List<CalendarDate> list);
        void clear();
        int getCount();
        CalendarDate getItem(int position);
        String getItemUUID(int position);
    }

    interface CalendarAdapterView {
        void refresh();
        void setItemText(int position);
        LayoutInflater getInflater();
    }
}
