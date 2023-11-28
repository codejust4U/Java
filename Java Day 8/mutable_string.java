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
public class mutable_string {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String name = sc.nextLine();
        name.concat(" sir");
        System.out.println("string isn't immutable so the entered string is "+name);
        
    }
}
