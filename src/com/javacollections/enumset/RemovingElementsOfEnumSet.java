package com.javacollections.enumset;

import java.util.EnumSet;

class RemovingElementsOfEnumSet {

    enum Game { CRICKET, HOCKEY, TENNIS }

    public static void main(String[] args)
    {
        EnumSet<Game> games = EnumSet.allOf(Game.class);
        System.out.println("EnumSet: " + games);

        // Using remove()
        boolean value1 = games.remove(Game.CRICKET);

        System.out.println("Is CRICKET removed? " + value1);

        // Using removeAll()
        boolean value2 = games.removeAll(games);

        System.out.println("Are all elements removed? "+ value2);
    }
}
