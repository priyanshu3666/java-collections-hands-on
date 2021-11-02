package com.javacollections.priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

    public static void main(String args[]){
        Queue<String> queue=new PriorityQueue<String>();
        queue.add("Amit");
        queue.add("Vijay");
        queue.add("Karan");
        queue.add("Jai");
        queue.add("Rahul");
        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());
        System.out.println("iterating the queue elements:");
        queue.forEach(System.out::println);
        queue.remove();
        queue.poll();
        System.out.println("after removing two elements:");
        queue.forEach(System.out::println);
    }
}