package ru.mirea.lab4.task3;

import java.util.Scanner;

public class Authentication {
    Scanner sc  = new Scanner(System.in);
    private String i;
    private int count;

    public Authentication(){}

    public void Admin1234(){
        if(this.count==0) {
            System.out.print("Введите логин: ");
            this.i = sc.nextLine();
            if (i.equals("admin")) {
                this.count++;
            } else {
                System.out.println("Введен неверный логин");
            }
        }
        else{
            System.out.print("Введите пароль: ");
            this.i = sc.nextLine();
            if(i.equals("1234")){
                System.out.println("Пользователь авторизован!");
                this.count++;
            }
        }

    }

    public boolean isAuthen(){
        return this.count==2;
    }

    public String toString(){
        return "ваш логин:  "+ i;
    }
}
