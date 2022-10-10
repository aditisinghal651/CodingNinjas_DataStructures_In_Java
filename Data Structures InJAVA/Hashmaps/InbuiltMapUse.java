package Hashmaps;

import java.util.HashMap;
import java.util.Set;

public class InbuiltMapUse {
    public static void main(String args[]){
        HashMap<String, Integer> map = new HashMap<>();

        //insert
        map.put("Aditi", 03);
        map.put("Sarthak", 23);

        //size
        System.out.println(map.size());

        //Presence of Key
        if(map.containsKey("Aditi")){
            System.out.println("Aditi is Present.");
        }
        if(map.containsKey("Mayank")){
            System.out.println("Mayank is Present.");
        }

        //get Value
        int v = map.get("Sarthak");
        System.out.println(v);

        int v2 = 0;
        if(map.containsKey("Mayank")){
            v2 = map.get("Mayank");
        }
        System.out.println(v2);

        //remove
        //map.remove("Sarthak");
        if(map.containsKey("Sarthak")){
            System.out.println("Sarthak is Present.");
        }

        //iterate in Hashmap
        Set<String> keys = map.keySet();
        for(String s : keys){
            System.out.println(s);
        }
    }
}
