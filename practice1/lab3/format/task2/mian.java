package ru.mirea.lab3.format.task2;

import java.util.Scanner;

public class mian {
    public static void main(String[] args){
        int i = 0;
        String i1 = "";
        Scanner sc  = new Scanner(System.in);

        Convert cv  = new Convert();

        System.out.print("Введите валюту, в которой хотите видеть цены (евро, доллары, рубли): ");
        while(i!=1){
            i1=sc.nextLine();
            if(i1.equals("евро")||i1.equals("доллары")||i1.equals("рубли")){
                cv.Convert_add(i1);
                i=1;
                break;
            }
            else{
                System.out.print("Ошибка валюты.Введите валюту, в которой хотите видеть цены (евро, доллары, рубли): ");
            }

        }
        Shop sh = new Shop(cv);
        while(i!=0 && !sh.isFull()){
            sh.display();
            i=sc.nextInt();
            sh.add(i);
        }
        sh.basket();
    }
}
