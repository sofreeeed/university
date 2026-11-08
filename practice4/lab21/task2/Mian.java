package ru.mirea.practice4.lab21.task2;

public class Mian {
    public static void main(String[] args) {
        Array arr = new Array();
        int x =1;
        String s= "qwerty";
        double q =1.2;
        long y = 1234562332;
        arr.add(y);
        arr.add(q);
        arr.add(s);
        arr.add(x);
        arr.display();
        System.out.println();
        System.out.println(arr.display_index(2));
    }
}
