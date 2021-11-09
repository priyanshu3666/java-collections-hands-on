package com.javacollections.enummap;

import java.util.EnumMap;
import java.util.Map;

class AddingElementsToEnumMap {

    enum Color {
        RED, GREEN, BLUE, WHITE
    }
    public static void main(String[] args)
    {
        Map<Color, Integer> colors1 = new EnumMap<>(Color.class);

        colors1.put(Color.RED, 1);
        colors1.put(Color.GREEN, 2);

        System.out.println("EnumMap colors1: " + colors1);

        EnumMap<Color, Integer> colors2 = new EnumMap<>(Color.class);

        colors2.putAll(colors1);
        colors2.put(Color.BLUE, 3);

        System.out.println("EnumMap colors2: " + colors2);
    }
}

