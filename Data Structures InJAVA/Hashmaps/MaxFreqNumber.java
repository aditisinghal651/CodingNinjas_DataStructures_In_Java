package Hashmaps;

import javax.jnlp.IntegrationService;
import java.util.HashMap;

public class MaxFreqNumber {

    private static int maxFreqNum(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }

        int maxCount = Integer.MIN_VALUE;
        int maxElem = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(map.get(arr[i]) > maxCount){
                maxCount = map.get(arr[i]);
                maxElem = arr[i];
            }
        }
        return maxElem;
    }

    public static void main(String args[]){
        int arr[] = {2, 12, 2, 11, 12, 2, 2, 2, 11, 12, 2, 6};
        int arr2[] = {1, 4, 5};

        int ans = maxFreqNum(arr);
        System.out.println(ans);

        int ans2 = maxFreqNum(arr2);
        System.out.println(ans2);
    }
}
