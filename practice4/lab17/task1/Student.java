package ru.mirea.practice4.lab17.task1;

import java.util.Locale;
import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    Scanner sc = new Scanner(System.in);

    public Student(){}

    public void add(){
        System.out.println("Введите имя");
        String s;
        s = sc.nextLine();
        if(s.matches("\\w+")){
            this.name = (s.toUpperCase(Locale.ROOT).charAt(0)+s.substring(1));
        }
        System.out.println("Введите возраст");
        s = sc.nextLine();
        if(s.matches("[0-9]|[1-9][0-9]")){
            this.age = Integer.parseInt(s);
        }
    }

    public String toString(){
        return "Студент " + name+" "+age+" лет";
    }
}
