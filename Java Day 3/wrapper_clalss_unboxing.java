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
public class wrapper_clalss_unboxing {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // unboxing
        Character ch = sc.next().charAt(0);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        
        arrayList.add(20);
        int num = arrayList.get(0);
        
        System.out.println(num);
    }
}
