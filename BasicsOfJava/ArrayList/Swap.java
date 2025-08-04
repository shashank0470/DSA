package ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 no. for array: ");
        for(int i = 0; i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        //before swapping
        System.out.println(Arrays.toString(arr));

        swap(arr , 1,3);
        
        //after swapping
        System.out.println(Arrays.toString(arr));

    }
    //here we passed a arry,and two index. so that we can target a specific array in which we want to switch the values
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
