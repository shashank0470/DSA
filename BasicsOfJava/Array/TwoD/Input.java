package Array.TwoD;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];

        //here we will take 2d array as input from the user

        for(int row = 0; row<arr.length; row++ ){
            for(int col = 0 ; col< arr[row].length; col++){
                arr[row][col] = sc.nextInt();
            }
        }

        // for(int row = 0; row<arr.length; row++ ){
        //     for(int col = 0 ; col< arr[row].length; col++){
        //         System.out.print(arr[row][col] + " ");
        //     }
        //     //this is to print the element in seperate lines
        //     System.out.println();

        // }

        //or we can can simply write

        // for(int row = 0; row<arr.length; row++ ){
        //     System.out.println(Arrays.toString(arr[row]));
        // }    
        
        //enhanced for loop for this:

        for(int[] array : arr){
            System.out.println(Arrays.toString(array));
    
        }
    }
}
