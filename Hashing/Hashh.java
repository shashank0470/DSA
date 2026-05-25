package Hashing;

import java.util.HashMap;
import java.util.Map;

public class Hashh {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"Shashank");
        map.put(2,"Shushant");
        map.put(3,"Hanur");
        System.out.println(map);
        System.out.println(map.get(3));
        //this will give use null, so if we do not want to handle the null then we can use containsKey()
        System.out.println(map.get(5));

        //to avoid the null, it gives us true of false according to the key present in the map or not
        System.out.println(map.containsKey(5));

        // we do not want to return boolean or null value and want the user to know is their key present or not with a custom message then we can use
        System.out.println(map.getOrDefault(4, "Your key is not present how many times i have to tell you"));

        //if we want to replace any value
        map.replace(2,"Taomata");
        System.out.println(map);


        //if we want to iterate over the map we use for each loop for map.

        for(Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.println("Key -->" + entry.getKey());
            System.out.println("Value -->" + entry.getValue());
        }

        //we have one more way to iterate, by using keyset()
        for(Integer Key: map.keySet()){
            System.out.println("key -->" + Key);
            System.out.println("Value -->" + map.get(Key));
        }
    }
}
