package com.codingninjas.queues;

public class QueueUsingArray {
    private int data[];
    private int front; // index of the element which is at the front of the queue
    private int rear; // index of the element which is at the rear of the queue
    private int size;

    //in this array of data the size is fixed
    public QueueUsingArray(){
        data = new int[5];
        front = -1;
        rear = -1;
    }

    //in this array of data the size is fixed
    public QueueUsingArray(int capacity){
        data = new int[capacity];
        front = -1;
        rear = -1;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public String enqueue(int elem){
        if(size == data.length){
            //return "queue full";
            doubleCapacity();
        }
        if(front == -1 && rear == -1){
            front++;
            rear++;
            size++;
        }
//        rear++;
//        //circular queue insert element
//        if(rear == data.length){
//            rear = 0;
//        }
        //OR
        rear = (rear+1) % data.length;

        data[rear] = elem;
        size++;

        return null;
    }

    private void doubleCapacity() {
        int temp[] = data;
        data = new int[2 * temp.length];

        //copy elements from temp to data
        //in FIFO manner
        int index = 0;
        for(int i = front; i < temp.length; i++){
            data[index++] = temp[i];
        }
        for(int i = 0; i < front - 1; i++){
            data[index++] = temp[i];
        }
        front = 0;
        rear = temp.length - 1;
    }

    public int front(){
        if(front == -1 || rear == -1){
            return -1;
        }
        return data[front];
    }

    public int dequeue(){
        if(front == -1 || rear == -1){
            return -1;
        }
        int temp = front;
        front += 1;
        //circular queue delete element
        if(front == data.length){
            front = 0;
        }
        size--;
        if(size == 0){
            front = -1;
            rear = -1;
        }
        return data[temp];
    }
}
