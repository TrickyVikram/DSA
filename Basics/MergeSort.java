package Basics;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        System.out.println("Original Array:");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        printArray(arr);
    }

    // Merge Sort function
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Sort the left half
            mergeSort(arr, left, mid);

            // Sort the right half
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Merge function to combine two sorted parts
    public static void merge(int[] arr, int left, int mid, int right) {
        // Find sizes of two subarrays to merge
        int size1 = mid - left + 1;
        int size2 = right - mid;

        // Create temporary arrays
        int[] leftArray = new int[size1];
        int[] rightArray = new int[size2];

        // Copy data to temporary arrays
        for (int i = 0; i < size1; i++)
            leftArray[i] = arr[left + i];
        for (int i = 0; i < size2; i++)
            rightArray[i] = arr[mid + 1 + i];

        // Merge the arrays
        int i = 0, j = 0, k = left;

        while (i < size1 && j < size2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray, if any
        while (i < size1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray, if any
        while (j < size2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Utility function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
