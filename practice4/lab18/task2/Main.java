package ru.mirea.practice4.lab18.task2;

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
        }catch(NumberFormatException e){
            System.out.println("Ошибка ввода");
        }catch (ArithmeticException e){
            System.out.println("деление на ноль");
        }
    }
}
