package control_structures;

/**
 * Problem Statement:
 * The code given below checks whether a given number is even or odd. Execute the code by assigning different values to number variable.
*/

public class Tester {
    public static void main(String[] args) {
        int number = 5;
        if (number % 2 == 0) {
            // This block will get executed if the if-condition is true
            System.out.println(number + " is an even number");
        }else {
            // This block will get executed if the if-condition is false
            System.out.println(number + " is an odd number");
        }
    }
}
