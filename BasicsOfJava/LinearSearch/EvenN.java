package LinearSearch;
//leetcode problem 1295
public class EvenN {
    public static void main(String[] args) {
        int[] arr = {11,22,32234,2232,43234,2221,43,3322233,4342};

        int result = Num(arr);
        System.out.println(result);
        

    }

    static int Num(int[] arr){
        int count = 0;
        for(int i =0; i< arr.length; i++){
            if(even(arr[i])){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int nums = digit(num);
        return nums % 2 == 0;
    }

    static int digit(int digit){
        int count = 0;
        while(digit>0){
            digit = digit/10;
            count++;
        }
        return count;
    }
}
