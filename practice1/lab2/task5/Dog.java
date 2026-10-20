package ru.mirea.lab2.task5;

public class Dog {
    private String name;
    private int age;
    private int chel;

    public Dog(String name, int age){
        this.name = name;
        this.age=age;
    }

    public void perevod(){
        chel=age*7;
        System.out.println("человеческий возраст собаки: "+chel);
    }

    public String toString(){
        return "имя: "+name+" возраст: "+age;
    }


}
