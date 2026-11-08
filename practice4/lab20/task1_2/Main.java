package ru.mirea.practice4.lab20.task1_2;

public class Main {
    public static void main(String[] args){
        int x = 123;
        double y = 1.3;
        String z = "qwert";
        var any1 = new Any<>(x,y,z);
        System.out.println(any1);
        var any2 = new Any<>(z,x,y);
        System.out.println(any2);
    }
}
