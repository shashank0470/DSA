package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int val){
        while(!q1.isEmpty()){
            //offer means insertion or enqueue and poll means deletion or dequeue
            q2.offer(q1.poll());
        }
        q1.offer(val);

        while(!q2.isEmpty()){
            //offer means insertion or enqueue and poll means deletion or dequeue
            q1.offer(q2.poll());
        }
    }
    public int peek(){
        if(q1.isEmpty()){
            System.out.println("The stack is empty");
            return -1;
        }

        return q1.peek();
    }
    public int pop(){
        if(q1.isEmpty()){
            System.out.println("The stack is empty");
            return -1;
        }

        return q1.peek();
    }
    public static void main(String[] args) {
            StackUsingQueue s = new StackUsingQueue();
            s.push(23);
            s.push(34);

        System.out.println(s.peek());
    }

}
