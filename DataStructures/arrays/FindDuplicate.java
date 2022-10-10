package arrays;

import static arrays.ArraySum.takeInput;


public class FindDuplicate {

    public static int Duplicate(int arr[]){
        int repeat = -1;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(i == j){
                    continue;
                }
                if(arr[i] == arr[j]){
                    repeat = arr[i];
                }
            }
        }
        return repeat;
    }

    public static void main(String args[]){
        int answer = Duplicate(takeInput());
        System.out.print(answer);
    }
}
