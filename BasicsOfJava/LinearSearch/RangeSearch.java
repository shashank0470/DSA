package LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class RangeSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        System.out.println("Select your to search: " + Arrays.toString(arr));

        System.out.println("Enter the no. to search: ");
        int target = sc.nextInt();
        System.out.println("Enter the Start range: ");
        int Start = sc.nextInt();
        System.out.println("Enter the Last range: ");
        int Last = sc.nextInt();

        RangeS(arr, target, Start, Last);


    }
    
    static void RangeS(int[] arr, int target, int range1 , int range2){
        if(arr.length == 0){
            System.out.println("Array not found");
        }

        for(int i = range1 ; i< range2; i++){
            if(target == arr[i]){
                System.out.println(target);
            }
        }
    }

}
