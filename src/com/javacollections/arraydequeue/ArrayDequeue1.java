package com.javacollections.arraydequeue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeue1 {

    public static void main(String[] args)
    {
        Deque<Integer> arrayDeque = new ArrayDeque<>(10);
        arrayDeque.add(10);
        arrayDeque.add(20);
        arrayDeque.add(30);
        arrayDeque.add(40);
        arrayDeque.add(50);

        // Iterating using for each loop
        for (Integer element : arrayDeque) {
            System.out.println("Element : " + element);
        }


        System.out.println("Using clear() ");
        arrayDeque.clear();
        System.out.println("Above elements are removed now");

        arrayDeque.addFirst(564);
        arrayDeque.addFirst(291);
        arrayDeque.addLast(24);
        arrayDeque.addLast(14);



        System.out.println("Elements of deque using Iterator :");

        for (Iterator itr = arrayDeque.iterator();
             itr.hasNext();) {
            System.out.println(itr.next());
        }

        System.out.println("Elements of deque in reverse order :");

        for (Iterator dItr = arrayDeque.descendingIterator();
             dItr.hasNext();) {
            System.out.println(dItr.next());
        }

        System.out.println("\nHead Element using element(): " + arrayDeque.element());

        System.out.println("Head Element using getFirst(): " + arrayDeque.getFirst());

        System.out.println("Last Element using getLast(): "+ arrayDeque.getLast());

        Object[] arr = arrayDeque.toArray();
        System.out.println("\nArray Size : " + arr.length);

        System.out.print("Array elements : ");

        for (int i = 0; i < arr.length; i++)
            System.out.print(" " + arr[i]);

        System.out.println("\nHead element : "+ arrayDeque.peek());

        System.out.println("Head element poll : "+ arrayDeque.poll());

        arrayDeque.push(265);
        arrayDeque.push(984);
        arrayDeque.push(2365);

        System.out.println("Head element remove : " + arrayDeque.remove());

        System.out.println("The final array is: " + arrayDeque);
    }
}

