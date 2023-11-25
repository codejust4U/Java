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
public class for_loop {
    public static void main(String args[])
    {
        int n,i;
        int sum=0;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number : ");
        n = ob.nextInt();
                
        for(i=0;i<=n;i++)
        {
            sum += i;
        }
        System.out.println("The sum of numbers till "+n+" is "+sum);
    }
}
