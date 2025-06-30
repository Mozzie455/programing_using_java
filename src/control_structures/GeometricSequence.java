package control_structures;

import java.util.Scanner;

/**
 * Problem Statement:
 * Implement a program to display the geometric sequence as given below for a given value n, where n is the number of elements in the sequence.
 * 1, 2, 4, 8, 16, 32, 64, ......, 1024
 */
public class GeometricSequence {
    public static void main(String[] args){
        int firstTerm = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int number = input.nextInt();

        while(number != 0){
            System.out.print(firstTerm+",");
            firstTerm *= 2;
            number -= 1;
        }
        input.close();
    }
}
