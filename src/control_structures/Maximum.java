package control_structures;

import java.util.Scanner;

/**
 * Problem Statement:
 * Implement a program to find and display the maximum number out of the given three numbers.
 */
public class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter num3: ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the maximum number.");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the maximum number.");
        } else {
            System.out.println(num3 + " is the maximum number.");
        }
        sc.close();
    }
}

