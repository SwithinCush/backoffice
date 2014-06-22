/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ts.es;

import java.io.Serializable;
import java.util.Vector;

/**
 * Class EmployeeAvailability
 *
 * @author daibheid
 */
public class EmployeeAvailability implements Serializable {
    private Vector<RequestedDayOff> requestedDaysOff = new Vector<RequestedDayOff>();
    private Vector<Day> weeklyAvailability = new Vector<Day>(7);
    
    public void EmployeeAvailability(Vector<Day> daysAvailable) {
        weeklyAvailability = daysAvailable;
    }
    
    public void addRequestedDayOff(RequestedDayOff day) {
        requestedDaysOff.add(day);
    }
    
    public void changeDayRequestedOff(RequestedDayOff oldDay, RequestedDayOff newDay) {
        if(requestedDaysOff.contains(oldDay)) {
            cancelRequestedDayOff(oldDay);
            addRequestedDayOff(newDay);
        }
    }
    
    public RequestedDayOff findDayByDate(int dayOfWeek, int dayOfMonth, int month, int year) {
        RequestedDayOff day = null;
        
        RequestedDayOff date = new RequestedDayOff(dayOfWeek, dayOfMonth, month, year);
        
        for(int i = 0; i < requestedDaysOff.size(); i++) {
            if(requestedDaysOff.elementAt(i).equals(date))
                day = requestedDaysOff.elementAt(i);
        }
        
        return day;
    }
    
    public void cancelRequestedDayOff(RequestedDayOff day) {
        if(requestedDaysOff.contains(day))
            requestedDaysOff.remove(day);
    }
    
    public void clearRequestedDaysOff() {
        requestedDaysOff.clear();
    }
    
    public boolean hasRequestedDays() {
        return (requestedDaysOff.size() != 0);
    }
    
    public int getNumberOfRequestedDaysOff() {
        return requestedDaysOff.size();
    }
    
    public Vector<RequestedDayOff> getRequestedDaysOff() {
        return requestedDaysOff;
    }
    
    public void addDailyAvailability(Day day) {
        weeklyAvailability.add(day);
    }
    
    public void removeDailyAvailability(int day) {
        weeklyAvailability.remove(day);
    }
    
    public void clearWeeklyAvailability() {
        weeklyAvailability.clear();
    }
    
    public void replaceDailyAvailability(int day, Day newDay) {
        weeklyAvailability.setElementAt(newDay, day);
    }
    
    public Vector<Day> getWeeklyAvailability() {
        return weeklyAvailability;
    }
    
    public Day getDailyAvailabilityFor(int day) {
        return weeklyAvailability.elementAt(day);
    }
    
    public boolean isAvailableForShift(Day day, Shift shift) {
        boolean available = false;
        
        Vector<TimeBlock> timesAvailable = getDailyAvailabilityFor(day.getDayOfWeek()).getTimeBlocks();
        
        int i = 0;
        while(i < timesAvailable.size() && available == false) {
            TimeBlock timeAvailable = timesAvailable.elementAt(i);
            
            if(timeAvailable.contains(shift))
                available = true;
            i++;
        }
        
        i = 0;
        while(i < requestedDaysOff.size() && available == true) {
            if(requestedDaysOff.elementAt(i).equals(day)) {
                Vector<TimeBlock> timesRequestedOff = requestedDaysOff.elementAt(i).getTimeBlocks();
                
                int j = 0;
                while(j < timesRequestedOff.size() && available == true) {
                    TimeBlock timeRequestedOff = timesRequestedOff.elementAt(j);
                    
                    if(timeRequestedOff.overlaps(shift))
                        available = false;
                    j++;
                }
            }
            i++;
        }
        
        return available;
    }
} 

