package com.javacollections.enummap;

import java.util.EnumMap;
import java.util.Map;

public class RemovingElementsFromEnumMap {

    enum Color {
        RED, GREEN, BLUE, WHITE
    }
    public static void main(String[] args) {

        Map<Color, Integer> colors = new EnumMap<>(Color.class);
        colors.put(Color.RED, 1);
        colors.put(Color.GREEN, 2);
        colors.put(Color.BLUE, 3);
        colors.put(Color.WHITE, 4);
        System.out.println("EnumMap colors : " + colors);
        
        int value = colors.remove(Color.WHITE);
        System.out.println("Removed Value: " + value);

        boolean result = colors.remove(Color.RED, 1);
        System.out.println("Is the entry {RED=1} removed? " + result);
        
        System.out.println("Updated EnumMap: " + colors);
    }
}

