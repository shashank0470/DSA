package Array.TwoD;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int[][] array = new int[4][4];

        Scanner sc = new Scanner(System.in);
        
        for(int row = 0; row< array.length; row++){
            for(int col = 0; col< array[row].length; col++){
                array[row][col] = sc.nextInt();
            }
        }

        for(int i = 0 ; i<array.length; i ++){
            System.out.println(Arrays.toString(array[i]));
        }
    }
}


// package Array.TwoD;

// import java.util.Arrays;
// import java.util.Scanner;

// public class Test {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Step 1: Ask user how many rows
//         System.out.print("Enter number of rows: ");
//         int rows = sc.nextInt();

//         // Step 2: Create 2D jagged array with 'rows' number of rows
//         int[][] array = new int[rows][];

//         // Step 3: For each row, ask user for number of columns, and take input
//         for (int i = 0; i < rows; i++) {
//             System.out.print("Enter number of columns in row " + i + ": ");
//             int cols = sc.nextInt();
//             array[i] = new int[cols];  // initialize that row with the user-defined size

//             System.out.println("Enter " + cols + " elements for row " + i + ":");
//             for (int j = 0; j < cols; j++) {
//                 array[i][j] = sc.nextInt();
//             }
//         }

//         // Step 4: Print the jagged array
//         System.out.println("\nYour Jagged Array:");
//         for (int i = 0; i < array.length; i++) {
//             System.out.println(Arrays.toString(array[i]));
//         }
//     }
// }
