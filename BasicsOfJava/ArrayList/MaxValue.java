package ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i= 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        // System.out.println(Arrays.toString(arr));

        Max(arr);
    }

    static void Max(int[] arr){
        //lets assume that the first index element has max value
        
        int max = arr[0];
        for(int j =0; j<arr.length;j++){
            if(max < arr[j]){
                max = arr[j];
            }
        }
        System.out.println("Max value of this array is: " + max);


    }
}
