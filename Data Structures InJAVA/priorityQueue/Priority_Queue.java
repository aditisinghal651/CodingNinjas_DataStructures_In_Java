package com.codingninjas.priorityQueue;

import java.util.ArrayList;

public class Priority_Queue<T> {
    private ArrayList<Element<T>> heap;

    //constructor
    public Priority_Queue(){
        heap = new ArrayList<>();
    }

    public T getMin(){
        if(isEmpty()){
            return null;
        }
        return (T) heap.get(0);
    }

//    public T removeMin(){
//
//    }

    public int size(){
        return heap.size();
    }

    public boolean isEmpty(){
        return heap.size() == 0;
    }
}
