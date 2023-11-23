/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author panka
 */
import java.util.Scanner;
import java.util.ArrayList;
public class wrapper_class_autoboxing {
    public static void main(String args[]){
    /*
        1. Autoboxing
    The automatic conversion of primitive types to the object of their corresponding wrapper classes is known as autoboxing. For example – conversion of int to Integer, long to Long, double to Double, etc. 
        */
    Scanner sc = new Scanner(System.in);
    
    char ch = sc.next().charAt(0);
    // autoboxing primitive to character object
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    arrayList.add(52);
    System.out.println(arrayList.get(0));
    }
}
