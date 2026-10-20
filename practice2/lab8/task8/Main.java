package ru.mirea.practice2.lab8.task8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Rec.recursion(s));
    }
}
