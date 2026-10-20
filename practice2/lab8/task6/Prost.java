package ru.mirea.practice2.lab8.task6;

public class Prost {
    private static int del=2;
    public static String recursion(int n){
        if(n<=1){
            return "";
        }
        return check(n,2);
    }

    private static String  check(int n, int d){
        if(d*d>n){
            return n+" ";
        }
        if(n%d==0){
            return "";
        }
        return check(n, d+1);

    }
}
