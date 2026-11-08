package ru.mirea.practice4.lab20.task4;

import java.util.ArrayList;

public class MinMax<N extends Number&Comparable<N>> {
    public ArrayList<N> x = new ArrayList<>();

    public MinMax(ArrayList<N> x){
        this.x = x;
    }

    public N mn(){
        N c=x.get(0);
        for(int i=1;i<x.size();i++){
            if(c.compareTo(x.get(i))>0){
                c=x.get(i);
            }
        }
        return c;
    }

    public N mx(){
        N c = x.get(0);
        for(int i=1;i<x.size();i++){
            if(c.compareTo(x.get(i))<0){
                c=x.get(i);
            }
        }
        return c;
    }
}
