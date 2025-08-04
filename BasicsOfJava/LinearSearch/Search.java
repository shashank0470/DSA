package LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,12,13,14,15,16,343};
        System.out.println("Enter The No you want to serach from the array " + Arrays.toString(arr));
        int target = sc.nextInt();
        int result = Linear(arr, target);
        System.out.println("You no. is at index: " + result);
    }

    static int Linear(int[] arr, int target){
        if(arr.length == 0){
            return 0;
        }

        for(int i =0; i< arr.length; i++){
            int n = arr[i];
            if(n == target){
                return n;
            }
        }

        return -1; 
    }

}
