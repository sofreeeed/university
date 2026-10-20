package ru.mirea.practice2.lab8.task6;

import java.util.Scanner;

public class isNum {
    public static int Num;
    private  static String  s;
    static Scanner sc = new Scanner(System.in);
    private static int w;
    public isNum(){}
    public static int Num(){
        int c=1;
        while(c==1) {
            System.out.println("Введите число: ");
            s = sc.nextLine();
            try {
                w = Integer.parseInt(s);
                c=0;
                return w;
            } catch (NumberFormatException e) {
                System.out.println("Введено не число!");
            }
        }
        return 0;
    }
}
