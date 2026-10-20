package ru.mirea.practice2.lab9.task2_3;

public class MergeSort {

    public static Comparable[] merge(Comparable[] x) {
        if (x.length < 2) {
            return x;
        }
        int ind = x.length / 2;
        Comparable[] left = new Comparable[ind];
        Comparable[] right = new Comparable[x.length - ind];
        int pos = 0;
        for (int i = 0; i < left.length; i++) {
            left[i] = x[pos++];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = x[pos++];
        }
        left = merge(left);
        right = merge(right);
        return sort(x,left,right);
    }

    public static Comparable[] sort(Comparable[] x, Comparable[] left, Comparable[] right){
        int i=0,j=0,k=0;
        while(i<left.length && j<right.length){
            if(left[i].compareTo(right[j])<=0){
                x[k++]=left[i++];
            }
            else x[k++] = right[j++];
        }
        while(i<left.length){
            x[k++]=left[i++];
        }
        while(j<right.length){
            x[k++]=right[j++];
        }
        return x;
    }
}
