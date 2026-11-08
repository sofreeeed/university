package ru.mirea.practice4.lab17.task3;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    Scanner sc = new Scanner(System.in);
    public Student(){}

    public Student(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void add(){
        String s;
        int count=0;

        while(count!=2){
            switch (count){
                case 0:
                    System.out.println("name:");
                    s =sc.nextLine();
                    if(s.matches("\\w+")){
                        this.name = s;
                        count++;
                    }
                    break;
                case 2:
                    System.out.println("age");
                    s = sc.nextLine();
                    if(s.matches("[1-9]|[1-9][0-9]")){
                        this.age  = Integer.parseInt(s);
                        count++;
                        break;
                    }
            }
        }
    }

    public String toString(){
        return "Студент "+name+" "+age+" лет";
    }
}
