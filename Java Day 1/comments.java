/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author panka
 */
public class comments {
    public static void main(String args[])
    {
        // single line comment
        System.out.println("This is a single line comment.");
        
        /* 
        multiline 
        comment
        */
        System.out.println("This is a multiline comment.");
        
        String text1 = "pk";
        String text2 = "PK";
        if(text1 == text2){
            System.out.println("Values in both text1 and text2 not same, so it means its not case sensitive");
        }
        else{
            System.out.println("Values in both text1 and text2 are not same, so it means its case sensitive");
        }
    }
}
