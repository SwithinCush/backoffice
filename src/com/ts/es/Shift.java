/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ts.es;

import java.io.Serializable;
import java.util.Vector;

/**
 * Class Shift
 *
 * @author daibheid
 */
public class Shift extends TimeBlock implements Serializable {
    Vector<Employee> scheduledEmployees;
    
    public Shift(TimeBlock time) {
        super(time);
        scheduledEmployees = new Vector<Employee>();
    }
    
    public Shift(TimeBlock time, Vector<Employee> employees) {
        super(time);
        scheduledEmployees = employees;
    }
    
    public Shift(String startEnd) {
        super(startEnd);
        scheduledEmployees = new Vector<Employee>();
    }
    
    public Shift(String startEnd, Vector<Employee> employees) {
        super(startEnd);
        scheduledEmployees = employees;
    }
    
    public String getEmployeeNames() {
        String formatted = "";
        for(int i = 0; i < scheduledEmployees.size(); i++)
            formatted += scheduledEmployees.elementAt(i).getName() + " ";
        
        return formatted;
    }
    
    public Vector<Employee> getEmployees() {
        return scheduledEmployees;
    }
    
    public int getNumberOfEmployees() {
        return scheduledEmployees.size();
    }
    
    public Employee getEmployeeAt(int index) {
        return scheduledEmployees.elementAt(index);
    }
    
    public void removeEmployee(Employee person) {
        for(int i = 0; i < scheduledEmployees.size(); i++)
            if(scheduledEmployees.elementAt(i).getName().equals(person.getName()))
                scheduledEmployees.removeElementAt(i);
    }
    
    public void addEmployee(Employee person) {
        scheduledEmployees.add(person);
    }
    
    public String toString() {
        StringBuilder formatted = new StringBuilder(super.toString() + "  ");
        for(int i = 0; i < scheduledEmployees.size(); i++) {
            if(i != 0)
                formatted.append(", ");
            formatted.append(scheduledEmployees.elementAt(i).getName());
        }
        return formatted.toString();
    }
    
    public String timeToString() {
        return super.toString();
    }
} 

