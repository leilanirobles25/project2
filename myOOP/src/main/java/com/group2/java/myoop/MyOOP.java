/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.group2.java.myoop;

/**
 *
 * @author wende
 */
public class MyOOP {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        Employee e1 = new Employee(1,"Kevin");
        
        Employee ft1 = new FullTime(2000,2,"Amy");
        
        Employee pt1 = new PartTime(30,15, 3, "Mike");
        
        
        System.out.println(ft1);
        System.out.println(pt1);
        
        
        
    }
}
