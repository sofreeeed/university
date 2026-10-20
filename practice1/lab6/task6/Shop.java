package ru.mirea.lab6.task6;

public class Shop implements  Printable{
    private String name;
    private int price;

    public Shop(String name, int price ){
        this.name = name;
        this.price  = price;
    }

    public void print(){
        System.out.println("Название журнала "+ this.name+" его цена "+price+" рублей");
    }
}
