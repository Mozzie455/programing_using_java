package operators;

/*
Problem Statement:

Implement a program to calculate the Simple Interest in using the formula given below and display the calculated Simple Interest.
*/

// Simple Interest = (principal * rate of interest * time)/100

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        int principal = sc.nextInt();
        System.out.println("Enter the percentage rate: ");
        int rate = sc.nextInt();
        System.out.println("Enter the number of years: ");
        int time = sc.nextInt();

        double simpleInterest = (double) (principal * rate * time) /100;
        System.out.println(simpleInterest);

        sc.close();
    }

}
