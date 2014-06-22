/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ts.es;

import java.io.Serializable;
import java.util.Vector;

/**
 * Class RequestedDayOff
 *
 * @author daibheid
 */
public class RequestedDayOff extends Day implements Serializable {

    private String reason;
    
    public RequestedDayOff(int dayOfWeek, int dayOfMonth, int month, int year) {
        super(dayOfWeek, dayOfMonth, month, year);
    }
    
    public RequestedDayOff(int dayOfWeek, int dayOfMonth, int month, int year, String reason) {
        super(dayOfWeek, dayOfMonth, month, year);
        setReason(reason);
    }
    
    public RequestedDayOff(String requestedDate, String reason) {
        super(requestedDate);
        setReason(reason);
    }
    
    public void setReason(String reason) {
        this.reason = reason;
    }
    
    public String getReason() {
        return reason;
    }
    
    public String getDate() {
        return super.toString();
    }
    
    public String toString() {
        Vector<TimeBlock> times = super.getTimeBlocks();
        
        String formatted = super.toString();
        
        if(times.size() != 0)
            formatted += " - " + times.elementAt(0).toString();
        if(reason != "")
            formatted += " - " + reason;
        
        return formatted;
    }
} 

