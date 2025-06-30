package type_conversion;

import java.util.Scanner;

/**
 * Problem Statement
 * Implement a program to find the area of a circle by using the formula given below and display the calculated area.
 * Area = pi*radius*radius
 * The value of pi is 3.14.
 */

public class Area {
    public static void main(String[] args){
        double pi = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of a circle: ");
        int radius = sc.nextInt();
        double area = pi * (double) radius * (double) radius;
        System.out.println("The area of a circle is: " + area);
        sc.close();
    }
}
