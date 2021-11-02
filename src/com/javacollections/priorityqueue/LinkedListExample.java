package com.javacollections.priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

class Book implements Comparable<Book> {




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


    @Override
    public int compareTo(Book b) {
        return Integer.compare(id, b.id);
    }

}
public class LinkedListExample {
    public static void main(String[] args) {
        Queue<Book> queue=new PriorityQueue<>();
        //Creating Books
        Book b1=new Book(121,"Light House","Nikhil","RD",8);
        Book b2=new Book(233,"Black Perl","Aryan","Ram",6);
        Book b3=new Book(101,"3 Idiots","Abhay","Yansh",4);
        //Adding Books to the queue
        queue.add(b1);
        queue.add(b2);
        queue.add(b3);
        System.out.println("Traversing the queue elements:");
        //Traversing queue elements
        for(Book b:queue){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
        queue.remove();
        System.out.println("After removing one book record:");
        for(Book b:queue){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}
