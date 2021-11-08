package com.javacollections.linkedhashmap;


import java.util.LinkedHashMap;
import java.util.Map;

class AddingElementsToLinkedHashMap {

    public static void main(String[] args)
    {
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(3, "Geeks");
        linkedHashMap.put(2, "For");
        linkedHashMap.put(1, "Geeks");

        System.out.println("Mappings of LinkedHashMap : " + linkedHashMap);
    }
}

