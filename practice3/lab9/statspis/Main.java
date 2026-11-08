package ru.mirea.practice3.lab9.statspis;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random rm = new Random();
        int[] x = new int[30];
        for(int i=0; i<30; i++){
            x[i] = rm.nextInt(100);
        }
        x = merge.sort(x);
        for(int i=0; i<x.length;i++){
            System.out.print(x[i]+" ");
        }
    }
}
