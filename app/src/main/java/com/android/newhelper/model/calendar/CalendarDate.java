package com.android.newhelper.model.calendar;

import com.android.newhelper.model.schedule.Schedule;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.UUID;

public abstract class CalendarDate {
    // ARGB
    final int COLOR_SUN = 0xFFFF8484;
    final int COLOR_SAT = 0xFF909AFF;
    final int COLOR_DEF = 0xFFFFFFFF;
    final int COLOR_PRE = 0xFF888888;

    private UUID id;
    private Calendar calendar;
    private Schedule schedule;

    CalendarDate(){
        setId();
        calendar = new GregorianCalendar();
    }

    public abstract int getStringColor();

    private void setId() {
        id = UUID.randomUUID();
    }

    public void setCalendar(int year, int month, int day) {
        calendar.set(year, month, day);
    }

    public int getCalendar(int field) {
        return calendar.get(field);
    }

    public UUID getId() {
        return id;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public Schedule getSchedule() {
        return schedule;
    }
}

class DateSunday extends CalendarDate {
    @Override
    public int getStringColor() {
        return COLOR_SUN;
    }
}

class DateSaturday extends CalendarDate {
    @Override
    public int getStringColor() {
        return COLOR_SAT;
    }
}

class DateDefault extends CalendarDate {
    @Override
    public int getStringColor() {
        return COLOR_DEF;
    }
}

class DatePreMonth extends CalendarDate {
    @Override
    public int getStringColor() {
        return COLOR_PRE;
    }
}
