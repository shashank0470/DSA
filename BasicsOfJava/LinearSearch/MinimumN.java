package LinearSearch;

import java.util.Arrays;

public class MinimumN {
    public static void main(String[] args) {
        int[] arr= {54,66,12,665,2233,6,88,};
        System.out.println("Search for minimun no. in: "+ Arrays.toString(arr));
        Minimum(arr);
    }

    static void Minimum(int[] arr){
        
        int temp = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(temp > arr[i]){
                temp = arr[i];
            }
        }
        System.out.println(temp);
    }
}
