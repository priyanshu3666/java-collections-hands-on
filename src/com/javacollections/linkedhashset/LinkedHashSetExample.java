package com.javacollections.linkedhashset;

import java.util.*;
class Book {
    int id;
    String name;
    String author;
    String publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<Book> hs=new LinkedHashSet<>();
        //Creating Books
        Book b1=new Book(101,"Light House","Priyanshu","RD",2);
        Book b2=new Book(102,"Data Communications & Networking","Nikhil","Mc Graw Hill",7);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",1);
        //Adding Books to hash table
        hs.add(b1);
        hs.add(b2);
        hs.add(b3);
        //Traversing hash table
        for(Book b:hs){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}  