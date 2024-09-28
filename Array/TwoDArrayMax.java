package Array;

 // Write a program to find the maximum element in a 2D array.
public class TwoDArrayMax {
    public static void main(String[] args) {
        // Initialize a 2D array
        int[][] numbers = {
            {3, 5, 9},
            {7, 2, 8},
            {4, 6, 1}
        };

        // Assume the first element is the maximum
        int max = numbers[0][0];

        // Loop through the 2D array to find the maximum element
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] > max) {
                    max = numbers[i][j]; // Update max if a larger element is found
                }
            }
        }

        // Print the maximum element in the 2D array
        System.out.println("Maximum element in the 2D array: " + max);
    }
}
