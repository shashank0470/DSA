package LoopQna;

public class Counting {
    public static void main(String[] args) {
        int n = 7879;
        int temp = 0;
        int count_seven = 0;
        for(int i = 1 ; i < 5; i++){
            temp = n%10;//9
            if(temp == 7){
                count_seven++;
            }
            n = n/10;
        }
        System.err.println(count_seven);
        
    }
}
