package ru.mirea.practice2.lab8.task4;

public class Rec {

    public static int recur(int n) {
        if(n<=10){
            return n;
        }
        return n%10+recur(n/10);
    }

    public static void recursion(int k, int s) {
        int mn = (int) Math.pow(10, k - 1);
        int max = (int) Math.pow(10, k);
        int count=0;
        for (int i = mn; i < (max + 1); i++) {
            if(recur(i)==s){
                count++;
            }
        }
        System.out.println("Чисел которые = "+s+ " - "+count);
    }
}
