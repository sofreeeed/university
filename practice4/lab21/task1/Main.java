package ru.mirea.practice4.lab21.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> in = new ArrayList<>();
        Integer[] x  ={1,2,3,4,5};
        spisok.Array(x,in);
        System.out.println(in);

        ArrayList<String> str = new ArrayList<>();
        String[] st = {"qwe", "123"};
        spisok.Array(st,str);
        System.out.println(str);
    }
}
