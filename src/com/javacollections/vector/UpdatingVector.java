package com.javacollections.vector;


import java.util.List;
import java.util.Vector;

public class UpdatingVector {

    public static void main(String args[])
    {
        // Creating an empty Vector
        List<Integer> vector1 = new Vector<>();

        // Use add() method to add elements in the vector
        vector1.add(12);
        vector1.add(23);
        vector1.add(22);
        vector1.add(10);
        vector1.add(20);

        System.out.println("Vector: " + vector1);

        // Using set() method to replace 12 with 21
        System.out.println("The Object that is replaced is: " + vector1.set(0, 21));

        System.out.println("The Object that is replaced is: " + vector1.set(4, 50));
        
        System.out.println("The new Vector is:" + vector1);
    }
}

