package ru.mirea.practice2.lab9.task2_3;

public class Sort {
    public static Comparable[] quicksort(Comparable[] x){
        int count1=0;
        int count2=0;
        int count3=0;
        if(x.length<=1){
            return x;
        }
        Comparable index;
        index = x[x.length/2];
        for(int i=0; i<x.length;i++){
            if(x[i].compareTo(index)>0){
                count1++;
            }
            if(x[i].compareTo(index)<0){
                count3++;
            }
            if(x[i].compareTo(index)==0){
                count2++;
            }
        }
        Comparable[] left = new Comparable[count1];
        Comparable[] right= new Comparable[count3];
        Comparable[] middle=new Comparable[count2];
        count1=0;
        for(int i = 0; i<x.length;i++){
            if(x[i].compareTo(index)>0){
                left[count1] =x[i];
                count1++;
            }
        }
        count2=0;
        for(int i = 0; i<x.length;i++){
            if(x[i].compareTo(index)==0){
                middle[count2] =x[i];
                count2++;
            }
        }
        count3=0;
        for(int i = 0; i<x.length;i++){
            if(x[i].compareTo(index)<0){
                right[count3] =x[i];
                count3++;
            }
        }
        quicksort(left);
        quicksort(right);
        Comparable[] y = new Comparable[x.length];
        int pos=0;
        for(int i=0; i<left.length; i++){
                y[pos++] = left[i];
        }
        for(int i= 0; i< middle.length; i++){
            y[pos++] = middle[i];
        }
        for(int i= 0; i< right.length; i++){
            y[pos++] = right[i];
        }
        return y;
    }
}
