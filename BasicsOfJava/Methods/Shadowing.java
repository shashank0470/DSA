package Methods;

public class Shadowing {

    public class test{
        int x = 10;
    }
    public static void main(String[] args) {
        //this x is shadowing the value of x in the above class, or we can say that this x is hiding the outer x.
        //this is knowns as shadowing
        int x = 20;
        System.out.println(x);
    }



}
