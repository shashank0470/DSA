package LoopQna;

public class Reverse {
    public static void main(String[] args) {
        int n = 12345;
        int count = 0;
        for(int i = 1; i<6; i ++){
            int temp = n % 10;
            count = (count*10) + temp;
            n = n /10;
        }  
        System.out.println("Your reversed value is " + count);
    }
}
