package Basics;

// Find the second largest element in an array


public class Sec_larg_ele {
    public static void main(String[] args) {

        int arr[] = {22, 52, 87, 123, 55, 2};

        // Assume 
        int max = arr[0];
        int sec_max = arr[0];

        //  max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        //  second Max
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max && (sec_max == max || arr[i] > sec_max)) {
                sec_max = arr[i];
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Sec_Max: " + sec_max);
    }
}
