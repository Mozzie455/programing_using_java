package type_conversion;

import java.util.Scanner;

/**
 * Problem Statement:
 * Implement a program to convert temperature from Fahrenheit to Celsius degree by using the formula given below and display the converted value.
 * C = ((F-32)/9)*5 where, C represents temperature in Celsius and F represents temperature in Fahrenheit.
 */

public class Converter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit: ");
        int temp = sc.nextInt();
        double celsius = (double) ((temp - 32)/9)*5;
        System.out.println("The temperature in celsius is: " + celsius );
        sc.close();
    }
}
