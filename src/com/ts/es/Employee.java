/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ts.es;

import java.io.Serializable;

/**
 * Class Employee
 *
 * @author daibheid
 */
public class Employee implements Serializable {
    private String name;
    private String id;
    private String position;
    private String email;
    private int experienceLevel;
    private EmployeeAvailability availability;
    
    private int num = 1;
    
    public Employee(String name, String id, String position, String email, int experienceLevel) {
        setName(name);
        setId(id);
        setPosition(position);
        setEmail(email);
        setExperienceLevel(experienceLevel);
        
        availability = new EmployeeAvailability();
        availability.addDailyAvailability(new Day(Day.SUNDAY));
        availability.addDailyAvailability(new Day(Day.MONDAY));
        availability.addDailyAvailability(new Day(Day.TUESDAY));
        availability.addDailyAvailability(new Day(Day.WEDNESDAY));
        availability.addDailyAvailability(new Day(Day.THURSDAY));
        availability.addDailyAvailability(new Day(Day.FRIDAY));
        availability.addDailyAvailability(new Day(Day.SATURDAY));
    }
    
    public Employee(String employee) {
        String[] parts = employee.split("  ");
        setName(parts[0]);
        setId(parts[1]);
        setPosition(parts[2]);
        setEmail(parts[3]);
        setExperienceLevel(Integer.parseInt(parts[4]));
        
        availability = new EmployeeAvailability();
        availability.addDailyAvailability(new Day(Day.SUNDAY));
        availability.addDailyAvailability(new Day(Day.MONDAY));
        availability.addDailyAvailability(new Day(Day.TUESDAY));
        availability.addDailyAvailability(new Day(Day.WEDNESDAY));
        availability.addDailyAvailability(new Day(Day.THURSDAY));
        availability.addDailyAvailability(new Day(Day.FRIDAY));
        availability.addDailyAvailability(new Day(Day.SATURDAY));
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getPosition()
    {
        return position;
    }

    public void setPosition(String position)
    {
        this.position = position;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public int getExperienceLevel()
    {
        return experienceLevel;
    }

    public void setExperienceLevel(int experienceLevel)
    {
        this.experienceLevel = experienceLevel;
    }

    public EmployeeAvailability getAvailability()
    {
        return availability;
    }

    public String toString() {
        return name + "  " + id + "  " + position + "  " + email + "  " + experienceLevel;
    }
} 

