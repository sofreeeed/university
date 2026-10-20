package ru.mirea.lab4.tpart2.task5;

public class Book {
    private String name;
    private String author;
    public Book(String name, String author){
        this.name=name;
        this.author=author;
    }

    public String toString(){
        return "название книги: "+this.name+", атвор: "+this.author;
    }
}
