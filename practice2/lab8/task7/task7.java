package ru.mirea.practice2.lab8.task7;

public class task7 {
    public static String rec(int n, int d) {
        if(n<d*d){
            return "";
        }
        if (n % d == 0) {
            return check(d,2)+" "+rec(n, d+1);
        }
        return rec(n, d+1);
    }

    public static String check(int i, int q){
        if(q*q>i){
            return i+"";
        }
        if(i%q==0) return "";
        return check(i,q+1);
    }
}