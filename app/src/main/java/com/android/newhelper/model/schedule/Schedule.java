package com.android.newhelper.model.schedule;

public class Schedule {
    private Period when;
    private Alarm alarm;
    private Person who;
    private String title;
    private String description;

    private Schedule(Period when, Alarm alarm, Person who, String title, String description) {
        this.when = when;
        this.alarm = alarm;
        this.who = who;
        this.title = title;
        this.description = description;
    }

    public static class Builder {
        private Period when;
        private Alarm alarm;
        private Person who;
        private String title;
        private String description;

        public Builder(Period howLong) {
            setWhen(howLong);
        }

        private void setWhen(Period howLong){
            when = howLong;
        }

        public Schedule Build(){
            return new Schedule(when, alarm, who, title, description);
        }

        public Builder setAlarm(Alarm alarm){
            this.alarm = alarm;
            return this;
        }

        public Builder setWho(Person who){
            this.who = who;
            return this;
        }

        public Builder setTitle(String title){
            this.title = title;
            return this;
        }

        public Builder setDescription(String desc){
            description = desc;
            return this;
        }
    }
}
