package control_structures;

/**
 * Problem Statement:
 * Execute the code given below and observe the output. Modify the code to get 5% discount for Regular customer and 10% for Premium customer. Also, try changing sequence of the cases, observe how it works if default is written before other cases.
 */
public class Tester2 {
    public static void main(String[] args) {
        double discount;
        String customerType = "Premium";
        switch (customerType) {
            case "Regular":
                discount = 5;

            case "Premium":
                discount = 10;

            default:
                discount = 0;
        }
        System.out.println("Customer has got discount of " + discount + "%");
    }
}
