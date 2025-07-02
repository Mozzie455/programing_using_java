package control_structures.Assignment;

import java.util.Scanner;

/**
 * Problem Statement:
 * Implement a program to display the sum of two given numbers if the numbers are same. If the numbers are not same, display the double of the sum.
 */
public class Sum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();

        if (num1 == num2){
            System.out.println(num1 + num2);
        }else{
            System.out.println((num1 + num2) * 2);
        }
        input.close();
    }
}
