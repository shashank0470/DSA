package Methods;

public class Scope {
    public static void main(String[] args) {
        Fruit();
        //System.out.println(fruit); ❌ this will not work because it is outside the scope of this method
    }



    static void Fruit(){
        String fruit = "Apple is a fruit";
        System.out.println(fruit);
    }
}
