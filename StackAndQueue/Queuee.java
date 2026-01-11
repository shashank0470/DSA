package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Queuee {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(33);
        queue.add(88);
        queue.add(90);

        queue.remove();

        System.out.println(queue);
    }
}
