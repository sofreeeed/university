package ru.mirea.practice2.lab13.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        boolean isWork = false;
        while(!isWork){
            if(number.matches("\\+\\d{11}$")||(number.matches("\\d{11}$"))) {
                if(number.matches("\\+\\d{11}$")){
                    System.out.println(number.substring(0,2)+" "+number.substring(2,5)+" "+number.substring(5,8)+" "+number.substring(8, number.length()));
                }
                else System.out.println(number.substring(0,1)+" "+number.substring(1,4)+" "+number.substring(4,7)+" "+number.substring(7, number.length()));
                isWork = true;
            }
        }
    }
}
