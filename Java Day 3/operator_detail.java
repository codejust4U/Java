/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author panka
 */
public class operator_detail {
    
    public static void main(String args[]){
        // unary operators 
        int a = 30;
        int b = 20;
        
        // unary operations
        System.out.println("Post increament : "+(a++));
        System.out.println("Pre increament : "+(++a));
        
        System.out.println("Post Decreament : "+(b--));
        System.out.println("Pre Decreament : "+(--b));
        
        
        // assignment operator
        int f = 5;
        System.out.println("Assigning new value to previous already declared varibale : "+(f=6));
        
        // relational operator
        System.out.println("Relating whether a is equal to b or ?: "+(a==b));
        System.out.println("checking which of them is greater ");
        if(a>b){
            System.out.println("A greater than B : "+a);
            
        }else{
            System.out.println("B greater than A : "+b);
        }
        
        // logical operator
        boolean x = true;
        boolean y = false;
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);
        
    }
    
}
