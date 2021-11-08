package com.javacollections.enumset;

import java.util.EnumSet;

class AddElementsToEnumSet {

    enum Game { BADMINTON, HOCKEY, TENNIS }

    public static void main(String[] args)
    {

        // Creating an EnumSet using allOf()
        EnumSet<Game> games1 = EnumSet.allOf(Game.class);

        // Creating an EnumSet using noneOf()
        EnumSet<Game> games2 = EnumSet.noneOf(Game.class);

        // Using add method
        games2.add(Game.HOCKEY);

        System.out.println("EnumSet Using add(): " + games2);
        games2.addAll(games1);
        System.out.println("EnumSet Using addAll(): " + games2);
    }
}
