package Recursion;

import java.util.ArrayList;

public class ArrayRecursion {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3,4};
//        System.out.println(LinearIndex(arr,4,0));
        //This new ArrayList<>() means here we have to return a new array list with all the index which are being added in the array list. Basically the End and the Start point of the target element.
//        System.out.println(FindAllIndex(arr,4,0,new ArrayList<>()));
//        System.out.println(LS(arr,3,0));
        System.out.println(Rotated(arr,1));
    }
    //Rotated array using recursion
    static int Rotated(int[] arr,int index){
        if(index == arr.length-1){
            return -1;
        }
        if(arr[index]>arr[index+1] && arr[index]>arr[index-1]){
            return index;
        }
        return Rotated(arr,index+1);
    }



    //Same as below one where we have return the array list, but here we have to return list without passing it in the arugment in the function.
//    static int[] AS(int[] arr, int target, int index){
//        if(index == arr.length){
//            return new int[]{-1};
//        }
//        if(arr[index] == target){
//            intf
//        }
//    }

    //Linear search(bas practice kari this aata h bhai apun ko badiya se samja kyaaaa!!!!!!)
//    static int LS(int[] arr, int target, int index){
//        if(index == arr.length){
//            return -1;
//        }
//
//        if(arr[index] == target){
//            return index;
//        }
//        return LS(arr, target, index+1);
//    }


    //Return a ArrayList, with the range for a number starting and ending index
    static ArrayList<Integer> FindAllIndex(int[] arr, int target, int index, ArrayList<Integer> List){
        if(index == arr.length){
            return List;
        }
        if(arr[index] == target){
            List.add(index);
        }
        return FindAllIndex(arr, target, ++index, List);
    }


    //Linear search using recursion
    static boolean Linear(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || Linear(arr,target,++index);
    }

    static int LinearIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }else {
        return LinearIndex(arr,target,++index);
        }
    }

    //Sorted or Unsorted array
    static boolean sorted(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sorted(arr, index+1);
    }
}
