package ru.mirea.lab6.task3;

public class Main {
    public static void main(String[] args){
        Product pr = new Product("картошка", 30);
        System.out.println("Продукт "+pr.getName()+" и стоит "+pr.getPrice());
    }
}
