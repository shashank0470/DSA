package LoopQna;

import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args) {
        //here we are considering that a is largest no.
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter first number:"); 
        int a = obj.nextInt();
        
        System.out.print("Enter Second number:"); 
        int b = obj.nextInt();

        System.out.print("Enter third number:"); 
        int c = obj.nextInt();
        
        if(a>b && b>c){
            System.out.println("First number is greatest.");
        }else if(a<b && b>c){
            System.out.println("Second number is greatest.");
        }else{
            System.out.println("Thrid number is greatest.");

        }

    }
}
