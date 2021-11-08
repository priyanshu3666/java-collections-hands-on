package com.javacollections.arraydequeue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeue2 {


    // Main driver method
    public static void main(String[] args)
    {
        Deque<String> arrayDeque = new ArrayDeque<>();

        // add() method to insert
        arrayDeque.add("a");
        arrayDeque.addFirst("is");
        arrayDeque.addLast("very");

        // offer() method to insert
        arrayDeque.offer("beautiful");
        arrayDeque.offerFirst("Java");
        arrayDeque.offerLast("language");

        // Printing Elements of ArrayDeque to the console
        System.out.println("ArrayDeque : " + arrayDeque);
    }
}

