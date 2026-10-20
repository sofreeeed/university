package ru.mirea.lab3.task4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int i=0;
        System.out.print("Введите размер массива: ");
        while(i==0) {
            Scanner sc = new Scanner(System.in);
            i = sc.nextInt();
            if(i!=0) {
                sc_rm rm = new sc_rm(i);
                rm.creat();
            }
            else System.out.print("Неправильное число! Введите размер массива больше 0: ");
        }
    }
}