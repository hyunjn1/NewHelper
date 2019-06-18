package com.android.newhelper.model.calendar;

import android.support.annotation.Nullable;

public abstract class DateFactory {
    public static CalendarDate newInstance(int week, @Nullable Boolean isPreMonth){
        if(isPreMonth != null && isPreMonth)    return new DatePreMonth();
        if(week==1)                             return new DateSunday();
        else if(week==7)                        return new DateSaturday();
        else                                    return new DateDefault();
    }
}
