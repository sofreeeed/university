package ru.mirea.lab4.tpart2.task7;

public class Main {
    public static void main(String[] args){
        Student[] st = new Student[]{new Stu("Ivan"),new Uch("Dima")};
        for(Student i: st){
            System.out.println(i);
        }
    }
}
