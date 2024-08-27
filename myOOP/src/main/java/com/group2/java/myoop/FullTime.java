/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group2.java.myoop;

/**
 *
 * @author wende
 */
public class FullTime extends Employee {
    
    private int salary;

    public FullTime(int salary, int id, String name) {
        super(id, name);
        this.salary = salary;
    }

    
    
    @Override
    public String toString() {
        return "FullTime{" + "salary=" + salary + "  " + super.toString() + '}';
    }
    
    
    
    

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    
    
    
    
}
