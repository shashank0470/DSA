package Array;

import java.util.Arrays;
import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int[] arr = new int[5];

    for(int i = 0 ; i < 5; i++){
        arr[i] = s.nextInt();
    }   
    System.out.println(Arrays.toString(arr));
}
    

}
