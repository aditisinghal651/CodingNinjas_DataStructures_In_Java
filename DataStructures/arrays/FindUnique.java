package arrays;

import java.util.Scanner;

import static arrays.ArraySum.takeInput;


public class FindUnique {

    public static int Unique(int arr[]){
        int unique = 0;
        for(int i = 0; i < arr.length; i++){
            boolean flag = false;
            for(int j = 0; j < arr.length; j++){
                if(i == j){
                    continue;
                }
                if(arr[i] == arr[j]){
                    flag = true;
                    break;
                }
            }
            if(flag != true){
                unique = arr[i];
            }
        }
        return unique;
    }

    public static void main(String args[]){

        int answer = Unique(takeInput());
        System.out.print(answer);
    }
}
