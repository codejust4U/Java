/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author panka
 */
public class custom_wrapper_class {

    public static void main(String[] args) {
        Maximum x = new Maximum();
        x.insert(3);
        x.insert(1);
        x.insert(45);
        x.insert(34);
        
        System.out.println("Maximum element : "+x.top());
        System.out.println("Number of elements inserted : "+x.elementNumber());
    }
}

class Maximum{
    private int maxi = 0;
    private int size = 0;
        
    public void insert(int x){
        this.size++;
        if(x<=this.maxi)
            return;
        this.maxi = x;
    } 
    public int top()
    {
        return this.maxi;
    }
    public int elementNumber()
    {
        return this.size;
    }
}