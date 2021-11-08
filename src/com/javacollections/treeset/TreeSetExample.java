package com.javacollections.treeset;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample
{
    public static void main(String[] args)
    {
        NavigableSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(61);
        treeSet.add(87);
        treeSet.add(39);

        Iterator<Integer> iterator = treeSet.iterator();
        System.out.print("Tree set data: ");

        // note that 87 being the largest element, appears in the last.
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
        System.out.println();

        // to check if tree set is empty or not.
        if (treeSet.isEmpty())
            System.out.print("Tree Set is empty.");
        else
            System.out.println("Tree Set size: " + treeSet.size());

        // To get the smallest element from the set
        System.out.println("First data: " + treeSet.first());

        // To get the largest value from set
        System.out.println("Last data: " + treeSet.last());

        // remove 61 from set.
        if (treeSet.remove(61))
            System.out.println("Data is removed from tree set");
        else
            System.out.println("Data doesn't exist!");

        System.out.print("Now the tree set contain: ");
        iterator = treeSet.iterator();

        // Displaying the Tree set data
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");

        System.out.println();
        System.out.println("Now the size of tree set: " +
                treeSet.size());

        // Remove all
        treeSet.clear();
        System.out.print("Tree Set is empty.");
    }
}

