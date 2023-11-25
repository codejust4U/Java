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
public class do_while_loop {
    public static void main(String args[])
    {
        int i=0,n,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        n = sc.nextInt();
        do{
            sum += i;
            i++;
        }while(i<=n);
        System.out.println("The sum of numbers till "+n+" is "+sum);
    }
}
