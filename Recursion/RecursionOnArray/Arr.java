package Recursion.RecursionOnArray;

import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4,5};
//        printArrayWithRecursion(arr, 0);
//        System.out.println(elementPresentOrNot(arr, 0, 11));
//        System.out.println(elementPresentOrNott(arr,0, 11));
//        System.out.println(lastOccurrance(arr,0, 4, 0));
        System.out.println();
    }
    static void printArrayWithRecursion(int[] arr,int index){
        if( index == arr.length ){
            return;
        }
        //this is to print in same order
        System.out.print(arr[index] + " ");
        printArrayWithRecursion(arr, index+1);

        //this is to print in reverse order, or say right to left
        printArrayWithRecursion(arr, index+1);
        System.out.print(arr[index] + " ");
    }

    static boolean elementPresentOrNot(int[] arr, int index, int target){
        if(index == arr.length) return false;
        if(arr[index] == target) return true;

        return elementPresentOrNot(arr, index+1, target);
    }

    //this is returning the first occorring of the element
    static int elementPresentOrNott(int[] arr, int index, int target){
        if(index == arr.length) return -1;

        if(arr[index] == target){
            return index;
        }

        return elementPresentOrNott(arr, index+1, target);
    }

    //this is returning the last occurrace
    static int lastOccurrance(int[] arr, int index, int target,int s ){
        if(index == arr.length) return -1;

        int res = lastOccurrance(arr, index+1, target, s);
        if(res == -1) {
            if(arr[index] == target) return index;
        }
        return res;
    }

}
