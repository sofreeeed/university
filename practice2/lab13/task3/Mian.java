package ru.mirea.practice2.lab13.task3;

import java.util.Scanner;

public class Mian {
    public static void main(){
        Scanner sc =  new Scanner(System.in);
        Adress ad1 = new Adress("Россия, Москва, проспект Вернадского, 78, 4");
        ad1.splited();
        System.out.println(ad1);
        Adress ad2 = new Adress("Россия/Москва/проспект Вернадского/86/6");
        ad2.token();
        System.out.println(ad2);
        Adress ad3 = new Adress("Россия.Москва.Стромынка.86.6");
        ad3.token();
        System.out.println(ad3);
    }
}
