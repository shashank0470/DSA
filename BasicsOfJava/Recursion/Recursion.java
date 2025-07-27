package Recursion;

public class Recursion {
    public static void main(String[] args){

        String phrase = message();
        for(int i = 0; i<=5; i++){
            System.out.println(phrase);
        }
    }


    static String message(){
        return "Hello world";
    }
}
