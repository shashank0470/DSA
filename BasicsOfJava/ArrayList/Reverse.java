package ArrayList;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i= 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        reverse(arr);
    }

    static void reverse(int[] arr){
        for(int j = arr.length -1; j>=0; j--){
            System.out.print(arr[j]+ " ");
        }
    }
}
