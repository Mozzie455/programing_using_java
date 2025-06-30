package control_structures;

import java.util.Scanner;

/**
 * Problem Statement:
 * Implement a program to calculate the factorial of a given number.
 */
public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a non-negative number: ");
        int num = sc.nextInt();

        if (num < 0){
            System.out.println("Factorial is not defined for negative numbers");
        }else{
            // Use long to handle larger factorials
            long factorial = 1;
            for (int i = 1; i <= num; i++){
                factorial *= i;
            }
            System.out.println("Factorial of " + num + " is: " + factorial );
        }
        sc.close();
    }
}
