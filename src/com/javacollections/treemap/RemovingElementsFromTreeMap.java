package com.javacollections.treemap;

import java.util.Map;
import java.util.TreeMap;

public class RemovingElementsFromTreeMap {

    public static void main(String args[])
    {
        Map<Integer, String> treeMap = new TreeMap<Integer, String>();

        // Inserting the Elements
        treeMap.put(3, "A");
        treeMap.put(2, "B");
        treeMap.put(1, "C");
        treeMap.put(4, "D");

        System.out.println(treeMap);

        treeMap.remove(4);

        System.out.println(treeMap);
    }
}

