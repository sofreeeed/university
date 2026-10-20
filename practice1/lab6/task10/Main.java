package ru.mirea.lab6.task10;

import ru.mirea.lab5.task2.Shape;

import java.util.InputMismatchException;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Computer cp;
        String len;
        int count = 0;
        int i = 1;
        System.out.print("Введите количество компьютеров, которые хотите собрать: ");
        while (i != 0) {
            len = sc.nextLine();
            try {
                count = Integer.parseInt(len);

                break;
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Введено неправильное число!");
            }
        }
        Shop sh = new Shop(count);
        for (int j = 0; j < count; j++) {
            cp = new Computer();
            sh.add(cp);
        }

        sh.remove();
        sh.search();
    }
}
