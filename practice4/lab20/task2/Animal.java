package ru.mirea.practice4.lab20.task2;

public class Animal<V> {
    private V name;
    public Animal(V name){
        this.name = name;
    }
    public String toString(){
        return name + " "+ name.getClass();
    }

}
