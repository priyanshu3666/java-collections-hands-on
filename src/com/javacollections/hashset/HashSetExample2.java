package com.javacollections.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample2 {
        public static void main(String[] args){
            List<String> list=new ArrayList<>();
            list.add("Ravi");
            list.add("Vijay");
            list.add("Ajay");

            Set<String> set=new HashSet<>(list);
            set.add("Gaurav");
            set.forEach(System.out::println);

        }
    }

