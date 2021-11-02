package com.javacollections.linkedlist;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample2 {
    public static void main(String args[]){

        List<String> al=new LinkedList<>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        al.get(2);

        System.out.println(al);

        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}



