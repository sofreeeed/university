package ru.mirea.practice6.lab27.task1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Object x= 1;
        Random rm = new Random();
        hashtab hs = new hashtab();
        Queue qu = new Queue();
        hs.HashInit();
        hs.HashAdd(12,1);
        hs.display();
        System.out.println();
        System.out.println(hs.hashLookUp(12));
        System.out.println();
        hs.hashDelete(12);
        hs.display();
        System.out.println();
        for(int i=0;i<10;i++){
            int key = i;
            hs.HashAdd(key, rm.nextInt(-20,30));
            qu.push((Comparable) hs.hashLookUp(key));
        }
        hs.display();
        System.out.println(qu.pop());
        System.out.println(qu.pop());
        System.out.println(qu.pop());
    }
}
