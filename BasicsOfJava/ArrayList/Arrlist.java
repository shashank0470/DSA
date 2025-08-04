package ArrayList;

import java.util.ArrayList;

public class Arrlist {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(1700);
        list.add(800);
        System.out.println(list);
        //this set method set the item at the specific index
        list.set(0, 23522);
        System.out.println(list);
    }
}
