package ru.mirea.practice2.lab8.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        rec rc = new rec();
        System.out.print("Введите первое число");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(rec.recursion(x,y));
    }
}
