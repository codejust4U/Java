package com.mycompany.mavenproject1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class decision_making {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the age: ");
            int age = sc.nextInt();

            if (age >= 0 && age < 18) {
                System.out.println("You are a child");
            } else if (age >= 18 && age < 60) {
                System.out.println("You are an adult");
            } else if (age >= 60) {
                System.out.println("You are old");
            } else {
                System.out.println("Invalid age entered");
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid integer age.");
        } finally {
            sc.close(); // Close the scanner to prevent resource leaks
        }
    }
}
