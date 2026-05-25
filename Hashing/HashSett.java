package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class HashSett {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(33);
        set.add(34);
        set.add(54);
        set.add(97);
        set.add(11);
        System.out.println(set);
        System.out.println(set.contains(31));
        set.remove(11);
        System.out.println(set);

        //how we iterate in hashSet,

        //Using For each loop
        for(Integer i: set){
            System.out.println(i);
        }
        System.out.println();
        //Using Set Iterator
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //Analogy:
        //HashSet = a bag of balls
        //You want to pick balls one by one → you need a hand (iterator)
        //set.iterator() = gives you the hand
        //hasNext() / next() = the actions your hand can do
        //You cannot just call next() on the bag itself — the bag doesn’t know how to iterate. You need the iterator object.
    }
}
