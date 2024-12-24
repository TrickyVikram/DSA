package Basics;

import java.util.Arrays;

public class R_array {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        int n=arr.length;
        int  Rarr[]=new int[n]; 

        for(int i = 0;   i<n; ++i){

            Rarr[i]=arr[n-1-i];
            System.out.println(n-1-i);

        }

        System.out.println(Arrays.toString(Rarr));
      
    }
}
