package com.codingninjas.arrays;

public class SortZeroOne {
    public static void sort(int arr[]){

        //sorting by scanning the array 2 times
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                count++;
            }
        }
        for(int j = 0; j < count; j++){
            arr[j] = 0;
            System.out.print(arr[j]);
        }
        for(int k = count; k < arr.length; k++){
            arr[k] = 1;
            System.out.print(arr[k]);
        }

    }

    public static void main(String args[]){
        int arr[] = {0, 1, 0, 1, 0, 0, 1, 0, 1};
        sort(arr);
    }
}
