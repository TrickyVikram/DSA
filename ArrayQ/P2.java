package ArrayQ;
// Given an array of integers, write a function to find the smallest element in the array.
// Input: [10, 20, 4, 45, 99]
// Output: 4
public class P2 {
    
    public static void main(String[] args) {
        

        int arr[]={10, 20, 4, 45, 99};

        int smallest=arr[0];

      for(int i=0; i<arr.length;i++){

        if (arr[i]<smallest) {
            smallest=arr[i];
            
        }
   
      }
      System.out.println("smallest element:" + smallest );

    }
}
