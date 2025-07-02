package control_structures.Assignment;

import java.util.Scanner;

/*
Problem Statement:

Implement a program to calculate the product of three positive integer values. However, if one of the integers is 7, consider only the values to the right of 7 for calculation. If 7 is the last integer, then display -1.

Note: Only one of the three values can be 7.
 */
public class Product {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first integer");
        int num1 = sc.nextInt();
        System.out.println("Enter the second integer");
        int num2 = sc.nextInt();
        System.out.println("Enter the third integer");
        int num3 = sc.nextInt();

        // Check if one of the integers is 7, consider only the values to the right of 7 for calculation.
        if (num1 == 7){
            System.out.println("The product is " + num2 * num3);
        } else if (num2 == 7) {
            System.out.println("The product is " + num3);
        } else if (num3== 7){
            System.out.println("The product is -1");
        }else {
            System.out.println( "The product is " + num1 * num2 * num3);
        }
        sc.close();
    }
}
