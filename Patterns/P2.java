package Patterns;

public class P2 {

    public static void main(String[] args) {

        int n = 4;
        int m = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {

                if (i == 1 || j == 1 || j==m || n==i ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();

        }

    }

}


// public class HollowRectangle {
//     public static void main(String[] args) {
//         int rows = 4;  // Number of rows
//         int cols = 5; // Number of columns

//         for (int i = 0; i < rows; i++) { // Loop through rows
//             for (int j = 0; j < cols; j++) { // Loop through columns
//                 // Print '*' for borders and ' ' for inside
//                 if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println(); // Move to the next line
//         }
//     }
// }
