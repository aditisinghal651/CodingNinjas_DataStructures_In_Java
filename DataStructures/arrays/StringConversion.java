package com.codingninjas.arrays;

public class StringConversion {
    static int stringConversion(String s, int []a) {
        // Write your code here.
        String output="";
        String ans = "";
        for(int i = 0; i < a.length; i++){
            ans = Integer.toBinaryString(a[i]);
            output += ans;
        }
        System.out.println(output);
        if(s.equals(output)){
            return 1;
        }
        return 0;
    }

    public static void main(String args[]){
        String s = "111111111";
        int a[] = {7, 3, 1, 3, 1};
        System.out.println(stringConversion(s, a));
    }
}
