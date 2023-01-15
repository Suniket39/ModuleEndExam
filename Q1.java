//Write a program that creates and initializes a "N" element integer array. Calculate and
//display the average of its values.

package com.q1.appmain;

import java.util.Scanner;

public class Q1 {
	public static void main(String args[]) {
        int count, sum = 0, i;
        int[] inputArray = new int[500];
  
        Scanner in = new Scanner(System.in);
        
        //Size of N numbers to add
        System.out.println("Enter number of elements");
        count = in.nextInt();
        System.out.println("Enter " + count + " elements");
        
        //Adding numbers to array
        for(i = 0; i < count; i++) {
            inputArray[i] = in.nextInt();
            sum = sum + inputArray[i];
        }
        
        
        System.out.println("Average is: " + (double)sum/count);
        in.close();
    }
}
