package Hashing;

import java.util.HashMap;

public class MyHashMap {
    public static void main(String[] args) {
        int[] arr = {2,1,4,1,1,1,1,6,5,5,5};
        System.out.println(sol(arr));

    }
    public static int sol(int[] arr){
        int n = arr.length;
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            max = Math.max(map.get(arr[i]), max);
        }
////        or we can do this
//        for(Integer j: map.keySet()){
//            if(map.get(j)>max){
//                max = map.get(j);
//            }
//        }

        return max;
    }
}
