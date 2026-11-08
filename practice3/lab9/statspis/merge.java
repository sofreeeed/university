package ru.mirea.practice3.lab9.statspis;

public class merge {
    public static int[] sort(int[] x){
        if(x.length<2){
            return x;
        }
        int len  = x.length/2;
        int[] left = new int[len];
        int[] right = new int[x.length-len];
        int pos=0;
        for(int i=0;i<len;i++){
            left[i] = x[pos++];
        }
        for(int i=0;i<x.length-len;i++){
            right[i] = x[pos++];
        }
        left = sort(left);
        right = sort(right);
        return sorting(x,left,right);
    }

    public static int[] sorting(int[] x, int[] left, int[] right){
        int i=0, j=0, pos=0;
        while((i<left.length) && (j<right.length)) {
            if (left[i] < right[j]) {
                x[pos++] = left[i++];
            } else x[pos++] = right[j++];
        }
        while(i<left.length){
            x[pos++] = left[i++];
        }
        while(j<right.length){
            x[pos++] = right[j++];
        }
        return x;

    }
}
