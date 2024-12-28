package Basics;

public class Sum_arr {
    public static void main(String[] args) {

        int arr[] = {2, 43, 12, 121, 54, 23};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(sum + " + " + arr[i]);
            sum += arr[i];
        }

        System.out.println("Total Sum : " + sum);
    }
}
