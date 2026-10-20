package ru.mirea.practice2.lab13.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        String fullname= sc.nextLine();
        Person pr = new Person(fullname);
        System.out.println(pr);
        char q='q';
        if(q==0){
            System.out.println("хуй");
        }

    }
}
