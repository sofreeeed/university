package ru.mirea.lab3.task3;

import java.util.Random;

public class Maasiv {
    private int[] m = new int[4];
    Random rm = new Random();
    private int c=1;

    public Maasiv(){}

    public void creat(){
        for(int i=0;i<4;i++){
            m[i] = rm.nextInt(89)+10;
            System.out.println(m[i]);
        }
        for(int i=0;i<3;i++){
            if(m[i]<m[i+1]){
                c++;
            }
        }
        if(c==4){
            System.out.println("массив сторого возрастающий");
        }
    }
}
