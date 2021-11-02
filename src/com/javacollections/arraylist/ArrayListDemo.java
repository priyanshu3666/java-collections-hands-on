package com.javacollections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Yansh");//Adding object in arraylist
        list.add("Priyanshu");
        list.add("Abhay");
        list.add("Nikhil");
        List<String> fruits =new ArrayList<>();//Creating arraylist
        fruits.add("Mango");//Adding object in arraylist
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        //Printing the arraylist object
        //accessing the element
        System.out.println("Returning element: "+ fruits.get(1));//it will return the 2nd element, because index starts from 0
        //changing the element
        fruits.set(1,"Dates");
        //Traversing list
        for(String fruit: fruits)
            System.out.println(fruit);
        //for sorting
        Collections.sort(fruits);
        System.out.println();
       

        System.out.println("size after adding elements :"+fruits.size());

        System.out.println("Content of fruits : "+fruits);
        //get()
        System.out.println(fruits.get(3));
        //set()
        System.out.println(fruits.set(3,"Banana"));
        //remove()
        fruits.remove("Papaya");
        fruits.remove(1);
        //removeall()
        list.removeAll(fruits);

        System.out.println(fruits.indexOf("Papaya"));
        System.out.println("size after alteration: "+fruits.size());

        System.out.println("content of fruits"+fruits);

        System.out.println(fruits.toString());
        // toArray
        System.out.println(fruits.toArray());

        String arr[] = new String[fruits.size()];
        arr = fruits.toArray(arr);

        for(String fruit: fruits){
            System.out.println(fruit);
        }

        Collections.sort(fruits);
        fruits.clear();
        System.out.println(fruits.isEmpty());

        fruits = (ArrayList<String>)list.clone();
        System.out.println(fruits);

        fruits.replaceAll(e -> e.toLowerCase());

        System.out.println(fruits);

    }
}