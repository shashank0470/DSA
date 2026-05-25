package StackAndQueue.Queuee;

public class CircularQueue {
    int rear;
    int front;
    int capacity;
    int size;
    int[] circularQueue;

    public CircularQueue(int capacity){
        circularQueue = new int[capacity];
        this.capacity = capacity;
        size = 0;
        rear = front = -1;
    }

    public boolean isEmpty(){
        return size ==0;
    }
    public int size(){
        return size;
    }

    public boolean isFull(){
        return size == capacity;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("The circularQueue is empty");
            return -1;
        }
        int peekk = circularQueue[front%capacity];
        return peekk;
    }

    public void EncircularQueue(int val){
        if(isFull()){
            System.out.println("The circularQueue is full, connot insert");
        }
        if(isEmpty()){
            front = rear = 0 ;
            circularQueue[rear%capacity] = val;
        }else{
            rear++;
            circularQueue[rear%capacity] = val;
        }
        size++;

    }
    public void DecircularQueue(){
        if(isEmpty()){
            System.out.println("The circularQueue is already empty");
        }
        int val = circularQueue[front%capacity];
        if(front == rear){
            front--;
            rear--;
        }else {
            front++;
        }
        size--;
    }
    
    public void PrintQueue(){
        if(isEmpty()){
            System.out.println("The circularQueue is empty");
        }
        for(int i =front; i<=rear; i++){
            System.out.println(circularQueue[i%capacity]);
            if(i!=rear){
                System.out.print(" -- ");
            }
        }
    }


    public static void main(String[] args){

    }
}
