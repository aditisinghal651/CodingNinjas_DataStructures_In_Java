package arrays;

import java.util.Scanner;

public class ArraySum {

    //Function to calculate sum of array elements
    public static int sum(int arr[]){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }

    //Function to take input
    public static int[] takeInput(){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int arr[] = new int[0];

        for(int i = 1; i <= t; i++){
            int n = sc.nextInt();
            arr = new int[n];

            for(int j = 0; j < n; j++){
                arr[j] = sc.nextInt();
            }
        }
        return arr;
    }

    //Main function
    public static void main(String args[]){
//        int arr[] = {9, 8, 9};
        int answer = sum(takeInput());
        System.out.println(answer);

    }
}
