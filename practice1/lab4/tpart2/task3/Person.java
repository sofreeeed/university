package ru.mirea.lab4.tpart2.task3;

public class Person {
    private String fullname;
    private int age;

    public Person(){}

    public Person(String fullname, int age){
        this.fullname=fullname;
        this.age=age;
    }

    public void move(){
        System.out.println("двигается человек с именем "+this.fullname+", возраст которого "+this.age);
    }

    public void talk(){
        System.out.println("двигается человек с именем "+this.fullname+", возраст которого "+this.age);
    }
}
