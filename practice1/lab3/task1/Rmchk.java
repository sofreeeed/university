package ru.mirea.lab3.task1;

import java.util.Random;

public class Rmchk {
    private double[] m;
    Random rm = new Random();

    public Rmchk(int n){
        this.m = new double[n];
    }

    public void creat(){
        for(int i=0; i<m.length; i++){
            if(i%2==0){
                m[i]=rm.nextDouble();
            }
            else{
                m[i] = Math.random();
            }
        }
        for(int i=0; i<m.length;i++){
            System.out.print(m[i]+" ");
        }
    }

    public void sort(){
        int  c=1;
        double x;
        while(c!=0){
            c=0;
            for(int i=0;i<(m.length-1);i++){
                if(m[i]>m[i+1]){
                    x=m[i];
                    m[i]=m[i+1];
                    m[i+1]=x;
                    c=1;
                }
            }
        }
        for(int i=0; i<m.length;i++){
            System.out.print(m[i]+" ");
        }
    }




}
