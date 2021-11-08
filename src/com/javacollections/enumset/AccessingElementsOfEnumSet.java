package com.javacollections.enumset;

import java.util.EnumSet;
import java.util.Iterator;

class AccessingElementsOfEnumSet {

    enum Game { CRICKET, HOCKEY, TENNIS }

    public static void main(String[] args)
    {
        EnumSet<Game> games = EnumSet.allOf(Game.class);

        Iterator<Game> iterate = games.iterator();
        System.out.print("EnumSet: ");
        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
    }
}
