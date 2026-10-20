package ru.mirea.practice2.lab8.task9;

public class Rec {
    public static int recursion(int a, int b){
        if(a-b>1){
            return 0;
        }
        return factorial(b+1)/(factorial(a)*factorial(b+1-a));
    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);

    }
}
