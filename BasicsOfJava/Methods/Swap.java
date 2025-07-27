package Methods;

public class Swap {
    public static void main(String[] args) {
        swap(2, 7);
    }

    static void swap(int a,int b){
        System.out.println("The value of a is: " + a + " and value of b is: " + b);
        a = b;
        b = a;
        System.out.println("The swap value of a is: " + a + " and swap value of b is: " + b);
    }
}
