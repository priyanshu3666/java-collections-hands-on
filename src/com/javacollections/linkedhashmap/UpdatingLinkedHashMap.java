package com.javacollections.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

class UpdatingLinkedHashMap {

    public static void main(String[] args)
    {
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(2, "Priyanshu");
        linkedHashMap.put(1, "Priyanshu");

        System.out.println("Initial map : " + linkedHashMap);

        // Update the value with key 2
        linkedHashMap.put(1, "Shukla");

        System.out.println("Updated Map : " + linkedHashMap);
    }
}

