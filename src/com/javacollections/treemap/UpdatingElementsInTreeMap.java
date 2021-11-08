package com.javacollections.treemap;

import java.util.Map;
import java.util.TreeMap;

public class UpdatingElementsInTreeMap {

    public static void main(String args[])
    {

        Map<Integer, String> treeMap = new TreeMap<>();

        // Inserting the Elements
        treeMap.put(3, "A");
        treeMap.put(2, "D");
        treeMap.put(1, "C");

        System.out.println("Initial Tree Map : "+treeMap);
        treeMap.put(2, "B");

        System.out.println("after updation :"+treeMap);
    }
}

