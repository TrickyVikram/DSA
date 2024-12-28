package Basics;

public class Sort_in_arr {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 6, 23, 24, 12, 9, 10, 8};

        // Insertion Sort
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i]; // The current element to be inserted
            int previous = i - 1; // Index of the element just before the current element

            
            while (previous >= 0 && arr[previous] > current) {
                arr[previous + 1] = arr[previous]; // Shift element to the right
                previous--; // Move left
            }

            // Insert the current element into its correct position
            arr[previous + 1] = current;
        }

        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
