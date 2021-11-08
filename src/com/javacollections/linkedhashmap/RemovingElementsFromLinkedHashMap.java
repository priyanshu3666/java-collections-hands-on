package com.javacollections.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemovingElementsFromLinkedHashMap {

    public static void main(String[] args)
    {
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        // Inserting the Elements
        // using put() method
        linkedHashMap.put(3, "From");
        linkedHashMap.put(2, "Shukla");
        linkedHashMap.put(1, "Priyanshu");
        linkedHashMap.put(4, "Rath");

        System.out.println("Initial Map : " + linkedHashMap);

        // Remove the mapping with Key 4
        linkedHashMap.remove(4);
        
        System.out.println("Updated Map : " + linkedHashMap);

        // Iterating through  LinkedHashMap
        for (Map.Entry<Integer, String> mapElement : linkedHashMap.entrySet()) {
            Integer key = mapElement.getKey();
            // Finding the value
            String value = mapElement.getValue();
            System.out.println(key + " : " + value);
        }
    }
}
