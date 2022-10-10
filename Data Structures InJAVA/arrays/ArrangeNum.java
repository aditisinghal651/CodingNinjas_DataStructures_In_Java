package arrays;

import java.util.Scanner;

public class ArrangeNum {

    public static void ArrangeNumber(int arr[]){
        int val = 1;
        int n = arr.length;
        int size = (n - 1)/2;

        for(int i = 0; i <= size; i++){
            System.out.print(val + " ");
            val += 2;
        }

        if(n%2 == 0){
            val = n;
        }else{
            val = n - 1;
        }
        for(int j = size + 1; j < n; j++){
            System.out.print(val + " ");
            val -= 2;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        ArrangeNumber(arr);
    }
}
