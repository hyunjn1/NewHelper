package com.android.newhelper.model.schedule;

import java.util.Calendar;

public abstract class Period {
    Calendar when;

    public Period() {
        setWhen();
    }

    private void setWhen(){

    }
}

class LongPeriod extends Period {
    Calendar whenEnd;

    public LongPeriod() {
        super();
        setWhenEnd();

    }

    public void setWhenEnd(){

    }
}

class ShortPeriod extends Period {

}
