package StackAndQueue.Queuee;

import java.util.Arrays;

//here we are making a queue using array
public class  MyQueue {
    int rear;
    int front;
    int size;
    int capacity;
    int[] queue;
    public MyQueue(int capacity){
        queue = new int[capacity];
        this.capacity = capacity;
        size = 0;
        rear = front = -1;
    }

    public boolean Empty(){
        if(front == -1 || rear == -1){
            return true;
        }else{
            return false;
        }
    }
    public boolean isFull(){
        if(rear == capacity-1){
            return true;
        }else{
            return false;
        }
    }
    public int Size(){
        return size;
    }
    //we can take String, boolean ,char anything to make queue
    public int peek(){
        if(Empty()){
            System.out.println("The queue is Empty");
            return -1;
        }
        return queue[front];
    }
    public void Enqueue(int val){
        if(isFull()){
            System.out.println("The queue is full, cannot insert");
            return;
        }
        if(Empty()){
            front = 0;
            rear = 0;
            queue[rear] = val;
        }else {
            rear++;
            queue[rear] = val;
        }
        size++;
    }
    public void Dequeue(){
        if(Empty()){
            System.out.println("The queue is empty");
        }
        int val = queue[front];
        if(front == rear){
            front--;
            rear--;
        }else{
            front++;
        }
        size--;
    }
    public void PrintQueue(){
        if(Empty()){
            System.out.println("The queue is Empty");
        }
        for(int i=front; i<=rear; i++){
            System.out.print(queue[i]);
            if(i!=rear){
                System.out.print(" -- ");
            }
        }
//        System.out.println();
    }

    public static void main(String[] args){
        MyQueue queue1 = new MyQueue(5);
        queue1.Enqueue(4);
        queue1.Enqueue(5);
//        queue1.Enqueue(7);
//        queue1.Enqueue(22);
//        queue1.Enqueue(90);
          queue1.Dequeue();
//        queue1.Dequeue();
        queue1.Enqueue(66);
        queue1.PrintQueue();
    }
}
