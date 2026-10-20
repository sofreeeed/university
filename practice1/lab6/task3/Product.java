package ru.mirea.lab6.task3;

public class Product implements Priceable{
    private String name;
    private int price;

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public String getName() {
        return name;
    }
}
