package com.newhelper.lhj.android.newhelper.main.child.childbasic.adapter;

public class DateManager {

    private static boolean isLeapYear(int year){     /*윤년 판단*/
        return (year%4==0 || year%400==0 && year%100!=0);
    }

    public static int LastDayInMonth(int year, int month){      /*해당 달의 마지막 날 구하기*/
        int[] lD = {31,28,31,30,31,30,31,31,30,31,30,31};

        lD[1] = isLeapYear(year) ? 29 : 28;

        return lD[month-1];
    }

    private static int getDays(int year, int month, int day){        /*서기 원년부터의 총 일수*/
        int sumDay = ((year-1)*365) + ((year-1)/4) - ((year-1)/100) + ((year-1)/400); // 전 년도까지의 윤달을 포함한 총 일수(1)
        for(int i=1; i<month; i++) sumDay += LastDayInMonth(year, i);   // (1)+올해의 전 달까지의 일수(1~year년 전 달까지의 총 일수)(2)
        return sumDay+day;  // (2)+이번 달 오늘까지의 일수    -> 달의 첫 날을 구할 때 day=1
    }

    public static int DayOfWeek(int year, int month, int day){
        return getDays(year, month, day)%7+1;
    }
}
