package com.codingninjas;


public class Main {

    public static void main(String[] args) {
        int arr[] = {3, 1, 1, 1, 6, 6};

        int k = 0;
        for(int i = 0; i<arr.length; i++){
            int count = 0;
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    k = arr[i];
                    count++;
                }
            }
            System.out.println("Element "+k+ " is repeating " + count+ " times.");
        }

    }

}

