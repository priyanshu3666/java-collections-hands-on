package com.javacollections.priorityblockingqueue;

import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueDemo {
 public static void main(String[] args)
    {
        PriorityBlockingQueue<Integer> priorityBlockingQueue = new PriorityBlockingQueue<>();

        // add numbers
        priorityBlockingQueue.add(1);
        priorityBlockingQueue.add(2);
        priorityBlockingQueue.add(3);
        priorityBlockingQueue.add(4);
        priorityBlockingQueue.add(5);

       
        System.out.println("PriorityBlockingQueue:" + priorityBlockingQueue);
    }
}

