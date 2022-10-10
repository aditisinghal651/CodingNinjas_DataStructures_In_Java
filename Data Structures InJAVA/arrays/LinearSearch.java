package arrays;

import static arrays.ArraySum.takeInput;


public class LinearSearch {

    //Function for linear search
    public static int linearSearch(int[] arr, int x){

        for(int i = 0; i < arr.length; i++){
            if(x == arr[i]){
                return i;
            }
        }
        return -1;
    }

    //Main function
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int answer = linearSearch(takeInput(), 4);
        System.out.print(answer);
    }
}
