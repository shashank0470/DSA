package StackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeuee {
    public static void main(String[] args) {
    //using Stack using Dequeue
    Deque<Integer> stack = new ArrayDeque<>();
    stack.push(443);
    stack.push(34);
    stack.push(45);
    stack.push(90);
    stack.pop();
    stack.pop();
    stack.peek();




    //using Queue using Dequeue
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(22);
        queue.offer(56);
        queue.offer(43);
        queue.poll();
        queue.peek();
    }

}
