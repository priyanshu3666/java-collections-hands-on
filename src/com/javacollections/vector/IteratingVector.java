package com.javacollections.vector;

import java.util.List;
import java.util.Vector;

public class IteratingVector {


    public static void main(String[] args)
    {
        // create an instance of vector
        List<String> vector = new Vector<>();

        // Add elements using add() method
        vector.add("Learning");
        vector.add("Awesome");
        vector.add(1, "is");

        // Using the Get method and the
        // for loop
        for (int i = 0; i < vector.size(); i++) {

            System.out.print(vector.get(i) + " ");
        }

        System.out.println();

        // Using the for each loop
        for (String str : vector)
            System.out.print(str + " ");
    }
}

