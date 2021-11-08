package com.javacollections.hashmap;


import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String [] args)
    {
        // Creating HashMap and
        // adding elements
        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "Shyam");
        hashMap.put(2, "Ram");
        hashMap.put(3, "Java");

        // Finding the value for a key
        System.out.println("Value for 1 is " + hashMap.get(1));

        // Traversing through the HashMap
        for (Map.Entry<Integer, String> e : hashMap.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
    }
}