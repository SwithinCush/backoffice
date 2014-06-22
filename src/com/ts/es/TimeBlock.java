
package com.ts.es;

import java.io.Serializable;
import java.text.DecimalFormat;

/**
 * Class TimeBlock
 *
 * @author daibheid
 */
public class TimeBlock implements Serializable {
    private int startHour;
    private int startMinute;
    private int endHour;
    private int endMinute;
    
    public TimeBlock(TimeBlock time) {
        this.startHour = time.getStartHour();
        this.startMinute = time.getStartMinute();
        this.endHour = time.getEndHour();
        this.endMinute = time.getEndMinute();
    }
    
    public TimeBlock(int startHour, int startMinute, int endHour, int endMinute) {
        this.startHour = startHour;
        this.startMinute = startMinute;
        this.endHour = endHour;
        this.endMinute = endMinute;
    }
    
    public TimeBlock(String startEnd) {
        String[] times = startEnd.split(" - ");
        String[] startTimeParts = times[0].split(" ");
        String[] startTime = startTimeParts[0].split(":");
        if(startTimeParts[1].equals("PM")) 
            startHour = 12;
        else 
            startHour = 0;
        if(Integer.parseInt(startTime[0].trim()) != 12)
            startHour += Integer.parseInt(startTime[0].trim());
        startMinute = Integer.parseInt(startTime[1].trim());
        
        String[] endTimeParts = times[1].split(" ");
        String[] endTime = endTimeParts[0].split(":");
        if(endTimeParts[1].equals("PM"))
            endHour = 12;
        else
            endHour = 0;
        if(Integer.parseInt(endTime[0].trim()) != 12)
            endHour += Integer.parseInt(endTime[0].trim());
        endMinute = Integer.parseInt(endTime[1].trim());
    }

    public int getStartHour()
    {
        return startHour;
    }

    public void setStartHour(int startHour)
    {
        this.startHour = startHour;
    }

    public int getStartMinute()
    {
        return startMinute;
    }

    public void setStartMinute(int startMinute)
    {
        this.startMinute = startMinute;
    }

    public int getEndHour()
    {
        return endHour;
    }

    public void setEndHour(int endHour)
    {
        this.endHour = endHour;
    }

    public int getEndMinute()
    {
        return endMinute;
    }

    public void setEndMinute(int endMinute)
    {
        this.endMinute = endMinute;
    }
    
    public void setStartTime(int hour, int minute) {
        startHour = hour;
        startMinute = minute;
    }
    
    public void setEndTime(int hour, int minute) {
        endHour = hour;
        endMinute = minute;
    }
    
    public boolean contains(TimeBlock timeBlock) {
        boolean contains = false;
        
        if(((this.getStartHour() < timeBlock.getStartHour()) ||
            ((this.getStartHour() == timeBlock.getStartHour()) &&
             (this.getStartMinute() < timeBlock.getStartMinute())))
           &&
           ((this.getEndHour() > timeBlock.getEndHour()) ||
            ((this.getEndHour() == timeBlock.getEndHour()) &&
             (this.getEndMinute() > timeBlock.getEndMinute())))) {
            contains = true;
        }
        
        return contains;
    }
    
    public boolean overlaps(TimeBlock timeBlock) {
        boolean overlaps = false;
        
        if(timeBlock.contains(this)) {
            overlaps = true;
        }
        else if((((this.getStartHour() < timeBlock.getStartHour()) ||
                ((this.getStartHour() == timeBlock.getStartHour()) &&
                (this.getStartMinute() < timeBlock.getStartMinute())))
                &&
                ((this.getEndHour() > timeBlock.getStartHour()) ||
                ((this.getEndHour() == timeBlock.getStartHour()) &&
                (this.getEndMinute() > timeBlock.getStartMinute()))))
                ||
                (((this.getStartHour() < timeBlock.getEndHour()) ||
                ((this.getStartHour() == timeBlock.getEndHour()) &&
                (this.getStartMinute() < timeBlock.getEndMinute())))
                &&
                ((this.getEndHour() > timeBlock.getEndHour()) ||
                ((this.getEndHour() == timeBlock.getEndHour()) &&
                (this.getEndMinute() > timeBlock.getEndMinute()))))) {
            overlaps = true;
        }
        
        return overlaps;
    }
    
    public boolean equals(Object obj) {
        boolean equal = false;
        if(this == obj)
            equal = true;
        else if(obj instanceof TimeBlock) {
            TimeBlock block = (TimeBlock) obj;
            if((this.startHour == block.getStartHour()) && (this.startMinute == block.getStartMinute()) &&
                    (this.endHour== block.getEndHour()) && (this.endMinute == block.getEndMinute())) {
                equal = true;
            }
        }
        
        return equal;
    }
    
    public String toString() {
        DecimalFormat numberFormat = new DecimalFormat("00");
        StringBuilder formatted = new StringBuilder();
        if(startHour % 12 == 0)
            formatted.append(12);
        else
            formatted.append(numberFormat.format(startHour % 12));
        formatted.append(":" + numberFormat.format(startMinute));
        if(startHour >= 12)
            formatted.append(" PM");
        else
            formatted.append(" AM");
        formatted.append(" - ");
        if(endHour % 12 == 0)
            formatted.append(12);
        else
            formatted.append(numberFormat.format(endHour % 12));
        formatted.append(":" + numberFormat.format(endMinute));
        if(endHour >= 12)
            formatted.append(" PM");
        else
            formatted.append(" AM");
        
        return formatted.toString();
    }
} 

