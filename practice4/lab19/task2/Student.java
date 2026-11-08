package ru.mirea.practice4.lab19.task2;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age){
        this.name= name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString(){
        return name + " " + age;
    }
}
