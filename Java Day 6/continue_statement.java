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
public class continue_statement {
    public static void main(String args[])
    {
        int i,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Enter the skipping number : ");
        int continue_n = sc.nextInt();
        
        for(i=0;i<=n;i++)
        {
            
            if(i==continue_n)
            {
                continue;
            }
            sum += i;
            
        }
        System.out.println("the sum of numbers is "+sum);
    }
}
