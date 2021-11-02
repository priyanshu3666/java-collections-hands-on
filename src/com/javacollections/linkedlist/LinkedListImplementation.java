package com.javacollections.linkedlist;
import java.util.LinkedList;

public class LinkedListImplementation {

            public static void main(String[] args){
            LinkedList<String> linkedList =new LinkedList<>();
            System.out.println("Initial list of elements: "+ linkedList);
            linkedList.add("Amit");
            linkedList.add("nikhil");
            linkedList.add("Yansh");
            System.out.println("After invoking add(E e) method: "+ linkedList);

            //Adding an element at the specific position

            linkedList.add(1, "Gaurav");
            System.out.println("After invoking add(int index, E element) method: "+ linkedList);

            LinkedList<String> ll2=new LinkedList<>();
            ll2.add("Ram");
            ll2.add("Arena");

            //Adding second list elements to the first list

            linkedList.addAll(ll2);
            System.out.println("After invoking addAll(Collection<? extends E> c) method: "+ linkedList);
            LinkedList<String> ll3=new LinkedList<>();
            ll3.add("shubham");
            ll3.add("Rahul");

            //Adding second list elements to the first list at specific position

            linkedList.addAll(1, ll3);
            System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+ linkedList);

            //Adding an element at the first position

            linkedList.addFirst("Suresh");
            System.out.println("After invoking addFirst(E e) method: "+ linkedList);

            //Adding an element at the last position

            linkedList.addLast("Harsh");
            System.out.println("After invoking addLast(E e) method: "+ linkedList);

            linkedList.remove("Vijay");
            System.out.println("After invoking remove(object) method: "+ linkedList);

            linkedList.remove(0);
            System.out.println("After invoking remove(index) method: "+ linkedList);

            linkedList.removeAll(ll2);
            System.out.println("After invoking removeAll() method: "+ linkedList);

            linkedList.removeFirst();
            System.out.println("After invoking removeFirst() method: "+ linkedList);

            linkedList.removeLast();
            System.out.println("After invoking removeFirst() method: "+ linkedList);

            linkedList.removeFirstOccurrence("Priyanshu");
            System.out.println("After invoking removeFirstOccurrence() method: "+ linkedList);

            linkedList.removeLastOccurrence("Harsh");
            System.out.println("After invoking removeLastOccurrence() method: "+ linkedList);

            linkedList.clear();
            System.out.println("After invoking clear() method: "+ linkedList);

        }
    }


