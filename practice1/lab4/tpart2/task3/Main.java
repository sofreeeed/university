package ru.mirea.lab4.tpart2.task3;

public class Main {
    public static void main(String[] args){
        Person p1 = new Person();
        Person p2 = new Person("Ivan Ivanov", 35);

        p1.move();
        p1.talk();
        p2.move();
        p2.talk();
    }
}
