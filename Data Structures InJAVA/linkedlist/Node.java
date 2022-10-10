package com.codingninjas.linkedlist;

public class Node<T> {

    public T data;
    public Node<T> next;
    public Node(T data){
        this.data = data;
        next = null;// this statement not required cuz this is default.
    }
}
