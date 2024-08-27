/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group2.java.myoop;

/**
 *
 * @author wende
 */
public class PartTime extends Employee {
    
    private int hours;
    private int rate;

    public PartTime(int hours, int rate, int id, String name) {
        super(id, name);
        this.hours = hours;
        this.rate = rate;
    }

    
    
    @Override
    public String toString() {
        return "PartTime{" + "hours=" + hours + ", rate=" + rate +  " " + super.toString() + '}';
    }
    
    

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
    
    
    

    
    
}
