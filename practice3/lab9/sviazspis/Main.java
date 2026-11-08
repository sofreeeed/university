package ru.mirea.practice3.lab9.sviazspis;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        Spisok sp = new Spisok();
        Random rm  = new Random();
        for(int i=0;i<20;i++){
            sp.add(rm.nextInt(100));
        }
        sp.sout();
        sp.sort();
        System.out.println();
        sp.sout();
    }
}
