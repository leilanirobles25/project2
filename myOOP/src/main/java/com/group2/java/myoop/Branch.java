/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group2.java.myoop;

import java.util.ArrayList;

/**
 *
 * @author wende
 */
public class Branch {
    
    private int id;
    private String name;
    
    ArrayList <Employee> employeeList = new ArrayList <Employee> ();

    @Override
    public String toString() {
        return "Branch{" + "id=" + id + ", name=" + name + ", employeeList=" + employeeList + '}';
    }

    public Branch(int id, String name) {
        this.id = id;
        this.name = name;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    
    
    
}
