package ru.mirea.lab7.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        LenChet lc = new Str();
        Scanner sc  = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String strng = sc.nextLine();
        lc.chetlen(strng);
        lc.nechet();
        lc.reserve();
    }
}
