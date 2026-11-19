package ru.mirea.practice4.lab18.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        exceptionDemo();
    }
    public static void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }catch(Exception e) {
            System.out.println("Ошибка ввода");
        }
    }
}
