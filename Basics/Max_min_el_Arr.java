package Basics;

public class Max_min_el_Arr {
    
public static void main(String[] args) {
    int arr[] = { 123123,21312,12312312,8,3,02,1213412,12};

    int n=arr.length;

    int max=arr[0];
    int min=arr[0];

    for(int i=0; i<n;++i){


        if (arr[i]>max) {
            
            max=arr[i];
        }
        if (arr[i]<min) {
            min=arr[i];
        }
    }
  
    System.out.println("Max:"+max);
    System.out.println("min:"+min);








}





}
