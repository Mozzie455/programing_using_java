package control_structures.Assignment;

/**
 * Problem Statement:
 * Implement a program to display the below pattern.
 * ****
 * ***
 * **
 * *
 */
public class ReversePattern {
    public static void main(String[] args){
        int i, j;
        int rows = 10;

        // outer loop to handle rows
        for (i = rows; i >= 1; i--){

            // inner loops to handle columns
            for (j = 1; j <= i; j++){
                System.out.print("*");
            }
            // print new lines for each row
            System.out.println();
        }
    }
}
