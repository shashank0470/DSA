package Array;

import java.util.Arrays;

public class ArrayInFunction {
    public static void main(String[] args) {
        int[] num = {23,14,4,56,76,33};
        System.out.println(Arrays.toString(num));


        //this will print the array with 45 at 2nd index
        array(num);
        System.out.println(Arrays.toString(num));
    }

    static void array(int[] num){
        num[2] = 45;
    }
}
