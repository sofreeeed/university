package ru.mirea.lab4.tpart2.task7;

public class Uch extends Student{
    private String name;
    public Uch(String name){
        super(name);
    }
    public String toString(){
        return "Школьник: "+getName();
    }
}
