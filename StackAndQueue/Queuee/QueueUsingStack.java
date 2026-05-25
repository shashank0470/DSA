package StackAndQueue.Queuee;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
//this is where peek and dequeue is compromised
public class QueueUsingStack {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    public void Enqueue(int val){
        s1.push(val);
    }
    public int Dequeue(){
        if(s1.isEmpty()){
            System.out.println("The stack is already empty");
            return -1;
        }
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int val = s2.pop();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }

        return val;
    }
    public int peekk(){
        if(s1.isEmpty()){
            System.out.println("The stack is already empty");
            return -1;
        }
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int val = s2.peek();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }

        return val;
    }

    public static void main(String[] args){
//    Queue<Integer> queue = new LinkedList<>();

        QueueUsingStack q = new QueueUsingStack();
        q.Enqueue(12);
        q.Enqueue(23);
        q.Enqueue(53);
        q.Enqueue(98);
        System.out.println("element at peek: " + q.peekk());
        q.Dequeue();
        System.out.println("element at peek: " + q.peekk());

    }
}
