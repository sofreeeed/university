package ru.mirea.lab3.format.task1;

import java.util.Scanner;
import java.util.Formatter;

public class main {
    public static void main(String[] args){
        int s=1;
        String v;
        int exit=1;
        Scanner sc= new Scanner(System.in);
        Scanner sc2= new Scanner(System.in);
        Formatter fm = new Formatter();
        System.out.println("чтобы завершить конвертацию, напишите 0 в ведение суммы!");
        while(s!=0){
            System.out.print("введите сумму денег в рублях, которую хотите конвертировать: ");
            s = sc.nextInt();
            Convert cv = new Convert(s);
            if(s!=0){
                System.out.print("Введите валюту, в которую вы хотите конвертировать: доллар, евро, тенге :");
                v=sc2.nextLine();
                fm.format("в рублях - %d = в %s - %.2f ", s,v,cv.conv(v));
                System.out.println(fm);
            }
        }
    }
}
