package ru.mirea.lab6.task4;

public class Student  implements Nameable{
    private String name;
    private int age;
    private String Facultet;

    public Student(String name, int age, String Facultet){
        this.name = name;
        this.age=age;
        this.Facultet = Facultet;
    }

    public String getName(){
        return name;
    }
}
