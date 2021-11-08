package com.javacollections.vector;

import java.util.List;
import java.util.Vector;

class RemovingElementsFromVector {

    public static void main(String[] arg)
    {

        List<String > v = new Vector();

        // Add elements using add() method
        v.add("A");
        v.add("B");
        v.add("Geeks");
        v.add("forGeeks");
        v.add("E");

        // removing first occurrence element at 1
        v.remove(1);

        // checking vector
        System.out.println("after removal: " + v);
    }
}

