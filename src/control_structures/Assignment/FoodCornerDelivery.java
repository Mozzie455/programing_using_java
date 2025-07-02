package control_structures.Assignment;

import java.util.Scanner;

/*
Problem Statement:
Food Corner home delivers vegetarian and non-vegetarian meals to its customers based on the order.

A vegetarian combo costs $12 per plate and a non-vegetarian combo costs $15 per plate. Apart from the cost per plate of food, customers are also charged for home delivery based on the distance in kms from the restaurant to the delivery point.

Given the type of food, quantity (no. of plates) and the distance in kms from the restaurant to the delivery point, implement a program to calculate the final bill amount to be paid by a customer.

The below information must be used to check the validity of the data provided by the customer:

Type of food must be 'V' for vegetarian and 'N' for non-vegetarian.

Distance in kms must be greater than 0.

Quantity ordered should be minimum 1.

If any of the input is invalid, the bill amount should be displayed as -1.
 */
public class FoodCornerDelivery {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Input type of meal based on customer order
        System.out.println("Enter your meal order ('V' for vegetarian and 'N' for non-vegetarian): ");
        String foodType = input.next().toLowerCase();

        // Input the quantity of plates
        System.out.println("Enter the number of plate(s) to order:");
        int quantity = input.nextInt();

        //Input the distance between restaurant and destination
        System.out.println("Enter delivery distance in kms ");
        double distance = input.nextDouble();

        //Initialize the cost of plate based of meal type
        int costPerPlate = 0;
        if (foodType.equals("v")){
            costPerPlate = 12;
        } else if (foodType.equals("n")) {
            costPerPlate = 15;
        }else {
            System.out.println("-1");
        }

        // Total bill paid by customer
        int foodCost = quantity * costPerPlate;

        // Calculate the delivery charges
        double deliveryCharge;
        if (distance > 6){
            deliveryCharge = (distance - 6) * 2 + 3 ;
        } else if (distance > 3) {
            deliveryCharge = (distance - 3) * 1;
        }else {
            deliveryCharge = 0;
        }
        // Calculate total bill
        int totalBill = foodCost + (int) deliveryCharge;

        // Display the total bill
        System.out.println("Your total bill is: $" + totalBill);

    }
}
