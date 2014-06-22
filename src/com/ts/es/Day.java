
package com.ts.es;

import java.io.Serializable;
import java.util.Vector;

/**
 * Class Day
 *
 * @author daibheid
 */
public class Day implements Serializable
{

    public static final int SUNDAY = 0;

    public static final int MONDAY = 1;

    public static final int TUESDAY = 2;

    public static final int WEDNESDAY = 3;

    public static final int THURSDAY = 4;

    public static final int FRIDAY = 5;

    public static final int SATURDAY = 6;

    public static final int JANUARY = 0;

    public static final int FEBRUARY = 1;

    public static final int MARCH = 2;

    public static final int APRIL = 3;

    public static final int MAY = 4;

    public static final int JUNE = 5;

    public static final int JULY = 6;

    public static final int AUGUST = 7;

    public static final int SEPTEMBER = 8;

    public static final int OCTOBER = 9;

    public static final int NOVEMBER = 10;

    public static final int DECEMBER = 11;

    private int dayOfWeek;

    private int dayOfMonth;

    private int month;

    private int year;

    private Vector<TimeBlock> times = new Vector<TimeBlock>();

    public Day(int dayOfWeek, int dayOfMonth, int month, int year)
    {
        this(dayOfWeek);
        setDate(dayOfMonth, month, year);
    }

    public Day(int dayOfWeek)
    {
        dayOfMonth = -1;
        month = -1;
        year = -1;
        this.dayOfWeek = dayOfWeek;
    }

    public Day(String day)
    {
        if (day.indexOf(",") != -1) {
            dayOfWeek = getDayOfWeekFromName(day.substring(0, day.indexOf(",")));
            day = day.substring(day.indexOf(",") + 2);

            month = getMonthFromName(day.substring(0, day.indexOf(" ")));
            day = day.substring(day.indexOf(" ") + 1);

            dayOfMonth = Integer.parseInt(day.substring(0, day.indexOf(", ")));
            day = day.substring(day.indexOf(",") + 2);

            year = Integer.parseInt(day);
        } else {
            dayOfWeek = getDayOfWeekFromName(day);
            dayOfMonth = -1;
            month = -1;
            year = -1;
        }
    }

    public boolean equals(Object obj)
    {
        boolean equal = false;

        if (this == obj) {
            equal = true;
        } else if (obj instanceof Day) {
            Day day = (Day) obj;
            if ((this.dayOfMonth == day.getDayOfMonth()) && (this.month == day.getMonth()) && (this.year == day.getYear())) {
                equal = true;
            }
        }

        return equal;
    }

    public String getName()
    {
        return getNameFromDayOfWeek(dayOfWeek);
    }

    public int getDayOfWeek()
    {
        return dayOfWeek;
    }

    public int getDayOfMonth()
    {
        return dayOfMonth;
    }

    public int getMonth()
    {
        return month;
    }

    public int getYear()
    {
        return year;
    }

    public static String getNameFromDayOfWeek(int dayOfWeek)
    {
        String name = "";

        switch (dayOfWeek) {
            case SUNDAY:
                name = "Sunday";
                break;
            case MONDAY:
                name = "Monday";
                break;
            case TUESDAY:
                name = "Tuesday";
                break;
            case WEDNESDAY:
                name = "Wednesday";
                break;
            case THURSDAY:
                name = "Thursday";
                break;
            case FRIDAY:
                name = "Friday";
                break;
            case SATURDAY:
                name = "Saturday";
                break;
        }

        return name;
    }

    public static int getDayOfWeekFromName(String name)
    {
        int retVal = -1;

        switch (name) {
            case "Sunday":
                retVal = SUNDAY;
                break;
            case "Monday":
                retVal = MONDAY;
                break;
            case "Tuesday":
                retVal = TUESDAY;
                break;
            case "Wednesday":
                retVal = WEDNESDAY;
                break;
            case "Thursday":
                retVal = THURSDAY;
                break;
            case "Friday":
                retVal = FRIDAY;
                break;
            case "Saturday":
                retVal = SATURDAY;
                break;
        }

        return retVal;
    }

    public static int getMonthFromName(String name)
    {
        int retVal = -1;

        switch (name) {
            case "January":
                retVal = JANUARY;
                break;
            case "February":
                retVal = FEBRUARY;
                break;
            case "March":
                retVal = MARCH;
                break;
            case "April":
                retVal = APRIL;
                break;
            case "May":
                retVal = MAY;
                break;
            case "June":
                retVal = JUNE;
                break;
            case "July":
                retVal = JULY;
                break;
            case "August":
                retVal = AUGUST;
                break;
            case "September":
                retVal = SEPTEMBER;
                break;
            case "October":
                retVal = OCTOBER;
                break;
            case "November":
                retVal = NOVEMBER;
                break;
            case "December":
                retVal = DECEMBER;
                break;
        }
        return retVal;
    }

    public static String getNameFromMonth(int month)
    {
        String name = "";

        switch (month) {
            case JANUARY:
                name = "January";
                break;
            case FEBRUARY:
                name = "February";
                break;
            case MARCH:
                name = "March";
                break;
            case APRIL:
                name = "April";
                break;
            case MAY:
                name = "May";
                break;
            case JUNE:
                name = "June";
                break;
            case JULY:
                name = "July";
                break;
            case AUGUST:
                name = "August";
                break;
            case SEPTEMBER:
                name = "September";
                break;
            case OCTOBER:
                name = "October";
                break;
            case NOVEMBER:
                name = "November";
                break;
            case DECEMBER:
                name = "December";
                break;
        }

        return name;
    }

    public void setDate(int dayOfMonth, int month, int year)
    {
        this.dayOfMonth = dayOfMonth;
        this.month = month;
        this.year = year;
    }

    public boolean hasDate()
    {
        return !(month == -1 || dayOfMonth == -1 || year == -1);
    }

    public String toString()
    {
        String formatted = "";

        if (hasDate()) {
            formatted = getName() + ", " + getNameFromMonth(month) + " " + dayOfMonth + ", " + year;
        } else {
            formatted = getName();
        }

        return formatted;
    }

    public boolean hasTimeBlocks()
    {
        boolean timeBlocks = false;

        if (getNumberOfTimeBlocks() != 0) {
            timeBlocks = true;
        }

        return timeBlocks;
    }

    public void addTimeBlock(int startHour, int startMinute, int endHour, int endMinute)
    {
        times.add(new TimeBlock(startHour, startMinute, endHour, endMinute));
    }
    
    public void addTimeBlock(String block) {
        times.add(new TimeBlock(block));
    }
    
    public void addtimeBlock(TimeBlock block) {
        times.add(block);
    }
    
    public void deleteTimeBlock(int startHour, int startMinute, int endHour, int endMinute) {
        TimeBlock toDelete = new TimeBlock(startHour, startMinute, endHour, endMinute);
        
        if(times.contains(toDelete))
            times.remove(toDelete);
    }
    
    public Vector<TimeBlock> getTimeBlocks() {
        return times;
    }
    
    public void deleteAllTimeBlocks() {
        times.clear();
    }
    
    public int getNumberOfTimeBlocks() {
        return times.size();
    }
}
