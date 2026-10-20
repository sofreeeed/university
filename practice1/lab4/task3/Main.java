package ru.mirea.lab4.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean isShop= false;
        String num;
        Clothes cl = new Clothes();
        Catalog[] ct = Catalog.values();
        Scanner sc = new Scanner(System.in);
        Authentication au = new Authentication();
        Tshirt ts  = new Tshirt(cl);
        Pants pn = new Pants(cl);
        while(!au.isAuthen()){
            au.Admin1234();
        }
        System.out.println("В нашем магазине представлены следующие позиции, выберите цирфу позиции:");
        while(!isShop) {
            for(int i = 0; i<Catalog.values().length;i++){
                System.out.println((i+1)+". "+ ct[i]);
            }
            System.out.println("Чтобы выйти завершить покупку нажмите 0");
            num = sc.nextLine();
            if(num.equals("1")){
                pn.catalog();
                }

            else if(num.equals("2")){
                ts.catalog();
            }

            else if(num.equals("0")){
                isShop = true;
            }
            else{
                System.out.println("Введено недопустимое значение");
            }
        }
        cl.display();
        System.out.println("Программа завершена!");
    }
}
