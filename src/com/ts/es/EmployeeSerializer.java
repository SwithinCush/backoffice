/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ts.es;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

/**
 * Class EmployeeSerializer
 *
 * @author daibheid
 */
public class EmployeeSerializer {
    private static String fileName = "employees.dat";
    
    private static String status = "Employees Loaded.";
    
    public static void saveEmployees(Vector<Employee> employees) {
        try {
            File file = new File(fileName);
            if(!file.exists())
                file.createNewFile();
        }
        catch (IOException e) {
            
        }
        
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            
            for(int i = 0; i < employees.size(); i++)
                out.writeObject(employees.elementAt(i));
            
            out.close();
            fileOut.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static Vector<Employee> loadEmployees() {
        Vector<Employee> employees = new Vector<Employee>();
        
        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            
            while (fileIn.available() != 0) {
                Employee employee = (Employee)in.readObject();
                
                if(employee != null)
                    employees.add(employee);
            }
            
            in.close();
            fileIn.close();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (FileNotFoundException e) {
            status = fileName + " not found. Adding some sample employees.";
            
            employees.add(new Employee("David Jordan", "0001", "Owner", "david@uptownpostalannex.com", 10));
            employees.add(new Employee("Kristin Demaree", "0002", "Manager", "kristin@uptownpostalannex.com", 8));
            employees.add(new Employee("Robert Cummings", "0003", "Lead Clerk", "robb@uptownpostalannex.com", 6));
            employees.add(new Employee("Nate Flemming", "0004", "Clerk", "nate@uptownpostalannex.com", 4));
            employees.add(new Employee("Lindy Porter", "0005", "Clerk", "lindy@uptownpostalannex.com", 2));
            employees.add(new Employee("Ann Jordan", "0006", "Bookkeeper", "ann@uptownpostalannex.com", 6));
            saveEmployees(employees);
        }
        catch (InvalidClassException e) {
            status = "The employee format has changed. Reverting to sample employees.";
            
            employees = new Vector<Employee>();
            employees.add(new Employee("David Jordan", "0001", "Owner", "david@uptownpostalannex.com", 10));
            employees.add(new Employee("Kristin Demaree", "0002", "Manager", "kristin@uptownpostalannex.com", 8));
            employees.add(new Employee("Robert Cummings", "0003", "Lead Clerk", "robb@uptownpostalannex.com", 6));
            employees.add(new Employee("Nate Flemming", "0004", "Clerk", "nate@uptownpostalannex.com", 4));
            employees.add(new Employee("Lindy Porter", "0005", "Clerk", "lindy@uptownpostalannex.com", 2));
            employees.add(new Employee("Ann Jordan", "0006", "Bookkeeper", "ann@uptownpostalannex.com", 6));
            saveEmployees(employees);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        
        return employees;
    }
    
    public static String getStatus() {
        return status;
    }
} 

