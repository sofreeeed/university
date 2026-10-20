package ru.mirea.practice2.lab9.task2_3;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random rm = new Random();
        Student[] st = new Student[5];

        for(int i=0; i< st.length;i++){
            double ch = (double)rm.nextInt(300,500)/100;
            st[i] = new Student(ch);
            System.out.println(st[i].getSr());
        }

        System.out.println();
        Comparable[] nw = Sort.quicksort(st);
        for(int i=0; i<nw.length; i++){
            System.out.print(nw[i]);
        }
        System.out.println();
        Comparable[] nw1 = MergeSort.merge(st);
        for(int i=0; i<nw1.length; i++){
            System.out.print(nw1[i]);
        }

    }
}
