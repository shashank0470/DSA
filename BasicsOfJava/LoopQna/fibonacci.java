package LoopQna;

public class fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int temp;
        for(int n=1; n<=5; n++){
            System.out.println(a + "");
            temp = a+b;
            a = b;
            b = temp;
            
        }
    }
}
