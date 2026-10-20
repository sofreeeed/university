package ru.mirea.practice2.lab8.task2;

public class rec {
    public static int recursion(int n) {
        if (n == 1) {
            System.out.println(n);
            return 1;
        }
        System.out.println(n);
        return recursion(n - 1) + 1;
    }
}
