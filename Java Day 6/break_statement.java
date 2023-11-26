/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author panka
 */
import java.util.Scanner;

public class break_statement {

    public static void main(String[] args) {
        int i,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        System.out.println("Enter the stopping number if u want to stop :");
        int stop_n = sc.nextInt();
        
        for(i=0;i<=n;i++)
        {
          sum += i;
          if(i==stop_n){
            break;
          }
            
            
        }
        System.out.println("The sum of number is "+sum);
    }
}
