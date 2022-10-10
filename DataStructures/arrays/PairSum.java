package com.codingninjas.arrays;

public class PairSum {

    public static int pairSum(int arr[], int x){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = i+1; j < arr.length; j++){
                sum = arr[i]+arr[j];
                if(sum == x){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String args[]){
        int arr[] = {1, 3, 6, 2, 5, 4, 3, 2, 4};
        int ans = pairSum(arr, 7);
        System.out.print(ans);
    }
}
