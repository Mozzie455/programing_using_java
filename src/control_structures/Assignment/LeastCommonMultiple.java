package control_structures.Assignment;

import java.util.Scanner;

/**
 * Problem Statement:
 * Implement a program to find and display the least common multiple (LCM) of two whole numbers.
 * Least Common Multiple (LCM) of two numbers, num1 and num2 is the smallest positive number that is divisible by both num1 and num2.
 */
public class LeastCommonMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        int lcm = 0, i, max;

        // finding the largest number
        max = (num1 > num2) ? num1 : num2;

        // lcm will be least >= max(num1, num2) or  num1 * num2
        for (i = max; i <= num1 * num2; i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                lcm = i;
                break;
            }
        }
        System.out.println("The LCM: " + lcm);
    }

}
