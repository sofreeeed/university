package ru.mirea.lab6.task6;

public class Book implements Printable{
    private String name;
    private int price;

    public Book(String name, int price ){
        this.name = name;
        this.price  = price;
    }

    public void print(){
        System.out.println("Название книги "+ this.name+" его цена "+price+" рублей");
    }
}
