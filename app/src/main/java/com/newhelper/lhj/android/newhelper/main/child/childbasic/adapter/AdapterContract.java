package com.newhelper.lhj.android.newhelper.main.child.childbasic.adapter;

import com.newhelper.lhj.android.newhelper.main.child.model.CalendarDate;

public interface AdapterContract {
    interface CalendarDataModel {
        void add(CalendarDate calendarDate);
        CalendarDate remove(int position);
        CalendarDate getDate(int position);
        int getSize();

    }

    interface CalendarAdapterView {

    }
}
