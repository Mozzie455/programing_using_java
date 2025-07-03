package object_oriented_programming;

public class SwiftFood {
    public static class Food {
        public String foodName;
        public String cuisine;
        public String foodType;
        public int quantityAvailable;
        public double unitPrice;

        public void displayFoodDetails(){
            System.out.println("Display food details : \n-------------------------");
            System.out.println("Food name: " + foodName);
            System.out.println("Cuisine: " + cuisine);
            System.out.println("Food type: " + foodType);
            System.out.println("Quantity: " + quantityAvailable);
            System.out.println("Price per unit: " + unitPrice);
            System.out.println();
        }

    }
    static class Tester{
        public static void main(String[] args) {
            // Object creation
            Food food = new Food();

            // Assigning values to the instance variables
            food.foodName = "Pilau";
            food.cuisine = "Kenyan";
            food.foodType = "main course";
            food.quantityAvailable = 2;
            food.unitPrice = 35.00;

            // Display food details
            food.displayFoodDetails();
        }
    }
}
