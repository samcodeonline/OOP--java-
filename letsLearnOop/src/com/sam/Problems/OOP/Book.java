package com.sam.Problems.OOP;

import java.util.ArrayList;

public class Book {

    String title;
    String author;
    String ISBN;

    public Book() {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }





    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        ArrayList <String> Book = new ArrayList<>(3);

        Book.add("The secret");
        Book.add("Steve Jobs");

        book1.setAuthor("hero");
        book1.setTitle("alchemist");
        book1.setISBN("AFSDAF2332");

        System.out.println("This book is written by " + book1.getAuthor() + " and the title of the book  is " + book1.getTitle() + " and the ISBN no of the book is " + book1.getISBN());
    }
}
