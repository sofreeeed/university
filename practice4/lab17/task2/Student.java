package ru.mirea.practice4.lab17.task2;

import java.util.Locale;
import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    Scanner sc = new Scanner(System.in);
    public Student(){}

    public Student(String name, int age){
        this.name = name;
        this.age=age;
    }

    public void add(){
        int count=0;
        String s;
        while(count!=2){
            switch (count){
                case 0:
                    System.out.println("имя:");
                    s=sc.nextLine();
                    if(s.matches("\\w+")){
                        this.name =s.toUpperCase(Locale.ROOT).charAt(0)+s.substring(1);
                        count++;
                    }
                    break;
                case 1:
                    System.out.println("возраст:");
                    s = sc.nextLine();
                    if(s.matches("[1-9]]|[1-9][0-9]")){
                        this.age = Integer.parseInt(s);
                        count++;
                    }
                    break;
            }
        }
    }

    public String toString(){
        return "Студент "+name+" "+age+" лет";
    }
}
