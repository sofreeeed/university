package ru.mirea.lab4.tpart2.task7;

public class Stu extends Student{
    public Stu(String name){
        super(name);
    }



    public String toString(){
        return "Студент - "+getName();
    }
}
