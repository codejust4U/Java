/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oops_java;

/**
 *
 * @author panka
 */
import java.util.Scanner;
public class Oops_java {
        //Scanner sc = new Scanner(System.in);
        static String emp_name;
        static float emp_salary;
        
        static void set(String n, float s)
        {
            
            emp_name = n;
            emp_salary = s;
        }
        
        static void display()
        {
            System.out.println("Employee name : "+emp_name);
            System.out.println("Employee salary : "+emp_salary);
        }
    public static void main(String[] args) {
        Oops_java.set("Pankaj",10000.0f);
        Oops_java.display();
        
    }
}

