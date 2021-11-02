package com.javacollections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList2
{
    public static void main(String[] args){
        List<Integer> arrayList =new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        System.out.println("Traversing arrayList through List Iterator in reversal :");
        //Here, element iterates in reverse order
        ListIterator<Integer> list1= arrayList.listIterator(arrayList.size());
        while(list1.hasPrevious())
        {
            int str=list1.previous();
            System.out.println(str);
        }
        System.out.println("Traversing arrayList through for loop:");
        for(int i = 0; i< arrayList.size(); i++)
        {
            System.out.println(arrayList.get(i));
        }

        System.out.println("Traversing arrayList through forEach() method:");
        //The forEach() method is a new feature, introduced in Java 8.
        arrayList.forEach(a->{
            System.out.println(a);
        });

        System.out.println("Traversing arrayList through forEachRemaining() method:");
        Iterator<Integer> itr= arrayList.iterator();
        itr.forEachRemaining(a->
        {
            System.out.println(a);
        });

        arrayList.add(48);
        System.out.println(arrayList);
        arrayList.remove(Integer.valueOf(48));
        System.out.println(arrayList);
        arrayList.remove((Integer) 4);
        System.out.println(arrayList);


    }
} 
