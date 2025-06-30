package control_structures.Assignment;

import java.util.Scanner;

/*
 * Problem Statement:
 * Quadratic equation is an equation with degree 2 in the form of ax2 +bx + c = 0 where a, b and c are the coefficients.
 * Implement a program to solve a quadratic equation.
 *
 * Find the discriminant value using the formula given below.
 * discriminant = b2 - 4ac

 * If the discriminant is 0, the values of both the roots will be same. Display the value of the root.
 *
 * If the discriminant is greater than 0, the roots will be unequal real roots. Display the values of both the roots.
 * <p>
 * If the discriminant is less than 0, there will be no real roots. Display the message "The equation has no real root"
 *
 * Use the formula given below to find the roots of a quadratic equation.
 *
 * x = (-b ± discriminant)/2a
 */
public class Quadratic {
public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    // value a, b and c
    System.out.println("Enter the value of coefficient a: ");
    double a = input.nextDouble();
    System.out.println("Enter the value of coefficient b: ");
    double b = input.nextDouble();
    System.out.println("Enter the value of coefficient c: ");
    double c = input.nextDouble();

    double root1, root2;

    // calculate the discriminant (b**2 - 4ac)
    double discriminant = b * b - 4 * a * c;

    //check if the discriminant is greater than 0
    if (discriminant > 0){
        //Display the values of both the roots.
        root1 = (-b + discriminant)/2 * a;
        root2 = (-b - discriminant)/2 * a;
        System.out.println("root1 = " + root1 + "and root2 = " + root2);

    //check if the discriminant is equal 0
    } else if (discriminant == 0) {
        root1 = root2 = -b /(2 * a);
        System.out.println("The root is " + root1);

    //check if  the discriminant is less than 0
    }else {
        System.out.println("The equation has no real root2");
    }
}
}
