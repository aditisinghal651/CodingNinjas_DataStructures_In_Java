package com.codingninjas.arrays2;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int arr[], int x){
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end)/2;

        while(start <= end){
            if(arr[mid] == x){
                return mid;
            }else if(arr[mid] > x){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
            mid = (start + end)/2;
        }
        return -1;
    }

    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();

        int ans = binarySearch(arr, x);
        System.out.print(ans);
    }
}
