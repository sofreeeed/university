package ru.mirea.practice2.lab9.task1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rm = new Random();
        Student[] st = new Student[5];

        for (int i = 0; i < st.length; i++) {
            st[i] = new Student(rm.nextInt(10, 1000));
            System.out.println(st[i].getIdNumber());
        }
        System.out.println();
        Sort.vstvki(st);
        for(int i = 0; i<st.length; i++){
            System.out.println(st[i].getIdNumber());
        }
    }

}
