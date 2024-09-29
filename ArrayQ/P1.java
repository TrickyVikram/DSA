package ArrayQ;

// Given an array of integers, write a function to find the largest element in the array.
// Input: [10, 20, 4, 45, 99]
// Output: 99

public class P1 {

public static void main(String[] args) {
    

    int arr[] = { 10, 20, 4, 45, 99 };
    int largest=arr[0];

    for(int i=0 ; i<arr.length; i++)
    {

        if (arr[i]>largest) {
            
            largest=arr[i];
        }

    }

System.out.println("largest element: "+largest);


}


   
    
}
