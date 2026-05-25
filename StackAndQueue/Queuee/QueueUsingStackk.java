package StackAndQueue.Queuee;

import java.util.Stack;
//here enqueue is compromised
public class QueueUsingStackk {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void Enqueue(int val){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(val);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    public int Dequeue(){
        if(s1.isEmpty()){
            System.out.println("The stack is already empty");
            return -1;
        }

        int val = s1.pop();

        return val;
    }
    public int peekk(){
        if(s1.isEmpty()){
            System.out.println("The stack is already empty");
            return -1;
        }
        int val = s1.peek();
        return val;
    }

    public static void main(String[] args) {

        QueueUsingStackk q = new QueueUsingStackk();
        q.Enqueue(12);
        q.Enqueue(23);
        q.Enqueue(53);
        q.Enqueue(98);
        System.out.println("element at peek: " + q.peekk());
        q.Dequeue();
        System.out.println("element at peek: " + q.peekk());
    }
}
