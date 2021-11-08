package com.javacollections.enumset;


import java.util.EnumSet;


public class EnumSetExample {

    enum enum1 { CODE, LEARN, CONTRIBUTE, QUIZ, MCQ };

    public static void main(String[] args)
    {
        // Creating a set
        EnumSet<enum1> set1, set2, set3, set4;

        // Adding elements
        set1 = EnumSet.of(enum1.QUIZ, enum1.CONTRIBUTE,
                enum1.LEARN, enum1.CODE);
        set2 = EnumSet.complementOf(set1);
        set3 = EnumSet.allOf(enum1.class);
        set4 = EnumSet.range(enum1.CODE, enum1.CONTRIBUTE);
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Set 3: " + set3);
        System.out.println("Set 4: " + set4);
    }
}
