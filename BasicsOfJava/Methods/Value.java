//here we will understand that java only uses pass by value
package Methods;

import java.util.Arrays;

public class Value {
    public static void main(String[] args) {
        int a = 37;
        value(a);
        System.out.println(a);

        int[] arr = {12, 13, 14,15,16,17};
        arrayV(arr);
        System.out.println(Arrays.toString(arr));
    }

    //this is for string, sting is immutable like it is final in nature(cannot be changed once created)
    static void value(int a){
    a = 100;
    }


    //this is for array, 
    static void arrayV(int[] arr){
        arr[0]= 99;
    }

};


    
