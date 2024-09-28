package Array;

import java.util.Arrays;
// array in  insert, delete, and search operations:
public class ArrayOperations {
    // Insert element at the end of the array
    public static int[] insert(int[] arr, int element) {
        int[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[arr.length] = element; // Insert new element at the end
        return newArr;
    }

    // Delete element from the array (first occurrence)
    public static int[] delete(int[] arr, int element) {
        int index = -1;
        
        // Find the index of the element to be deleted
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                index = i;
                break;
            }
        }
        
        // If element not found, return the original array
        if (index == -1) {
            System.out.println("Element not found for deletion.");
            return arr;
        }

        // Create a new array to hold the result after deletion
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[j++] = arr[i];
            }
        }

        return newArr;
    }

    // Search for an element in the array
    public static boolean search(int[] arr, int element) {
        for (int num : arr) {
            if (num == element) {
                return true; // Element found
            }
        }
        return false; // Element not found
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        
        // Insert an element
        System.out.println("Array before insertion: " + Arrays.toString(arr));
        arr = insert(arr, 60);
        System.out.println("Array after insertion of 60: " + Arrays.toString(arr));

        // Delete an element
        arr = delete(arr, 30);
        System.out.println("Array after deletion of 30: " + Arrays.toString(arr));

        // Search for an element  and add user input
        int elementToSearch = 40;
        boolean isFound = search(arr, elementToSearch);
        if (isFound) {
            System.out.println(elementToSearch + " is found in the array.");
        } else {
            System.out.println(elementToSearch + " is not found in the array.");
        }
    }
}
