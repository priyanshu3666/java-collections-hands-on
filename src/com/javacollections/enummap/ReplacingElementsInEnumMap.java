package com.javacollections.enummap;

import java.util.EnumMap;
import java.util.Map;

public class ReplacingElementsInEnumMap {

    enum Color {
        RED, GREEN, BLUE, WHITE
    }
    public static void main(String[] args) {

        Map<Color, Integer> colors = new EnumMap<>(Color.class);
        colors.put(Color.RED, 1);
        colors.put(Color.GREEN, 2);
        colors.put(Color.BLUE, 3);
        colors.put(Color.WHITE, 4);
        System.out.println("EnumMap colors " + colors);

        colors.replace(Color.RED, 11);
        colors.replace(Color.GREEN, 2, 12);
        System.out.println("EnumMap using replace(): " + colors);

        colors.replaceAll((key, oldValue) -> oldValue + 3);
        System.out.println("EnumMap using replaceAll(): " + colors);
    }
}
