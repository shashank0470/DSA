package LinearSearch;

import java.util.Scanner;

public class StringSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String StringArr = "Appleisafruit";
        char target = 'z';
        System.out.println(Stringsearch(StringArr, target));
    }

    static boolean Stringsearch(String arr, char target){
        if(arr.length() == 0){
            return false;
        }

        for(int i =0; i<arr.length(); i++){
            if(target == arr.charAt(i)){
                return true;
            }
        }
        return false;
    }



}
