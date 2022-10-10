package com.codingninjas.linkedlist;

import java.util.Scanner;

public class LinkedListInput {
    //By introducing tail made the insertion from O(n^2) to O(n).

    public static Node<Integer> takeInput(){
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = null, tail = null;

        while(data != -1){
            Node<Integer> currentNode = new Node<Integer>(data);
            if(head == null){
                //make this node as head node
                head = currentNode;
                tail = currentNode;
            }else{
//                Node<Integer> tail = head;
//                while(tail.next != null){
//                    tail = tail.next;
//                }
                //now tail will refer to last node
                //connect current node after last node
                tail.next = currentNode;
                tail = currentNode;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static void main(String args[]){
        Node<Integer> head = takeInput();

    }
}
