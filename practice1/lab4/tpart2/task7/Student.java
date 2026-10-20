package ru.mirea.lab4.tpart2.task7;

public class Student {
    private String name;
    public Student(String s ){
        this.name =s;
    }

    public String toString(){
        return getName();
    }

    public String getName() {
        return name;
    }
}
