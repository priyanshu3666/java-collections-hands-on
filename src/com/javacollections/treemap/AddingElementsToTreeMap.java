package com.javacollections.treemap;

import java.util.Map;
import java.util.TreeMap;

public class AddingElementsToTreeMap {

    public static void main(String[] args)
    {
        Map<Integer, String> treeMap = new TreeMap<>();

        treeMap.put((Integer)3, "good");
        treeMap.put((Integer)2, "speaks");
        treeMap.put((Integer)1, "He");

        System.out.println(treeMap);
    }
}

