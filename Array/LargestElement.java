package Array;

// Write a program to find the largest element in an array.

public class LargestElement {
    public static void main(String[] args) {
     
        int[] numbers = {3, 7, 2, 9, 4};

        // Assume the first element is the largest
        int largest = numbers[0];
        int smallest = numbers[0];

        // Loop through the array to find the largest element
        for (int num : numbers) {
            if (num > largest) {
                largest = num;
            }
        }
        // Loop through the array to find the smallest element
        for (int num : numbers) {
            if (num < smallest) {
                smallest = num;
            }
        }

        System.out.println("Largest element in the array: " + largest);
        System.out.println("Largest element in the array: " + smallest);
    }
}
