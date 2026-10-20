package ru.mirea.lab7.task7;

public class Book implements Printable{
    private String name;
    private String author;
    public Book(String name, String author){
        this.author = author;
        this.name = name;
    }
    public void print(){
        System.out.println("книга автора "+author+" с названием "+name);
    }

    public static void printBook(Printable[] x){
        for(Printable i:x){
            if(i instanceof Book w) {
                w.print();
            }
        }
    }
}
