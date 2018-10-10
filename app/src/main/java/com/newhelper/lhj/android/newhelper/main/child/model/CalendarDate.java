package com.newhelper.lhj.android.newhelper.main.child.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.UUID;

public class CalendarDate {
    public static final SimpleDateFormat calendarItemFormat = new SimpleDateFormat("dd", Locale.US);

    private UUID id;
    private Calendar calendar;
    private int dayOfWeek;

    public CalendarDate() {
        id = UUID.randomUUID();
    }
}
