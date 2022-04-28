package com.jkuat.dit;

import java.util.Scanner;

public class OneDimensionArray {

    public static void main(String[] args) {
        //Scanner to capture input
        Scanner in = new Scanner(System.in);

        //Declare and initialize the array

        int numbers [] =  new int[10];

        //Declare and initialize their sum and average to zero
        int sum =0;
        double average = 0;
        //Declare i used for looping
        int i;

            //Prompt for input
            for(i = 0; i < numbers.length; i++){
                System.out.println("Enter the numbers " + (i+1));
                numbers[i] = in.nextInt();
            }
            //Print out the array and calculate sum
            System.out.println("The numbers are");
                for(i =0; i< numbers.length; i++){
                    System.out.print(numbers[i] + "\t");
                        sum += numbers[i];
                }
                System.out.println();
                System.out.println("Sum = " + sum);

            //Calculate average and print
            average = sum / numbers.length;
            System.out.print("Average = " + average);
            System.out.println();

            // Check which numbers are greater than average
            System.out.print("Numbers that are above average = ");
            for (i =0; i < numbers.length; i++){
                if (numbers[i] >= average){
                    System.out.print(numbers[i] + "\t");
                }
            }
    }
}
