/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author panka
 */
import java.util.Scanner;
public class return_keyword {

    public static void main(String[] args) {
        // return is a reserved keyword i.e, we can’t use it as an identifier. It is used to exit from a method, with or without a value
        circle();
    }
    static double circle()
    {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double area = 3.14*radius*radius;
        System.out.println("area is "+area);
        return area;
    }
}
