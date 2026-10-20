package ru.mirea.lab3.task1;

import java.util.Random;

public class main {
    public static void main(String[] args){
        Random rm  = new Random();
        int n = rm.nextInt(7)+1;
        Rmchk rmc = new Rmchk(n);

        System.out.println("Массив создан!: ");
        rmc.creat();
        System.out.println("\nМассив отсортирован!: ");
        rmc.sort();


    }
}
