package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class KsumSubarrayPromlems {
    public static void main(String[] args) {
        int[] arr = {2,8,2,6,-6,3,2};
        System.out.println(LongestKsubArray(arr, 5));
    }
    public static boolean checkKsumSubarray(int[] arr, int k){
        HashSet<Integer> mySet = new HashSet<>();
        mySet.add(0);
        int sum = 0 ;

        for(int i = 0 ; i<arr.length; i++){
            sum= sum + arr[i];
            if(mySet.contains(sum-k)){
                return true;
            }else{
                mySet.add(sum);
            }
        }
        return false;
    }

    public static ArrayList<Integer> checkKSumSubarray(int[] arr, int k){
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0;
        for(int i = 0 ; i<arr.length ; i++){
            sum = sum+ arr[i];
            if(map.containsKey(sum-k)){
                int startIndex = map.get(sum-k)+1;
                list.set(0, startIndex);
                list.add(i);
                break;
            }
            map.put(sum,i);
        }
        return new ArrayList<>(-1);
    }

    public static int LongestKsubArray(int[] arr, int k){
        int maxLen = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0 ;
        for(int i=0; i<arr.length-1; i++){
            sum = sum + arr[i];
            if(map.containsKey(sum-k)){
                int len = i - map.get(sum-k);
                maxLen = Math.max(maxLen, len);
            }
            //we are adding this because we want the longest k sub array, if we wanted the shortest then we does not need this checker.
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        return maxLen;
    }
}
