package ru.mirea.lab6.task4;

public class Dog implements Nameable{
    private String name;
    private int age;
    private int weight;

    public Dog(String name, int age, int weight){
        this.name = name;
        this.age=age;
        this.weight = weight;
    }

    public String getName(){
        return name;
    }
}
