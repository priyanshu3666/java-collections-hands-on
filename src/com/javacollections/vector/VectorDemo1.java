package com.javacollections.vector;

import java.util.List;
import java.util.Vector;

public class VectorDemo1 {

    public static void main(String[] arg)
    {

        // create default vector
        List<String> vector = new Vector<>();


        vector.add("Shukla");
        vector.add("Priyanshu");

        // print the vector to the console
        System.out.println("Vector vector is " + vector);

        // create generic vector
        List<Integer> vector2 = new Vector<>();

        vector2.add(1);
        vector2.add(2);
        vector2.add(3);
        System.out.println("Vector vector2 is " + vector2);
    }
}

