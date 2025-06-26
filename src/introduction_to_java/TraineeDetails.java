package introduction_to_java;

/*
Create a new Java project with "TraineeDetails.java" file 
and implement a Java code to display your name and 
designation in two separate lines.
 */
public class TraineeDetails {
    public static void main(String[] args){
        displayName();
        showDesignation();
    }

    private static void showDesignation() {
        System.out.println("My designation is Systems Engineer.");
    }

    private static void displayName() {
        System.out.println("My name is Joshua Mutiso");
    }
}
