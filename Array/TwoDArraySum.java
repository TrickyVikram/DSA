package Array;

// Write a program to find the sum of all elements in a 2D array.

public class TwoDArraySum {
    public static void main(String[] args) {
        // Initialize a 2D array
        int[][] numbers = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Variable to store the sum of all elements
        int sum = 0;

        // Loop through the 2D array
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j]; // Add each element to the sum
            }
        }

        // Print the total sum of the elements in the 2D array
        System.out.println("Sum of all elements in the 2D array: " + sum);
    }
}
