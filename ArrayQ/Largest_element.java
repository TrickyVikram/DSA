package ArrayQ;

public class Largest_element {

    public static void main(String[] args) {

        int arr[] = { 18, 5, 12, 13234, 132342, 2 };

        int n = arr.length;
        int max = arr[0];

        for (int i = 0; i < n; ++i) {

            if (arr[i] < max) {
                max = arr[i];
                System.out.println("index: " + arr[i]);
            }

        }

        System.out.println("Largest Ele: "+max);

    }

}
