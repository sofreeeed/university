package ru.mirea.lab3.task4;

import java.util.concurrent.ThreadLocalRandom;

public class sc_rm {
    private int n;
    private int[] m1;
    private int[] m2;
    private int count=0;
    private int q;

    public sc_rm(int n){
        this.n=n;
        this.m1 = new int[n];
        this.m2=new int[n];
    }

    public void creat(){
        for(int i=0; i<m1.length; i++) {
            q= ThreadLocalRandom.current().nextInt(100);
            m1[i]=q;
            if (m1[i] % 2 == 0) {
                m2[count]=q;
                count++;
            }
            System.out.print(m1[i]+" ");
        }
        if (count!=0){
            System.out.println();
            for(int i=0; i<count;i++) {
                System.out.print(m2[i] + " ");
            }
        }
        else System.out.println("\nчетных чисел нет");
    }
}


