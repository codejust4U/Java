/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.array_in_java;

/**
 *
 * @author panka
 */
import java.util.Scanner;
public class Array_in_java {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int[] arr;
    int size;

    System.out.println("Enter the size of array: ");
    size = sc.nextInt();
    arr = new int[size];

    System.out.println("Enter the elements of the array: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println("The array is: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println(); // To move to the next line after printing all elements
    }
}
