package DataStructures.arrayList;

import java.util.ArrayList;

public class RemoveDuplicates {

    public static ArrayList<Integer> RemoveConsecutiveDuplicate(int arr[]){
        ArrayList<Integer> Result = new ArrayList<>();
        Result.add(arr[0]);
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i-1]){
                Result.add(arr[i]);
            }
        }
        return Result;
    }

    public static void main(String args[]){
        int arr[] = {10, 10, 20, 20, 30, 30, 30, 40, 10};
        ArrayList<Integer> result = RemoveConsecutiveDuplicate(arr);
        for(int i : result){
            System.out.println(i);
        }
    }
}
