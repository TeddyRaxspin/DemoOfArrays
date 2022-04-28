package com.jkuat.dit;

import java.util.Scanner;

public class TwoDimensionsArray {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        //Declare an array and initialize it
        String itemName [] = {"Apples", "Mango", "Pear"};
        int itemCost [][] = {
                {100, 200, 300, 400, 500},
                {150, 250, 350, 450, 550},
                {50, 100, 150, 250, 300},
        };
        //Prompt user input
//        for (int i = 0; i < itemName.length; i++){
//            System.out.print("Enter the name of product " + (i+1));
//                itemName[i] = inputData.next();
//            for (int j = 0; j < itemCost.length; j++ ){
//                System.out.print("Enter the product cost");
//                    itemCost[i][j] = inputData.nextInt();
//            }
//
//        }

        int totalSum = 0;
            for (int i = 0; i < itemName.length; i++){
                System.out.print(itemName[i] + "\t");
                int sum = 0;
                double average = 0;
                for (int j = 0; j < itemCost.length; j++ ){
                    System.out.print(itemCost[i][j] + "\t");
                    sum += itemCost[i][j];
                    average = sum / (itemCost.length);
                }
                System.out.print("\t Total = " + sum);
                System.out.print("\tAverage = " + average);
                System.out.println();
            }
            //Overall sum
            for (int i = 0; i < itemName.length; i++){
                for (int j = 0; j < itemCost.length; j++ ){
                    totalSum += itemCost[i][j];
                }
            }
                System.out.print("Total Sum= " + totalSum);
                System.out.println();
            // Check the biggest item
            int highestItem = itemCost[0][0];
            int lowestItem = itemCost[0][0];
            for (int i = 0; i < itemName.length; i++){
                for (int j = 0; j < itemCost.length; j++ ){
                   if (itemCost[i][j] > highestItem){
                       highestItem = itemCost[i][j];
                   }
                   if (itemCost[i][j] < lowestItem){
                       lowestItem = itemCost[i][j];
                   }
                }
            }
                System.out.println("Highest Item = " + highestItem);
                System.out.println("Lowest Item = " + lowestItem);
    }
}
