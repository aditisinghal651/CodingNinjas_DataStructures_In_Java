package com.codingninjas.arrays;

import java.util.Scanner;

public class ArrangeNumber2 {

    public static void ArrangeNum(int arr[]){
        int val = 1;
        int s = 0;
        int e = arr.length;

        while(s <= e){
            if(s == e){
                arr[s] = val;
                return;
            }else{
                arr[s] = val;
                val++;
                arr[e] = val;
                val++;
                s++;
                e--;
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        ArrangeNum(arr);
    }
}
