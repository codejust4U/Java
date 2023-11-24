/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.*;

/**
 *
 * @author panka
 */
public class input_streamer {
    public static void main(String args[]) throws IOException
    {
        // bufferedreader object
        // input streamreader converts bytes
        // stream of character 
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        
        // String reading internally
        System.out.println("Enter the string : ");
        String str = bfn.readLine();
        
        // Integer reading internally
        System.out.println("Enter the integer : ");
        int it = Integer.parseInt(bfn.readLine());
        
        // printing string
        System.out.println("Entered string : "+str);
        
        // printing integer
        System.out.println("Entered integer : "+it);
        
    }
}
