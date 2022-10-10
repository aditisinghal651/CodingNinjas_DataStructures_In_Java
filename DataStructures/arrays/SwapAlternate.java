package arrays;

import static arrays.ArraySum.takeInput;


public class SwapAlternate {

    public static void Swap(int arr[]){

        if(arr.length%2 == 0){
            for(int i = 0; i < arr.length; i++){
                int temp = arr[i];
                arr[i] = arr[++i];
                arr[i] = temp;
            }
        }else{
            for(int j = 0; j < arr.length - 1; j++){
                int temp = arr[j];
                arr[j] = arr[++j];
                arr[j] = temp;
            }
        }
    }

    public static void main(String args[]){
        Swap(takeInput());
    }
}
