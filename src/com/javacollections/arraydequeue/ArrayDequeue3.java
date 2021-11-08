package com.javacollections.arraydequeue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeue3 {
    public static void main(String[] args) {
        
        Deque<String> arrayDeque = new ArrayDeque<>();

        arrayDeque.add("One");

        arrayDeque.addFirst("Two");

        arrayDeque.addLast("Three");

        System.out.println("ArrayDeque : " + arrayDeque);

        System.out.println(arrayDeque.pop());

        System.out.println(arrayDeque.poll());

        System.out.println(arrayDeque.pollFirst());

        System.out.println(arrayDeque.pollLast());
    }
}
