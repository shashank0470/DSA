import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your rollno: ");
        int rollno = obj.nextInt();
        String name = obj.nextLine();
        System.out.println("Your rollno is " + rollno);
        System.out.println("Your name is" + name);

    }

}