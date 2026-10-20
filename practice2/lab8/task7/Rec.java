package ru.mirea.practice2.lab8.task7;

public class Rec {
    private static int count=1;
    public static String recursion(int n) {
        count++;
        if (n <= 1) {
            return "";
        }
        if(n%count==0) {
            return check(count, 2);
        }
        return recursion(n);
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
