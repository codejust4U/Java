/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author panka
 */
import java.util.Scanner;
public class string_class {
    public static void main(String[] args) {
        str_length();
        char_at_str();
    }
    static int str_length()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string for checking length");
        String in_string = sc.nextLine();
        int str_len = in_string.length();
        System.out.println("The length of string is "+str_len);
        return str_len;
    }
    static void char_at_str()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string for checking the index of character");
        String index_string = sc.nextLine();
        System.out.println("Enter the index");
        int index = sc.nextInt();
        System.out.println("The character at index "+index+" is "+index_string.charAt(index));
    }
}
