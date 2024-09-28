package Array;

import java.util.Arrays;

public class TwoDArrayOperations {
    
    // Insert a new element at a specific position in a 2D array
    public static int[][] insert(int[][] arr, int row, int col, int element) {
        // Check if the provided row and column are within the array bounds
        if (row < arr.length && col < arr[0].length) {
            arr[row][col] = element;
        } else {
            System.out.println("Invalid row or column position.");
        }
        return arr;
    }

    // Delete an element from a specific position (set to 0 as a placeholder for deletion)
    public static int[][] delete(int[][] arr, int row, int col) {
        // Check if the provided row and column are within the array bounds
        if (row < arr.length && col < arr[0].length) {
            arr[row][col] = 0; // Deleting element by setting it to 0
        } else {
            System.out.println("Invalid row or column position for deletion.");
        }
        return arr;
    }

    // Search for an element in a 2D array
    public static boolean search(int[][] arr, int element) {
        for (int[] row : arr) {
            for (int num : row) {
                if (num == element) {
                    return true; // Element found
                }
            }
        }
        return false; // Element not found
    }

    // Helper function to print the 2D array
    public static void print2DArray(int[][] arr) {
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        // Initialize a 2D array
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original 2D array:");
        print2DArray(arr);

        // Insert element at position (1, 1)
        arr = insert(arr, 1, 1, 99);
        System.out.println("\n2D array after insertion at (1, 1):");
        print2DArray(arr);

        // Delete element at position (2, 2)
        arr = delete(arr, 2, 2);
        System.out.println("\n2D array after deletion at (2, 2):");
        print2DArray(arr);

        // Search for an element in the 2D array
        int elementToSearch = 99;
        boolean isFound = search(arr, elementToSearch);
        if (isFound) {
            System.out.println("\nElement " + elementToSearch + " is found in the 2D array.");
        } else {
            System.out.println("\nElement " + elementToSearch + " is not found in the 2D array.");
        }
    }
}

